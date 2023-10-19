import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class songsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
           ArrayList<String> arr1=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr1.add(sc.next());
        }
             Collections.sort(arr1);
        String str=sc.next();
        System.out.println(arr1.indexOf(str));
     


   
        
    }
}
