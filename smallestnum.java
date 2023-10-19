import java.util.Scanner;

public class smallestnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int i=1;
        while(!(i%n==0&&i%k==0)){
            i++;
        }
        System.out.println(i);
    }
}
