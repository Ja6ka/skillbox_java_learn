import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/skillbox";
        String user = "root";
        String password = "Nifedowplay322";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement courseListStatement = connection.createStatement();
            Statement buyCountStatement = connection.createStatement();
            Statement monthRangeStatement = connection.createStatement();

            ResultSet courseList = courseListStatement
                    .executeQuery("SELECT DISTINCT pl.course_name `Name` FROM PurchaseList pl");

            while (courseList.next()) {
                String courseName = courseList.getString("Name");

                ResultSet buyCountSet = buyCountStatement.executeQuery("SELECT COUNT(*) `Count` " +
                        "FROM PurchaseList  " +
                        "WHERE course_name = \"" +
                        courseName + "\"");

                ResultSet monthRangeSet = monthRangeStatement.executeQuery("SELECT (\n" +
                        "(SELECT MONTH (pl.subscription_date) `Month` " +
                        "FROM PurchaseList pl WHERE pl.course_name = \"" +
                        courseName +
                        "\" ORDER BY `Month` DESC LIMIT 1)\n" +
                        "-\n" +
                        "(SELECT MONTH (pl.subscription_date) `Month` " +
                        "FROM PurchaseList pl WHERE pl.course_name = \"" +
                        courseName +
                        "\" ORDER BY `Month` ASC LIMIT 1) + 1) `MonthRange`");

                buyCountSet.next();
                monthRangeSet.next();

                double buyCount = buyCountSet.getInt("Count");
                double monthRange = monthRangeSet.getInt("MonthRange");

                System.out.println("Для курса \"" + courseName + "\" среднее количество покупок за 2018 год составило: " + buyCount / monthRange);
            }
            courseListStatement.close();
            buyCountStatement.close();
            monthRangeStatement.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
