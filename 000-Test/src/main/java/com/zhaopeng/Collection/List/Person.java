package com.zhaopeng.Collection.List;

/**
 * @Author zhaopeng
 * @Date 2020/5/27
 */
public class Person implements Comparable{
    public String name;
    public int age;
    public int height;
    public Person(String name, int age, int height) {
        super();
        this.name = name;
        this.age = age;
        this.height = height;
    }
    @Override
    public String toString() {
        return " [" + name + ", age=" + age + ", height=" + height + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + height;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (height != other.height)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
