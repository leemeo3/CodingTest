import java.util.Scanner;

public class NumberBaseball {
    public static void main(String[] args) {
        // 총 기회
        int count = 10;
        // 실행 횟수
        int play = 0;

        // 랜덤 숫자 3개 생성
        int radomNumber1 = (int) (Math.random() * 10);
        int radomNumber2 = (int) (Math.random() * 10);
        int radomNumber3 = (int) (Math.random() * 10);

        // 카운트
        int strike = 0;
        int ball = 0;
        int out = 0;

        // 랜덤 숫자 중복의 경우 제거
        while (true) {
            if (radomNumber1 == radomNumber2 || radomNumber1 == radomNumber3 || radomNumber2 == radomNumber3) {
                radomNumber1 = (int) (Math.random() * 10);
                radomNumber2 = (int) (Math.random() * 10);
                radomNumber3 = (int) (Math.random() * 10);
                continue;
            }
            break;
        }
        // 랜덤 숫자 중복의 경우 제거 -- 종료

        // 정답 출력 (속닥속닥)
        System.out.println(radomNumber1);
        System.out.println(radomNumber2);
        System.out.println(radomNumber3);

        // 임의의 숫자 입력
        Scanner sc = new Scanner(System.in);
        int inputNumber1 = 0;
        int inputNumber2 = 0;
        int inputNumber3 = 0;

        // 게임 실행 반복
        while (true) {
            // 반복시 카운트 초기화
            strike = 0;
            ball = 0;
            out = 0;

            // 임의의 숫자 중복 제거
            while (true) {
                System.out.println("================================");
                System.out.println("3개의 숫자를 중복 없이 입력해주세요.");
                System.out.print("첫번째 숫자 : ");
                inputNumber1 = sc.nextInt();
                System.out.print("두번째 숫자 : ");
                inputNumber2 = sc.nextInt();
                System.out.print("세번째 숫자 : ");
                inputNumber3 = sc.nextInt();
                System.out.println("================================");

                // 10 이상의 숫자 제거
                if (inputNumber1 >= 10 || inputNumber2 >= 10 || inputNumber3 >= 10) {
                    System.out.println("10미만의 숫자를 입력해주세요.");
                    System.out.println((count - play) + "회 남았습니다.");
                    continue;
                }

                // 0미만의 숫자 제거
                if (inputNumber1 <= -1 || inputNumber2 <= -1 || inputNumber3 <= -1) {
                    System.out.println("0이상의 숫자를 입력해주세요.");
                    System.out.println((count - play) + "회 남았습니다.");
                    continue;
                }

                // 임의의 숫자 중복 제거
                if (inputNumber1 == inputNumber2 || inputNumber1 == inputNumber3 || inputNumber2 == inputNumber3) {
                    System.out.println("중복이 발견되었습니다. 다시 입력해주세요.");
                    System.out.println((count - play) + "회 남았습니다.");
                    continue;
                }
                break;
            }
            // 임의의 숫자 중복 제거 -- 종료

            // 첫번째 숫자 검사
            if (radomNumber1 == inputNumber1) {
                strike++;
            } else if (radomNumber1 == inputNumber2 || radomNumber1 == inputNumber3) {
                ball++;
            } else {
                out++;
            }
            //두번째 숫자 검사
            if (radomNumber2 == inputNumber2) {
                strike++;
            } else if (radomNumber2 == inputNumber1 || radomNumber2 == inputNumber3) {
                ball++;
            } else {
                out++;
            }
            // 세번째 숫자 검사
            if (radomNumber3 == inputNumber3) {
                strike++;
            } else if (radomNumber3 == inputNumber1 || radomNumber3 == inputNumber2) {
                ball++;
            } else {
                out++;
            }
            // 숫자 검사 종료

            // 결과 출력
            System.out.print(strike + "S ");
            System.out.print(ball + "B ");
            System.out.print(out + "Out");
            System.out.println();

            // play 카운트 1증가
            play++;
            System.out.println((count - play) + "회 남았습니다.");

            // 실행 횟수와 총 횟수 같을시 게임 종료
            if (play == count) {
                break;
            }
        }
        // 게임 실행 반복 -- 종료
    }
} 

