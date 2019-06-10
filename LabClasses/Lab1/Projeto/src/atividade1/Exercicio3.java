package atividade1;

import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the A matrix dimensions (rows, columns):");
    int rowsA = scan.nextInt();
    int columnsA = scan.nextInt();

    double[][] A = getMatrix(rowsA, columnsA);

    System.out.println("Enter the B matrix dimensions (rows, columns):");
    int rowsB = scan.nextInt();
    int columnsB = scan.nextInt();

    double[][] B = getMatrix(rowsB, columnsB);

    scan.close();

    if(columnsA == rowsB){
      double[][] AxB = multiply(A, B);
      System.out.println("Matrix A:");
      printMatrix(A);
      System.out.println("Matrix B:");
      printMatrix(B);
      System.out.println("Matrix AxB:");
      printMatrix(AxB);
      return;
    }

    System.out.println("Those matrixes cannot be multiplied");
  }

  public static void printMatrix(double [][] matrix) {
    int rows = matrix.length;
    int columns = matrix[0].length;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.printf("%f ", matrix[i][j]);
      }
      System.out.println();
    }
  }

  public static double[][] getMatrix(int rows, int columns) {
    double[][] matrix  =  new double[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        matrix[i][j] = Math.random() * 10;
      }
    }

    return matrix;
  }

  public static double[][] multiply(double[][] A, double[][] B) {
    int rowsA = A.length;
    int columnsB = B[0].length;

    double[][] AxB = new double[rowsA][columnsB];

    for (int i = 0; i < rowsA; i++) {
      double product = 0;

      for (int j = 0; j < columnsB; j++) {
        for (int k = 0; k < columnsB; k++) {
          product += A[i][k] * B[k][j];
        }

        AxB[i][j] = product;
        product = 0;
      }
    }

    return AxB;
  }
}

