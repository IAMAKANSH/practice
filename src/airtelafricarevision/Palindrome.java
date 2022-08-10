package airtelafricarevision;

public class Palindrome {

    public static void main(String[] args) {

        String given ="aA";
        Boolean res=checkWhetherPalindrome(given);
        System.out.println(res);
    }

    private static Boolean checkWhetherPalindrome(String given) {
        int start=0;
        int end=given.length()-1;
        while (start<end)
        {
            if(given.charAt(start)!=given.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
}
