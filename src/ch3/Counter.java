package ch3;

public class Counter {

    private int min;
    private int max;
    private int actual;

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
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
