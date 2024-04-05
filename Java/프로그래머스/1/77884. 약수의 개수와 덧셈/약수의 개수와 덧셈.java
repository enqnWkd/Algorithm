class Solution {
    public int solution(int left, int right) {

        long beforeTime = System.currentTimeMillis(); // 코드 실행 전에 시간 받아오기
        
        int sum = 0;

        for (int i = left; i <= right; i++) {

            if (i==1) {sum--; continue;} //1은 약수가 1개
            //else if (i==2) {sum+=2; continue;}

            int cnt = 2; //1과 자기 자신

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) cnt++;
            }
            sum += (cnt % 2 == 0) ? i : -i;
        }
        
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long diffTime = (afterTime - beforeTime)/1000; // 두 개의 실행 시간
        System.out.println("실행 시간(ms): " + diffTime); // 세컨드(초 단위 변환)
        
        return sum;
    }
}