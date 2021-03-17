public class Main {
    public static void main(String[] args) {
        Printer hpLaserJet = new Printer();
        hpLaserJet.append("На лукоморье дуб зелёный...");
        hpLaserJet.append("К оплате 2847 рублей, из них: " + System.lineSeparator() + "За горячую воду: 1953" +
                System.lineSeparator() + "За холодную воду: 894", "Счёт за коммунальные услуги");
        hpLaserJet.append("01110011101101111000101010011010101110101010010101", "ДНК кролика в двоичном коде",
                13);
        hpLaserJet.print();
        hpLaserJet.printCount();
        hpLaserJet.append("Буль-буль-буль-буль-буль-буль-буль-буль-буль-буль-буль-буль-буль на 2478 страниц",
                "Очень популярная книга",
                2478);
        hpLaserJet.print();
        hpLaserJet.printCount();
    }
}
