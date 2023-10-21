import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class XMLHandler extends DefaultHandler {

    private int count = 0;
    private final int limit = 250000;
    private Voter voter;
    private static SimpleDateFormat birthDayFormat = new SimpleDateFormat("yyyy.MM.dd");
    private HashMap<Voter, Integer> voterCounts;

    public XMLHandler() {
        voterCounts = new HashMap<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        try {
            if (qName.equals("voter") && voter == null) {
                Date birthDayDate = birthDayFormat.parse(attributes.getValue("birthDay"));
                String birthDay = attributes.getValue("birthDay");
                String name = attributes.getValue("name");
                voter = new Voter(name, birthDayDate);
                DBConnection.countVoter(name, birthDay);
            } else if (qName.equals("visit") && voter != null) {
                int count = voterCounts.getOrDefault(voter, 0);
                voterCounts.put(voter, count + 1);
            }
        } catch (ParseException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("voter")) {
            voter = null;
            count++;
            if (count > limit) {
                try {
                    DBConnection.executeMultiInsert();
                    DBConnection.cleanMultiInsert();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                count = 0;
            }
        }
    }
}
