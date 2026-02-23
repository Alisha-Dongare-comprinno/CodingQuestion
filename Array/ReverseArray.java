public class ReverseArray{
    public static void main(String[] args){
        String str = "abc";
        String reverseStr = "";
        char ch;
        
        for(int i=0; i<str.length();i++){
            ch = str.charAt(i);
            reverseStr = ch + reverseStr;
        }
        System.out.println("Reverse string is ;" + reverseStr);
    }   
}