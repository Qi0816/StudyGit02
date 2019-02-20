import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("请输入：");
        int count=sca.nextInt();
        int all=1;
        for (int i =count; i>1; i--) {
            all=(all+1)*2;
        }
        System.out.println(all);
    }
}
