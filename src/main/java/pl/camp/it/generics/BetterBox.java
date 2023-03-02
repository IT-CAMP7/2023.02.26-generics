package pl.camp.it.generics;

public class BetterBox<T, G> extends Box<T> {

    private G secondValue;

    public G getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(G secondValue) {
        this.secondValue = secondValue;
    }
}
