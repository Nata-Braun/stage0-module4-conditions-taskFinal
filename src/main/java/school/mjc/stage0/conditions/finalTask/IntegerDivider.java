package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int res = 0;
        if (divider!=0){
            res = dividend / divider;
        } else {
            System.out.println("division by zero");
            return;
        }
        if (divider*res == dividend) {
            System.out.println("can be divided completely");
        }else {
            System.out.println("cannot be divided completely");

        }
    }
}
