public class MoveAllZerosToEnd{
    public static void main(String[] args){
        int arr[] = {1,6,3,7,9,4,2};
        int len = arr.length;
        int count = 0;
        
        for(int i=0;i<len; i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];   
            }
        }
        while(count<len){
            arr[count++] = 0;
        }
        
        for(int j=0; j<len; j++){
            System.out.println(arr[j]);
        }
    }
}