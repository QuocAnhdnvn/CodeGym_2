package org.example;

import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Tạo danh sách sinh viên
        ArrayList<Student> students = new ArrayList<>();

        // Thêm 5 đối tượng Student vào danh sách
        students.add(new Student(1, "Alice", 20));
        students.add(new Student(2, "Bob", 21));
        students.add(new Student(3, "Charlie", 22));
        students.add(new Student(4, "David", 23));
        students.add(new Student(5, "Eva", 24));

        // Hiển thị thông tin tất cả sinh viên
        System.out.println("Danh sách sinh viên:");
        for (Student s : students) {
            s.displayInfo();
            System.out.println("------------");
        }

        // Xoá sinh viên tên "Eva"
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equalsIgnoreCase("Eva")) {
                students.remove(i);
                i--; // Lùi chỉ số lại 1 sau khi xóa để tránh bỏ sót phần tử
            }
        }

        // Hiển thị danh sách sau khi xoá
        System.out.println("\nSau khi xoá sinh viên tên 'Eva':");
        for (Student s : students) {
            s.displayInfo();
            System.out.println("------------");
        }

        System.out.println("Sinh viên có tên chứa chữ 'a':");
        for (int i = 0; i < students.size(); i++) {
            String name = students.get(i).getName().toLowerCase(); // chuyển về chữ thường
            if (name.contains("a")) {
                students.get(i).displayInfo();
                System.out.println("------------");
            }
        }
    }
}