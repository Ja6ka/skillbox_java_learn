public class Main {

    public static void main(String[] args) {
        Cargo phone = new Cargo(
                true,
                true,
                300,
                "178593GH",
                "4-th Road, 36th building, flat 353, 7640003, Washington, Washington DC"
        );

        Cargo copy = new Cargo(
                phone.isFragile(),
                phone.canBeFlipped(),
                325,
                phone.getPackageNumber(),
                phone.getDeliveryAddress()
        );
        phone.print();
        copy.print();
        Dimensions phoneDimensions = new Dimensions(10, 15, 20);
        System.out.println(phoneDimensions.getHeight());
        phoneDimensions.setHeight(25);
        System.out.println(phoneDimensions.setHeight(25).getHeight() + " " + phoneDimensions.getHeight());
    }
}
