import java.util.Scanner;

public class shortestbina {
    public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int t=sc.nextInt();
    //     String f="10";
    //     String d="00";
    //     for(int i=0;i<t;i++){
    //         String fin="";
    //     String str=sc.next();
    //     StringBuffer sb=new StringBuffer(str);
    //     for(int j=0;j<str.length();j++){
    //         for(int k=j;k<str.length();k++){
    //             String adder=str.substring(j, k+1);
    //             if(adder.equals(f)||adder.equals(d)){

    //                sb.delete(j, k+1);
    //             }
    //         }
    //     }
    //   System.out.println(sb);
    //     }
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int p=0;p<t;p++){
        String str=sc.next();
        while(str.contains("10")||str.contains("00")){
            str=str.replace("10","");
            str=str.replace("00", "");
        }
        System.out.println(str);
    }
    }
}
