package recursion;

public class Frog {
    /** 题目描述： 一只青蛙想过一条 11 英尺宽的河。有 10 块石头排成一排过河，相隔 1 英尺，青蛙只能向前跳一英尺到下一块石头，
     * 或者向前跳两英尺到第二块石头。他有多少种不同的方式可以刚好跳过11英尺到河的另一边 ？ **/

    public int crossRiver(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return crossRiver(n - 1) + crossRiver(n - 2);
    }
    public static void main(String[] args) {
        Frog f = new Frog();
        System.out.println(f.crossRiver(11));
    }
}
