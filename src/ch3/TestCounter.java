package ch3;

public class TestCounter {
    public static void main(String[] args) {
        Counter count1 = new Counter(15);
        Counter count2 = new Counter(4, 27);
        System.out.println(count1.getActual());
        count1.setActual(4);
        count1.raiseActual(13);
        System.out.println(count1.getActual());
        count1.setActual(15);
        count1.pushActual();
        System.out.println(count1.getActual());
        count1.pushActual();
        System.out.println(count1.getActual());

        count2.setActual(2);
        System.out.println(count2.getActual());
    }
}
