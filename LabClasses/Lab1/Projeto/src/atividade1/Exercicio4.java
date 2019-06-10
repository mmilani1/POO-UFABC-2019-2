package atividade1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a posição e o valor que deseja inserir");
    int position = scan.nextInt();
    int value = scan.nextInt();

    scan.close();
    
    int[] array = getRandomIntArray(10);
    System.out.println("Array inicial:");
    System.out.println(Arrays.toString(array));

    if(insert(value, position, array)){
      System.out.println("Inserido com sucesso!");
      System.out.println(Arrays.toString(array));
    } else {
      System.out.println("Não foi possivel inserir.");
    }
  }
  
  public static int[] getRandomIntArray(int length) {
    int[] array = new int[length];

    for (int i = 0; i < length; i++) {
      array[i] = (int)(Math.random() * 10);
    }

    return array;
  }

  public static boolean insert(int value, int position, int[] array) {
    int length = array.length;

    for (int i = 0; i < length; i++) {
      if(array[i] == 0 && i >= position) {
        shift(array, position, i);
        array[position] = value;
        return true;
      }
    }

    return false;
  }

  public static void shift(int[] array, int begin, int end) {
    if(begin == end) return;
    
    for (int i = end; i > begin; i--) {
      int temp = array[i];
      array[i] = array[i - 1];
      array[i -1] = temp;
    }
  }
}