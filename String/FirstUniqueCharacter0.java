public class FirstUniqueCharacter {
    public static void main(String[] args) {
        
        String str = "swiss";
        boolean found = false;
        
        for(int i = 0; i < str.length(); i++) {
            int count = 0;
            
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            
            if(count == 1) {
                System.out.println("First Unique Character is: " + str.charAt(i));
                found = true;
                break;
            }
        }
        
        if(!found) {
            System.out.println("No Unique Character Found");
        }
    }
}