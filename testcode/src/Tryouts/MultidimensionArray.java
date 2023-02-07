package Tryouts;

public class MultidimensionArray {
    public static void main(String[] args) {
        int[][] num = {{1,2,3,4}, {5,6,7}};
         
        // The first [] indicates the array
        // The second [] indcates the element
        
        System.out.println(num[1][2]);
         
        // Second array third element
        
        // Change value
        
        num[0][3] = 9;
        
        System.out.println(num[0][3]);
        System.out.println(num[1].length);
        
        // loop through
        
        for (int i = 0; i < num.length; ++i) {
            for (int j = 0; j < num[i].length; ++j){
                System.out.println(num[i][j]);
            }
        }
    }
}
