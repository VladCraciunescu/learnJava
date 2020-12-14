package example2;

import java.util.Comparator;
import java.util.Objects;

public class Cat implements Comparable<Cat> {
    int age;
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return getAge() == cat.getAge() &&
                Objects.equals(getName(), cat.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }

    @Override
    public int compareTo(Cat o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
