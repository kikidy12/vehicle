package vehicle;

public class Bus extends Vehicle {

    public static int busCount;

    public int currentPassenger;

    public Bus() {
        super(30, 1000, 100.0, "운행중");
        this.number = ++busCount;
        this.currentPassenger = 0;
        System.out.println(this.number + "번 버스객체 만들어짐!");
    }

    @Override
    public void addPassenger(int count) {
        if (this.currentPassenger + count > this.maxPassenger) {
            System.out.println("최대 승객 수를 초과습니다.");
            return;
        }
        this.currentPassenger += count;
        System.out.println("탑승 승객 수 : " + this.currentPassenger);
        int remainSeat = this.maxPassenger - currentPassenger;
        System.out.println("잔여 승객 수 : " + remainSeat);
        int currentRevenue = count * this.price;
        this.totalRevenue += currentRevenue;
        System.out.println("요금확인 : " + currentRevenue);
    }

    @Override
    public void resetPassenger() {
        this.currentPassenger = 0;
    }

    @Override
    public void updateStatus(String status) {
        super.updateStatus(status);
        if (status.equals("차고지행")) {
            this.resetPassenger();
        }
    }

    @Override
    public void updateSpeed(double speed) {
        if (oliRemain <= 10) {

        }
        this.speed = speed;
    }

    @Override
    public void updateOilRemain(double oil) {
        this.oliRemain += oil;

        System.out.println("주유량 : " + this.oliRemain);
        if (this.oliRemain <= 10){
            this.updateStatus("차고지행");
            System.out.println("주유가 필요합니다.");
        }
    }
}
