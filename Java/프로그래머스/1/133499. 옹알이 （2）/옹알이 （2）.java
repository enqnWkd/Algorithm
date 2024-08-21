class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        String[] reps = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for (String str : babbling) {
            boolean isValid = true;

            // 중복 발음 체크
            for (String r : reps) {
                if (str.contains(r)) {
                    isValid = false;
                    break;
                }
            }
            if (!isValid) continue;

            // 앞에서부터 하나씩 단어를 제거
            String prevWord = "";
            boolean found = true;

            while (found) {
                found = false;
                for (String word : words) {
                    if (str.startsWith(word)) {
                        if (word.equals(prevWord)) {
                            isValid = false;
                            break;
                        }
                        prevWord = word;
                        str = str.substring(word.length());
                        found = true;
                        break;
                    }
                }
                if (!isValid) break;
            }

            if (isValid && str.equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}

// class Solution {
//     public int solution(String[] babbling) {
//         int answer = 0;
//         String[] words = {"aya", "ye", "woo", "ma"};
//         String[] reps = {"ayaaya", "yeye", "woowoo", "mama"};
        
//         for (String str : babbling) {
//             boolean isValid = true;

//             for (String r : reps) {
//                 if (str.contains(r)) {
//                     isValid = false;
//                     break;
//                 }
//             }
//             if (!isValid) continue;
            
//             for (int i=0; i<str.length(); i++) {
//                 for (String word : words) {
//                     if (str.startsWith(word)) {
//                         str = str.substring(word.length());
//                     }
//                 }
//             }
            
//             if (str.equals(""))
//                 answer++;
//         }
        
//         return answer;
//     }
// }