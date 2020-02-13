package serialization;

import java.io.Serializable;

class Cat implements Serializable {
    int paw;
    int tail;
    String color;

    Cat() {

    }

    Cat(int paw, int tail, String color) {

        this.paw = paw;
        this.tail = tail;
        this.color = color;
    }

    int setPaw(int paw) {
        return this.paw = paw;
    }

    int getPaw() {
        return paw;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "paws = " + paw +
                ", tail = " + tail +
                ", color = '" + color + '\'' +
                '}';
    }
}

