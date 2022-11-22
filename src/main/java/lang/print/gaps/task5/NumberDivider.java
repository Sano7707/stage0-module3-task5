package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        toBeDivided /= (double) toBeDivided /5;
        System.out.println(toBeDivided/5);
    }
}
