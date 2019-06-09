package atividade1;

import java.util.Arrays;

public class Exercicio5 {
  public static void main(String[] args) {
    int[] array = getRandomIntArray(10);

    System.out.println("Original array:");
    System.out.println(Arrays.toString(array));
    
    selectionSort(array);

    System.out.println("Sorted array:");
    System.out.println(Arrays.toString(array));
  }

  public static int[] getRandomIntArray(int length) {
    int[] array = new int[length];

    for (int i = 0; i < length; i++) {
      array[i] = (int) (Math.random() * 10);
    }

    return array;
  }

  public static void selectionSort(int[] array) {
    int length = array.length;
    
    for (int i = 0; i < length; i++) {
      int min = array[i];
      int minIndex = i;
      
      for (int j = i; j < length; j++) {
        if(array[j] < min) {
          min = array[j];
          minIndex = j;
        }
      }

      array[minIndex] = array[i];
      array[i] = min;
    }
  }
}