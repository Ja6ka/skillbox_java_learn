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
            currentUserID = Integer.parseInt(jedis.rpop(KEY));
            System.out.println("Показываем пользователя - " + currentUserID);
            jedis.lpush(KEY, String.valueOf(currentUserID));
            counter++;

            if (counter == 10) {
                paidUserID = random.nextInt(1, 20);
                jedis.rpush(KEY, String.valueOf(paidUserID));
                System.out.println("Пользователь " + paidUserID + " оплатил");
                System.out.println("Показываем пользователя - " + paidUserID);
                jedis.rpop(KEY);
                counter = 0;
            }
        }
    }
}
