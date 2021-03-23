public class Cargo {

    private final boolean IS_FRAGILE;
    private final boolean CAN_BE_FLIPPED;
    private final int MASS;
    private final String PACKAGE_NUMBER;
    private final String DELIVERY_ADDRESS;

    public Cargo(boolean IS_FRAGILE, boolean CAN_BE_FLIPPED, int MASS, String PACKAGE_NUMBER, String DELIVERY_ADDRESS) {
        this.IS_FRAGILE = IS_FRAGILE;
        this.CAN_BE_FLIPPED = CAN_BE_FLIPPED;
        this.MASS = MASS;
        this.PACKAGE_NUMBER = PACKAGE_NUMBER;
        this.DELIVERY_ADDRESS = DELIVERY_ADDRESS;
    }

    public boolean isFragile() {
        return IS_FRAGILE;
    }

    public Cargo setFragile(boolean IS_FRAGILE) {
        return  new Cargo(IS_FRAGILE, CAN_BE_FLIPPED, MASS, PACKAGE_NUMBER, DELIVERY_ADDRESS);
    }

    public boolean canBeFlipped() {
        return CAN_BE_FLIPPED;
    }

    public Cargo setCanBeFlipped(boolean CAN_BE_FLIPPED) {
        return  new Cargo(IS_FRAGILE, CAN_BE_FLIPPED, MASS, PACKAGE_NUMBER, DELIVERY_ADDRESS);
    }

    public int getMass() {
        return MASS;
    }

    public Cargo setMass(int MASS) {
        return  new Cargo(IS_FRAGILE, CAN_BE_FLIPPED, MASS, PACKAGE_NUMBER, DELIVERY_ADDRESS);
    }

    public String getPackageNumber() {
        return PACKAGE_NUMBER;
    }

    public Cargo setPackageNumber(String PACKAGE_NUMBER) {
        return  new Cargo(IS_FRAGILE, CAN_BE_FLIPPED, MASS, PACKAGE_NUMBER, DELIVERY_ADDRESS);
    }

    public String getDeliveryAddress() {
        return DELIVERY_ADDRESS;
    }

    public Cargo setDeliveryAddress(String DELIVERY_ADDRESS) {
        return  new Cargo(IS_FRAGILE, CAN_BE_FLIPPED, MASS, PACKAGE_NUMBER, DELIVERY_ADDRESS);
    }

    public void print () {
        System.out.println(IS_FRAGILE + " " + CAN_BE_FLIPPED + " " + MASS + " " + PACKAGE_NUMBER + " " + DELIVERY_ADDRESS);
    }
}
