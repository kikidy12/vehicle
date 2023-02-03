package vehicle;

public abstract class Vehicle {

    // 버스 번호
    Integer number;


    // 최대 탑승가능 고객 수
    Integer maxPassenger;
    // 가격
    Integer price;

    //충 수익
    Integer totalRevenue;

    // 남은 주유량
    Double oliRemain;

    //속도
    Double speed;

    // 운행 상태
    String status;

    public Vehicle(Integer maxPassenger, Integer price, Double oliRemain, String status) {
        this.maxPassenger = maxPassenger;
        this.price = price;
        this.oliRemain = oliRemain;
        this.status = status;
        this.totalRevenue = 0;
        this.speed = 0.0;
    }

    public void operateStart(){
        //운행
    }
    public void updateStatus(String status){
        this.status = status;
        System.out.println("상태 : " + this.status);
    }

    public abstract void addPassenger(int count);

    public abstract void resetPassenger();

    public abstract void updateSpeed(double speed);

    public abstract void updateOilRemain(double oil);
}