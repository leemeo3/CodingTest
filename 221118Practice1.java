public class test13 {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 2;
        double var3 = (double)var1 / (double)var2; //double형으로 변환을 해주고 나눠야 2.5가 출력이 됩니다 int형으로 나누면은 정수값만 출력되기에 2가 출력이 됩니다
        System.out.println(var3);
        int var4 = (int)(var3 * var2);
        System.out.println(var4); // 결과값 5
      
        int x=10;
        int y=20;
//        int z = (++x) + (y--); // 증감연산자의 수행순서는 오른쪽에서 왼쪽 이므로
        System.out.println(++x); // 수행하기전 이미 + 가 되었음 출력값 10 + 1;
        System.out.println(x); // 출력값 11;
        System.out.println(y--); // 수행하고 난 이후 -가 되었음 출력값 20;
        System.out.println(y); // 출력값 20 - 1 = 19;
//        System.out.println(z);
      
      while (true) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            int diceSum = dice1 + dice2;

            if (diceSum == 5) {
                System.out.println("============================");
                System.out.println("(" + dice1 + "," + dice2 +")");
                System.out.println("============================");
                break;
            }
            System.out.println("(" + dice1 + "," + dice2 +")");
        }
    }
}
