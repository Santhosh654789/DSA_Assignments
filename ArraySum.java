package DSA_Assignments;

//Write a function that takes a 2D integer array and returns the sum of all its elements

public class ArraySum {
    
    public int sumArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {          
            for (int j = 0; j < arr[i].length; j++) {  
                sum += arr[i][j];                    
            }
        }
        return sum;
    }
public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        ArraySum as = new ArraySum();
        System.out.println("Sum Of Array is: " + as.sumArray(numbers));
    }
}