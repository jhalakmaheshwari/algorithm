package CTCI;

import java.util.Scanner;

/**
 * Created by Jhalak on 6/1/2017.
 */
public class ArraysStringsZeroMatrix {
    int[][] matrix;

    public ArraysStringsZeroMatrix(int rows, int columns) {
        matrix=new int[rows][columns];

        /*Enter the matrix values*/
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }

        printMatrix(matrix);
    }

    private void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setZeros(int matrix[][]){
        boolean[] row=new boolean[matrix.length];
        boolean[] column=new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j=0;j<matrix[i].length; j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    column[j]=true;
                }
            }
        }
        getNullifyrows(matrix, row);
        getNullifycolumns(matrix, column);
        printMatrix(matrix);
    }

    private void getNullifyrows(int[][] matrix, boolean[] row) {
        for(int i=0;i<row.length;i++)
        {
            if(row[i]==true){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j]=0;
                }
            }
        }
    }

    private void getNullifycolumns(int[][] matrix, boolean[] column) {
        for(int i=0;i<column.length;i++)
        {
            if(column[i]==true){
                for(int j=0;j<matrix.length;j++){
                    matrix[j][i]=0;
                }
            }
        }
    }


    public static void main(String[] args) {
        ArraysStringsZeroMatrix az=new ArraysStringsZeroMatrix(3,3);
        az.setZeros(az.matrix);
    }

}
