package homework9.annotation;

import java.util.Objects;

@Version(version = 1.1)
public class MyService {
    private String name;
    private int age;

    public MyService(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return Objects.equals(name, myService.name) &&
                Objects.equals(age, myService.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    private void thisClassInfo() {
        System.out.println("MyService{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}');
    }
}
