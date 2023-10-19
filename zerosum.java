import java.util.ArrayList;
import java.util.Scanner;

public class zerosum {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       String arr[]=str.split(" ");
      int arr1[]=new int[arr.length];
      for(int i=0;i<arr.length;i++){
        arr1[i]=Integer.parseInt(arr[i]);
      }
      for(int i=0;i<arr1.length;i++){
        for(int j=i;j<arr1.length;j++){
            ArrayList<Integer> h1=new ArrayList<>();
            int sum=0;
            for(int k=i;k<=j;k++){
                h1.add(arr1[k]);
                sum=sum+arr1[k];
            }
            if(sum==0){
                for(int x:h1){
                    System.out.print(x+" ");
                }
                  System.out.println();
            }
          
        }
      }
        // System.out.println(arr);
    }
}
