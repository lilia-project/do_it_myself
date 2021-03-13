package Matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SumMatrix {

    public void start() {
        System.out.println("укажите размер квадратной матрицы ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        //создать матрицы
        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];
        int[][] sumMatrix = new int[size][size];

        Random random = new Random();

        // todo simplify method: remove matrix1 and matrix2 from arguments. Make method return an initialized matrix
        initializeMatrix(size, matrix1, matrix2, random);

        // todo extract this for into method that will be responsible for summarising matrix
        summa(size, matrix1, matrix2, sumMatrix);

        // todo extract method that will print matrix
        output(matrix1, matrix2, sumMatrix);

        //вычисление суммы элементов в итоговой матрице
        int sum = getSumElements(size, sumMatrix);
        System.out.println("сумма элементов финальной матрицы равна " + sum);
    }

    private int getSumElements(int size, int[][] sumMatrix) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += sumMatrix[i][j];
            }
        }
        return sum;
    }

    private void output(int[][] matrix1, int[][] matrix2, int[][] sumMatrix) {


        System.out.println((Arrays.deepToString(matrix1)));
        System.out.println((Arrays.deepToString(matrix2)));
        System.out.println((Arrays.deepToString(sumMatrix)));
    }

    private void summa(int size, int[][] matrix1, int[][] matrix2, int[][] sumMatrix) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    private void initializeMatrix(int size, int[][] matrix1, int[][] matrix2, Random random) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix1[i][j] = random.nextInt(100);
                matrix2[i][j] = random.nextInt(100);
                //System.out.print(" " + matrix1[i][j]);
            }
            System.out.println();
        }
    }
}


