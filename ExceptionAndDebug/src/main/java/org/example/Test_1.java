package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_1 {
    try {
        System.out.println("Nhập tuổi của bạn");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(a);
    } catch (
    InputMismatchException inputMismatchException) {
        System.out.println("Sai định dạng, vui lòng nhập lại");
    } catch (Exception e){
        System.out.println("Something went wrong: main.err: " + e.getMessage());
    } finally {
        System.out.println("Thực hiện khối finally");
    }
}
