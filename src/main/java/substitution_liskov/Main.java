package substitution_liskov;

public class Main {
    static Rectangle getRect() {
        return new Rectangle();
    }

    public static void main(String[] args) {
        Rectangle rectangle = getRect();
        rectangle.setHeight(10);
        rectangle.setWeight(5);
        System.out.println(rectangle.getSquare());
    }
}

interface Shape {
    int getSquare();
}

class Rectangle implements Shape {
    int weight;
    int height;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getSquare() {
        return weight * height;
    }
}


class Square implements Shape {
    int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getSquare() {
        return weight * weight;
    }
}