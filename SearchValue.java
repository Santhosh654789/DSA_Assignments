package DSA_Assignments;

 //Write a function that takes a multidimensional array of strings and a search value, 
 //and returns true if the value exists in any element of the array, false otherwise. (prefer 2d or 3d array)

import java.util.Scanner;

class Search {
    Scanner sc = new Scanner(System.in);
    String searchValue;
    
    Search(String searchValue) {
        this.searchValue = searchValue;
    }
    boolean find() {
        int row = sc.nextInt();
        int col = sc.nextInt();

        sc.nextLine();

        String[][] arr = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextLine();
                //sc.nextLine();
                arr[i][j] = arr[i][j].toLowerCase();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j].equals(searchValue)) {
                    return true;
                }
            }
        }
        return false;
    }
}
class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String searchValue = sc.nextLine();
        searchValue = searchValue.toLowerCase();

        Search s = new Search(searchValue);
        System.out.println(s.find());

        sc.close();
    }
}
