public class Test04 {
    public static void main(String[] args) {
        double height=100;
        double count=0;
        for (int i = 1; i <=10; i++) {
            count+=height;//下降的高度
            height=height/2;//反弹高度
            count+=height;//下降与反弹的高度的总和高度
        }
        count-=height;//减去反弹的高度
        System.out.println(count);
        System.out.println(height);
    }
}
