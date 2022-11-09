//프로그래머스 코딩테스트 입문 문자열 밀기

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        String result = A; // 문자열을 따로 저장할 result 생성
        
        for (int i = 0; i < A.length(); i++) { // A 문자열의 길이 만큼 반복
            if (result.equals(B)) { // result가 B와 같다면 그 당시의 answer값 출력
                return answer;
            }
            String a = result.substring(result.length()-1); // result의 마지막 문자를 가져와 a에 저장
            result = a + result.substring(0, result.length()-1); // result에 a와 result의 처음부터 마지막앞까지 문자가져와 저장
            answer++; // answer 카운트 증가 후 다시 반복문
        }
            
        return -1; // if에서 걸리지않았을 경우 문자열 밀기로는 만들수 없는 불가능한 문자라 판단해 -1 출력
    }
}
