import java.util.ArrayList;
import java.util.Scanner;

public class contactsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> name=new ArrayList<>();
        ArrayList<String> numb=new ArrayList<>();
        ArrayList<String> email=new ArrayList<>();
        for(int i=0;i<n;i++){
            name.add(sc.next());
            numb.add(sc.next());
            email.add(sc.next());
        }
        String str=sc.next();
        if(name.contains(str)){
            int p=name.indexOf(str);
            System.out.println(str);
            System.out.println(numb.get(p));
            System.out.println(email.get(p));
        }

        else{
            System.out.println(-1);
        }
    }
}
