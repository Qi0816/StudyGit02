public class Test02 {
    //任务二：利用求 n!的方法计算 2!+4!+5!的值。n!表示 n 的阶乘，例如
    // 3!=3×2×1=6，5!=5×4×3×2×1=120。
    //要求：分别利用递归和非递归方法实现求 n!。
    public static void main(String[] args) {
        int sum = isdigui(5)+isdigui(4)+isdigui(3);
        System.out.println(sum);

        System.out.println("-------------------");

//        int sum1 = notisdigui(5) + notisdigui(4) +notisdigui(3);
//        System.out.println(sum1);
    }

    //递归
    public static int isdigui(int num){
        if(num == 1){
            return 1;
        }
        return num * isdigui(num -1);
    }

//    //非递归
//    public static int notisdigui(int num){
//
//        int sum = 1;
//        for(int i = num ; i>1 ; i--){
//            sum  = i*sum;
//        }
//        return sum;
//    }
}
