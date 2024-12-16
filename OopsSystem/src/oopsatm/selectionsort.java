package oopsatm;

public class selectionsort {
    static void sort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int minNum = i;

            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    minNum = j;
                }
            }

            int temp = nums[minNum];
            nums[minNum] = nums[i];
            nums[i] = temp;
        }
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    // Swap the elements if the current element is smaller than the previous one
                    swap(arr, j, j - 1);
                } else {
                    // Break the loop if the current element is in the correct order
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void insertSort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && key < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 5, 3, 5, 1, 9 };
        // sort(nums);
        // insertSort(nums);
        insertion(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }

}
