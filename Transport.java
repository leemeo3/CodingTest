public class Transport {
    int number;
    int oil = 100;
    int speed = 0;

    public void startDriving() {
        boolean status = true;
        System.out.println("운행을 시작합니다");
        System.out.println("현재 주유량 = " + oil);
    }

    public void stopDriving() {
        boolean status = false;
        System.out.println("운행을 종료합니다");
        System.out.println("남은 주유량 = " + oil);
    }

    public void currentSpeed() {
        System.out.println("현재속도 = " + this.speed);
    }

    public void transferSpeed(int speed) {
        System.out.println("현재속도 = " + this.speed);
        this.speed += speed;
        System.out.println("올라간 속도 = " + this.speed);
    }


    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();
        bus.inPassenger(2);
        bus.setOil(-50);
        bus.setCondition("차고지행");
        bus.setOil(10);
//        bus.inPassenger(45); 최대 승객 수 초과
        bus.inPassenger(5);
        bus.inPassenger(5);
//        bus.setOil(-55); 주유 필요
        taxi.inPassenger(2, "서울역", 2);
        taxi.setOil(-80);
        taxi.pay();
//        taxi.inPassenger(5, "서울역", 2); 최대 승객 수 초과
        taxi.inPassenger(3, "구로디지털단지역", 12);
//        taxi.setOil(-20); 주요 필요
    }
}
