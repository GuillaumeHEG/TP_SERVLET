package ch.hesge.collections;

public class ManipulationTableau {


    public static int[][] createTable(int m, int n) {
         int [][] table = new int[m][n];
         for (int x = 0; x < m; x++){
             for (int y = 0; y < n; y++){
                 table[x][y] = x + y;
             }
         }
         return table;
    }

    public static void displayTable(int [][] table){
        for (int[] tab : table){
            for (int element : tab){
                System.out.print(element + ", ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        int[][] table = createTable(11,11);
        displayTable(table);

    }

}
