package bt.bt.bt6;
import java.util.*;

public class StudentAdd {
    public static void main(String[] args) {
        Stack<Student> students = new Stack<Student>();
        System.out.println("Nhập số sinh viên cần thêm");
        int countAdd = Integer.parseInt(Config.scan().nextLine());
        for (int i = 0; i < countAdd; i++){
            System.out.println("Add student " + i);
            Student student = new Student();
            student.inpuData(Config.scan());
            students.push(student);
        }
        students.sort((s1, s2) -> CharSequence.compare(s1.getName(), s2.getName()));
        students.forEach(System.out::println);
    }
}