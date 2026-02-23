public class PalindromeString {
    public static void main(String[] args) {
        
        String str = "madam";
        String originalStr = str;
        String reverseStr = "";
        
        for(int i = str.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        
        if(originalStr.equals(reverseStr)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is Not Palindrome");
        }
    }
}