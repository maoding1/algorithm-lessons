package recursion;

public class TowerOfHanoi {

    public static void solveTowerOfHanoi(int n, char source, char help, char target) {
        if (n == 1) {
            System.out.println("移动圆盘 1 从 " + source + " 到 " + target);
            return;
        }

        // 移动 n-1 个圆盘从源柱子到辅助柱子
        solveTowerOfHanoi(n - 1, source, target, help);

        // 移动第 n 个圆盘从源柱子到目标柱子
        System.out.println("移动圆盘 " + n + " 从 " + source + " 到 " + target);

        // 移动 n-1 个圆盘从辅助柱子到目标柱子
        solveTowerOfHanoi(n - 1, help, source, target);
    }

    public static void main(String[] args) {
        int n = 4; // 圆盘数量
        char source = 'A'; // 源柱子
        char help = 'B'; // 辅助柱子
        char target = 'C'; // 目标柱子

        solveTowerOfHanoi(n, source, help, target);
    }
}
