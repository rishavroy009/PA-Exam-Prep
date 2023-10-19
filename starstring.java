import java.util.ArrayList;
import java.util.Scanner;

public class starstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ind=sc.nextLine();
        String arr[]=ind.split(" ");
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int k=Integer.parseInt(arr[i]);
            arr1.add(k);
        }
        for(int i=0;i<str.length();i++){
            if(arr1.contains(i)){
                System.out.print("*"+str.charAt(i));
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
    }
}
