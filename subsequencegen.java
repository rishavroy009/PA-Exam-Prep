import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class subsequencegen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<Character> arr=new ArrayList<>();

        subs(0,str,arr);


    }
    public static void subs(int i,String str,ArrayList<Character> arr){

        if(i>=str.length()){
            for(char x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
           
            return;
        }
        arr.add(str.charAt(i));
        subs(i+1,str,arr);
        arr.remove(arr.size()-1);
        subs(i+1,str,arr);
    }
}
