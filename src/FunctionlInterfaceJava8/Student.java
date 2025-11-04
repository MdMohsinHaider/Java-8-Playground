package FunctionlInterfaceJava8;

import java.util.Objects;

public class Student {
    private Integer id;
    private String name;

    public Student() {
        super();
    }

    public Student(Integer id) {
        this();
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Integer id) {
        this(id);
        this.name = name;
    }

    public Student(Integer id, String name) {
        this(id);
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
