package Tryouts;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int[] lol = {1,2,3,4,5};
        int target = 3;
        int result = linearSearch(lol, target);
        
        if (result == -1) {
        System.out.println("element not found");
        }
        else {
            System.out.println("Element found at index : " + result);
        }
    }
}
