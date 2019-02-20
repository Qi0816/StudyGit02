public class Test {
    public static void main(String[] args) {
        int count=0;//前一个数
        boolean state=false;
        for (int i =101;i<=1000; i+=2) {
            boolean b=isTrue(i);
            if(b){
                if(i-count==2){
                    System.out.println(count);
                    state=true;
                }
                else{
                    if(state==true){
                        System.out.println(count);
                        state=false;
                    }

                }
                count=i;
            }

        }

    }
    static boolean isTrue(int num){
        for (int i = 2; i <num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
