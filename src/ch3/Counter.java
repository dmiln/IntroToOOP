package ch3;

public class Counter {

    private int min;
    private int max;
    private int actual;
    private int id;
    private static int countId = 1;

    /*
      Блок инициализатор id
     */ {
        id = countId;
        countId++;
    }

    Counter(int max) {
        this.max = max;
        this.min = 0;
        this.actual = 0;
    }

    Counter(int min, int max) {
        this.min = min;
        this.max = max;
        this.actual = min;
    }

    public void pushActual() {
        if (actual < max) {
            actual++;
        } else {
            actual = min;
        }
    }

    public void setActual(int actual) {
        if (actual >= min) {
            if (actual <= max) {
                this.actual = actual;
            } else {
                this.actual = actual % max;
            }
        } else {
            System.out.println("Введите число больше, чем " + min);
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getActual() {
        return actual;
    }

    public void raiseActual(int actual) {
        if (this.actual + actual <= max) {
            this.actual += actual;
        } else {
            this.actual = (this.actual + actual) % max;
        }
    }

    public void setMin(int min) {
        if (min < max - 5) {
            this.min = min;
            actual = this.min;
        } else {
            System.out.println("Введите число больше, чем " + (max - 5));
        }
    }

    public void setMax(int max) {
         if (max > min + 5){
             this.max = max;
             if (actual > max){
                 setActual(actual);
             }
         }else {
             System.out.println("Введите число больше, чем " + (min + 5));
         }

    }

    public int getId() {
        return id;
    }
}
