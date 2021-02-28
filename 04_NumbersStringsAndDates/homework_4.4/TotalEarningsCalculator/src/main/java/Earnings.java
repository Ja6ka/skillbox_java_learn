import java.util.Arrays;

public class Earnings {

  public static void main(String[] args) {
    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

    int a = text.trim().indexOf('л', 10);
    int b = text.trim().lastIndexOf('р', 22);
    String vasya = text.trim().substring(a + 1, b - 1);

    int c = text.trim().indexOf('-', 10);
    int d = text.trim().lastIndexOf('р', 50);
    String petya = text.trim().substring(c + 1, d - 1);

    int e = text.trim().lastIndexOf(' ', 57);
    int f = text.trim().lastIndexOf('р', 70);

    String masha = text.trim().substring(e + 1, f - 1);
    System.out.println(Integer.parseInt(vasya.trim()) + Integer.parseInt(petya.trim()) + Integer.parseInt(masha.trim()));
  }
}



