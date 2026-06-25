package Lab6;

public class AssignmentQ7 {

    public static boolean isPalindrome(String str, int left, int right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }else if (str.charAt(left) == str.charAt(right)){
            return true;
        }
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String[] words = {"mom", "civic", "level", "hello", "geek","toot"};

        System.out.println("=== [Q7] Palindrome Checker ===");

        int n = 0;
        for (String word : words) {
            boolean result = isPalindrome(word, 0, word.length() - 1);
            System.out.println("["+n+"]"+ word + "-> " + result);
            n++;
        }n = 0;
    }

    /*
    === [Q7] Palindrome Checker ===
    [0]mom-> true
    [1]civic-> true
    [2]level-> true
    [3]hello-> false
    [4]geek-> false
    [5]toot-> true
    */
}