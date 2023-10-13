package bt.bt.bt6;

import java.util.Scanner;

public class Student {
    int id;
    int age;
    String name;
    boolean status;

    public String getName() {
        return name;
    }

    public void inpuData(Scanner scanner) {
        System.out.println("Id? :");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.println("age? :");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("name? :");
        this.name = scanner.nextLine();
        System.out.println("status? 1.true 2.false :");
        this.status = Integer.parseInt(scanner.nextLine())==1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
