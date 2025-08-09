package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Nhập 1 số");
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            System.out.println(a);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Sai định dạng, vui lòng nhập lại");
        } catch (Exception e){
            System.out.println("Something went wrong: main.err: " + e.getMessage());
        } finally {
            System.out.println("Thực hiện khối finally");
        }
    }
}