public class test12 {
    public static void main(String[] args) {
        int n = 15;     // 주어진 반복 일반 10진법 숫자가 도달해야할 숫자
        int answer = 0; // 마을 사람들이 쓰는 숫자 (town)
        int cnt = 1;    // 일반 10진법 숫자
        boolean check = false; // while문을 반복시키기위한 boolean값 선언
        String numstr = ""; // (town)에 3이 포함되는지 확인하기 위한 문자열

        while (true) {
            check = false; // boolean값 초기화

            if (answer % 3 == 0) {  // (town)이 3의 배수인지 확인
                answer++;           //  3의 배수이면 (town) +1;
                continue;           // continue에 따라 10행으로 이동
            }                       // (town)이 3의 배수가 아닐시 if문 탈출
            numstr = String.valueOf(answer);    // 현재(town) 문자열에 삽입

            if (numstr.contains("3")) { // 문자열에 3이 포함하고 있는지 확인
                answer++;               // 3을 포함하고 있을 경우 (town) +1
                check = true;           // 3이 포함되었기에 +1을 해줬고 다시 3의 배수인지 여부를 고려해봐야하기때문에
                                        // boolean값을 true로 바꾼후 아래 행에서 while문을 반복시킴
                                        // 29행과 30행에는 도달하지 못할 것이고 이런 방식으로 30~39의 문제를 해결
            }

            if (check) continue;    // check가 20행에서 true가 됐으므로 다시 10행으로 이동

            if (cnt == n) break;    // 일반 10진법 숫자가 n과 같으면 while문 종료

            answer++;               // n과 같지않으면 (town)과 일반 10진법 숫자 + 1
            cnt++;
        }
        System.out.println(cnt);
        System.out.println(answer);
    }
}
