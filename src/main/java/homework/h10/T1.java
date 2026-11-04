package homework.h10;

// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
public class T1 {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while (word.length() < k) {
            int len = word.length();
            for (int i = 0; i < len; i++) {
                word.append((char) (word.charAt(i) + 1));
            }
        }
        return word.charAt(k - 1);
    }
}