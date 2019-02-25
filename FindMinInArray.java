package SS2BT4;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {

        int n;
        System.out.println("Mời nhập vào số lượng phần tử trong mảng : ");
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        int arr[] = new int[n] ;
        nhapPhanTuTrongMang(arr);
        System.out.println("Giá trị min trong mảng là : " + findValueMin(arr));
    }
    private static void nhapPhanTuTrongMang(int arr[]) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0 ; i < arr.length; i++) {
            System.out.print("arr[" + i +"]=");
            arr[i] = scn.nextInt();
        }
    }
    private static int findValueMin(int array[]) {
        int min = array[0];
        for (int i = 1 ; i < array.length ; i++ ) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return  min;
    }
}
