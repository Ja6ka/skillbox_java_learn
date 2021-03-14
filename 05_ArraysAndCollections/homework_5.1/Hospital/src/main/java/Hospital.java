import java.util.Arrays;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        float[] temperatures = new float[patientsCount];
        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = (float) Math.round((32 + Math.random() * 8) * 10) / 10;
        }
        return temperatures;
    }

    public static String getReport(float[] temperatureData) {

        float averageTemperature = 0;
        for (float temperatureDatum : temperatureData) {
            averageTemperature += temperatureDatum;
        }
        averageTemperature = averageTemperature / temperatureData.length;
        averageTemperature = (float) Math.round(averageTemperature * 100) / 100;

        int healthCount = 0;
        for (float temperatureDatum : temperatureData) {
            if (temperatureDatum >= 36.2 && temperatureDatum <= 37) {
                healthCount++;
            }
        }

        StringBuilder allTemperatures = new StringBuilder();
        for (float temperature : temperatureData) {
            allTemperatures.append(temperature).append(" ");
        }

        String report =
                "Температуры пациентов: " + allTemperatures.toString().trim() +
                        "\nСредняя температура: " + averageTemperature +
                        "\nКоличество здоровых: " + healthCount;

        return report;
    }
}
