import java.util.Scanner;

public class binaryrep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        int i=2;
        while(c<n){
              String str=Integer.toBinaryString(i);
            if(checker(str)){
                c++;
                i++;
            }
            else{
            i++;}
        }
        System.out.println(i-1);
      

    }
    public static boolean checker(String str){
        int s=0;
        int e=str.length()-1;
        while(s<=e){
            if(str.charAt(e)!=str.charAt(s)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
