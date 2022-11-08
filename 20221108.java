//프로그래머스 - 코딩테스트입문 - 연속된 수의 합


class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num]; // num의 길이만큼 배열 초기화
        int value = -1000;          // total값의 범위가 1000까지이기에 임의로 지정
        int result = -1000;         // total값이 0일 경우에 대한 예외처리를 위해 임의로 지정 ex) num = 3; total = 0; --> {-1,0,1}
        
        if(num == 1) {
            answer[0] = total;  // 길이가 1일 경우 total값이 정답임
            return answer;
        }
        
        while (!(result == total)) {    // result 값과 total값이 같아지면 while문 종료
            result = 0;                 // while문을 지나왔으므로 다시 result값 0으로 초기화
            value++;                    // 다시 while문을 돌리기위해 1씩 증가                    
            for (int i = 0; i < num; i++) {
                result += value + i;    // result에 값을 num번을 반복하고 value값을 1씩 증가하며 넣은 후 total값과 비교
            }
        }
        
        for (int i = 0; i < num; i++) {
            answer[i] = value;
            value++;
        }
        
        return answer;
    }
}
