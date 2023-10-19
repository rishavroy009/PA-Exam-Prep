import java.util.Scanner;
import java.util.Stack;

public class ballbox {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int pair=0;
      for(int i=0;i<n-1;i++){
        if(arr[i]%2==0){
            pair=pair+(arr[i]/2);
        }
        else{
            pair=pair+Math.min(arr[i],arr[i+1]);
            arr[i+1]=Math.max(arr[i+1],arr[i])-Math.min(arr[i],arr[i+1]);
        }
      }
      if(arr[n-1]%2==0){
        pair=pair+arr[n-1]/2;
      }
      System.out.println(pair);
    }
}
