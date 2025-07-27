import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[2]);

         int arr02[] = {3, 4, 5};
         arr[2] = 10;
         System.out.println(arr[2]);

        System.out.println();
        // Duyệt mãng
        for (int i = 0; i < arr.length; i++) {
            System.out.println("phần tử thứ " + i + "có giá trị:" + arr[i]);

        }
        for(int item: arr){
            System.out.println(item);
        }
    }
}
