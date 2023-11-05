import redis.clients.jedis.Jedis;

import java.util.Random;


public class Main {

    public static Random random = new Random();
    public static Jedis jedis = new Jedis();

    private static final String KEY = "mylist";
    public static int currentUserID;
    public static int paidUserID;
    public static int counter = 0;

    public static void main(String[] args) {

        while (true) {
            currentUserID = Integer.parseInt(jedis.lpop(KEY));
            printAndRemoveUserID(currentUserID, false);
            counter++;

            if (counter == 10) {
                paidUserID = random.nextInt(1, 20);
                jedis.lpush(KEY, String.valueOf(paidUserID));
                System.out.println("Пользователь " + paidUserID + " оплатил");
                printAndRemoveUserID(paidUserID, true);
                counter = 0;
            }
        }
    }

    public static void printAndRemoveUserID (int userID, boolean paid) {
        System.out.println("Показываем пользователя - " + userID);
        if (paid) {
            jedis.lpop(KEY);
        } else {
            jedis.rpush(KEY, String.valueOf(userID));
        }
    }
}
