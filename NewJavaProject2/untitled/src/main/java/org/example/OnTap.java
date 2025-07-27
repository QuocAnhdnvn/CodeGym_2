package org.example;

public class OnTap {
    String name;
    public static void main(String[] args) {

        long number001 = 50000000;
        Long number002 = 50000000L; // phải có ký tự l ở cuối.

        short number003 = 44;
        Short number004 = 44;

        byte number005 = 122;
        Byte number006 = -13;

        int number01 = 4; // Kiểu số nguyên (Kiểu nguyên thuỷ)
        Integer number02 = 12; // Kiểu wrapper
        /*Bản chất kiểu dữ liệu này là một lớp-class */

        double number03 = 3.14;
        Double number04 = 3.14;

        float number05 = 3.1f; //số thực (có phạm vi sử dụng nhỏ hơn double) phải thêm chữ "f" ở cuối
        Float number06 = 4.6f;

        char c = 'a';
        Character c1 = 'w';

        boolean isSick = true;
        Boolean isSick02 = false;

        String  name = "Linh"; // String ko có kiểu wrapper vì bản chất nó đã là một lớp
        name = "Vu Linh";

        /*
        Toán tử toán học + - * / % ++ --

        Toán tử so sánh: > < >= <= == != (không có === vì kiểu dữ liệu đã dc quy định từ đầu)

        Toán tử logic: && || ! (xor instanceof & |)
        ^ là toán tử XOR trong Java
        Dùng được cho boolean hoặc bitwise (int, byte, long,...)
        Kết quả là true nếu hai giá trị khác nhau

        Toán tử gán: = += -= *= /= %=
        */


        /*Một đối tượng luôn có đặc điểm và phương thức
        Khi sử dụng dữ liệu kiểu lớp ta có thể sử dụng các hàm có sẳn.
        Dử liệu kiểu lớp có thể mang giá trị null
         */
        final int double PI = 3.14;//Cách so sánh hằng


        //Đọc thêm ép kiểu trong java
    }

    public void demo() {
        String  name = "Vu Linh";
    }
}
