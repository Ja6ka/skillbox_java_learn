public class Main {

  public static void main(String[] args) {
    Container container = new Container();
    container.count += 7843;

    Integer number = 999999568;
    int sum = sumDigits(number);
    do {
        sum = sumDigits(sum);
    } while (sum >9);
    System.out.println(sum);
  }

  /* Реализуйте метод sumDigits который возвращает сумму цифр числа, пример:
  передано 12345, метод должен вернуть 15
  если передано null, то должен вернуть -1

  Запустите тесты TestSumDigits для проверки корректности работы метода

  не меняйте название метода, его возвращаемое значение и модификаторы доступа (public).
  В противном случае тестовый метод не сможет проверить ваш код
   */

  public static int sumDigits(Integer number) {
    String numberString = Integer.toString(number);
    String [] a = numberString.split("");
    int sum = 0;
         for (int i =0; i< a.length; i++) {
             sum+=Integer.parseInt(a[i]);
     }
     return sum;
  }


}
