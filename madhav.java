import java.util.*;
public class madhav{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        int i=3;
        while(c<n){
            if(((i-2)%3==0)&&i%m!=0){
                System.out.println(i);
                c++;
                i++;
            }
            else{
                i++;
            }
        }
    }
}