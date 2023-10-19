import java.util.Scanner;

public class answerkeymatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         char keys[]={'D','B','D','C','C','D','A','E','A','D'};
        int t=sc.nextInt();
        char stu[][]=new char[t][10];
for(int i=0;i<t;i++){
    for(int j=0;j<10;j++){
        stu[i][j]=sc.next().charAt(0);
    }
}
        for(int i=0;i<t;i++){
            int c=0;
            for(int j=0;j<10;j++){
                if(stu[i][j]==keys[j]){
                    c++;
                }
            }
             System.out.println(c);
        }
       
    }
}
