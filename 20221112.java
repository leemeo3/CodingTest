import java.util.Scanner;

public class NumberBaseball {
    public static void main(String[] args) {
        // 총 기회
        int count = 10;
        // 실행 횟수
        int play = 0;

        // 랜덤 숫자 3개 생성
        int randomNumber1 = (int) (Math.random() * 10);
        int randomNumber2 = (int) (Math.random() * 10);
        int randomNumber3 = (int) (Math.random() * 10);

        // 카운트
        int strike = 0;
        int ball = 0;
        int out = 0;

        // 랜덤 숫자 중복의 경우 제거
        while (true) {
            if (randomNumber1 == randomNumber2 || randomNumber1 == randomNumber3 || randomNumber2 == randomNumber3) {
                randomNumber1 = (int) (Math.random() * 10);
                randomNumber2 = (int) (Math.random() * 10);
                randomNumber3 = (int) (Math.random() * 10);
                continue;
            }
            break;
        }
        // 랜덤 숫자 중복의 경우 제거 -- 종료

        // 정답 출력 (속닥속닥)
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);


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
            if (randomNumber1 == inputNumber1) {
                strike++;
            } else if (randomNumber1 == inputNumber2 || randomNumber1 == inputNumber3) {
                ball++;
            } else {
                out++;
            }
            //두번째 숫자 검사
            if (randomNumber2 == inputNumber2) {
                strike++;
            } else if (randomNumber2 == inputNumber1 || randomNumber2 == inputNumber3) {
                ball++;
            } else {
                out++;
            }
            // 세번째 숫자 검사
            if (randomNumber3 == inputNumber3) {
                strike++;
            } else if (randomNumber3 == inputNumber1 || randomNumber3 == inputNumber2) {
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

            if (strike == 3) {
                System.out.println("정답입니다 !!!!");
                break;
            }

            // play 카운트 1증가
            play++;
            System.out.println((count - play) + "회 남았습니다.");

            // 실행 횟수와 총 횟수 같을시 게임 종료
            if (play == count) {
                System.out.println("게임이 종료되었습니다.");
                System.out.print("정답은 ");
                System.out.print(randomNumber1 + " ");
                System.out.print(randomNumber2 + " ");
                System.out.print(randomNumber3 + " ");
                System.out.print("이었습니다.");
                System.out.println();
                break;
            }
        }
        // 게임 실행 반복 -- 종료
    }
}

