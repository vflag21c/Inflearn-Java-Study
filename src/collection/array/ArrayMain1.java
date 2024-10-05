package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        /**
         * - 배열의 인덱스 사용 : O(1)
         * - 배열의 순차 검색  : O(n)
         */

        int[] arr = new int[5];

        //index 입력 : O(1)
        System.out.println("== index 입력 : O(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(Arrays.toString(arr));

        System.out.println("== index 변경 : O(1)==");
        arr[2] = 10;

        System.out.println(Arrays.toString(arr));

        System.out.println("== index 조회 : O(1)==");
        System.out.println("arr[2]" + arr[2]);

        System.out.println("==배열 검색: O(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < value; i++) {
            if (arr[i] == value) {
                System.out.println("arr[i] = " + arr[i]);
                break;
            }
        }

    }
}
