import vehicle.Bus;

public class Main {

    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();

        bus1.addPassenger(2);;

        bus1.updateStatus("차고지행");

        bus1.updateOilRemain(-50);

        bus1.updateOilRemain(10);

        bus1.updateStatus("운행중");

        bus1.addPassenger(45);

        bus1.addPassenger(5);

        bus1.updateOilRemain(-55);
    }
}
