class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"));
        // car.passegenger = 4;
        uberX.setPassenger(4);
        uberX.printDataCar();
    }
}