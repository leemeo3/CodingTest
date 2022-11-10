//등차수열 등비수열 공식을 알면은 해결할 수 있는 문제

class Solution {
    public int solution(int[] common) {
        int answer = 0;
        // 등차수열일 경우 둘째항 - 첫째항 == 셋째항 - 둘째항 ==> 공차
        // 등비수열일 경우 둘째항 / 첫째항 == 셋째항 / 둘째항 ==> 공비
        
        // 등차수열인지 등비수열인지 확인한 후 .length-1을 이용해 마지막항에 구해준 공차/공비를 더하거나 곱해준다  
      
        if (common[1] - common[0] == common[2] - common[1]) { // 공차수열 확인
            int a = common[1] - common[0]; // a변수에 공차 입력
            answer = common[common.length-1] + a; 
        }else if (common[1] / common[0] == common[2] / common[1]) { // 공비수열 확인
            int b = common[1] / common[0]; // b변수에 공비 입력
            answer = common[common.length-1] * b;
        }
        
        return answer;
    }
}
