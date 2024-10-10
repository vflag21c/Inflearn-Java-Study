package collection.set.test;

import java.util.Objects;

public class Rectangle {
    private int with;
    private int height;

    public Rectangle(int with, int height) {
        this.with = with;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return with == rectangle.with && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(with, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "with=" + with +
                ", height=" + height +
                '}';
    }
}
