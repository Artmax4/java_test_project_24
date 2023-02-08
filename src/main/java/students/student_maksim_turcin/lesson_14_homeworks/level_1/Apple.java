package students.student_maksim_turcin.lesson_14_homeworks.level_1;

import java.util.Objects;

public class Apple {

    String color;
    int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return weight == apple.weight && Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }
}

