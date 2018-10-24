package eckel.ch3;

public class TestCounter {
    public static void main(String[] args) {
        Counter count1 = new Counter(15);
        Counter count2 = new Counter(4, 27);

        System.out.println("actual for count" + count1.getId() + ": " + count1.getActual());
        count1.setActual(4);
        count1.raiseActual(13);
        System.out.println("actual for count" + count1.getId() + ": " + count1.getActual());
        count1.setActual(15);
        count1.pushActual();
        System.out.println("actual for count" + count1.getId() + ": " + count1.getActual());
        count1.pushActual();
        System.out.println("actual for count" + count1.getId() + ": " + count1.getActual());

        System.out.println();


        System.out.println("actual for count" + count2.getId() + ": " + count2.getActual());
        count2.setActual(2);
        System.out.println("actual for count" + count2.getId() + ": " + count2.getActual());
        count2.setMax(244);
        System.out.println("for count" + count2.getId() + ": min=" + count2.getMin()
                + " max=" + count2.getMax());
        count2.raiseActual(543);
        System.out.println("actual for count" + count2.getId() + ": " + count2.getActual());
        count2.setMin(63);
        System.out.println("for count" + count2.getId() + ": min=" + count2.getMin()
                + " max=" + count2.getMax());
        System.out.println("actual for count" + count2.getId() + ": " + count2.getActual());
        count2.setMin(35);
        count2.setMax(86);
        count2.setActual(83);
        System.out.println("for count" + count2.getId() + ": min=" + count2.getMin()
                + " max=" + count2.getMax());
        System.out.println("actual for count" + count2.getId() + ": " + count2.getActual());
        count2.setMax(75);
        System.out.println("for count" + count2.getId() + ": min=" + count2.getMin()
                + " max=" + count2.getMax());
        System.out.println("actual for count" + count2.getId() + ": " + count2.getActual());

    }
}
