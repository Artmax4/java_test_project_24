package Reflection;

@Author(name = "Maxim", dateOfCreation = 2023)
public class Person2 {
    private int id;
    private String name;

    public Person2() {
        this.id = -1;
        this.name = "No name";
    }

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Person with id: " + id + " and name: " + name +
                " say hello!");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
