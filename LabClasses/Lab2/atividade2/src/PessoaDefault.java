import java.util.Arrays;

import pessoa.Pessoa;

public class PessoaDefault {
  public static void main(String[] args) {
    Pessoa client1 = new Pessoa("Matheus", "teste@teste.com", "(11)6666-6666");
    Pessoa client2 = new Pessoa("Nome1", "Email1", "(11)1324-6578");
    Pessoa client3 = new Pessoa("Nome2", "Email2", "(11)1324-6578");
  
    client1.printInfo();

    jumpLine();

    client2.printInfo();

    jumpLine();

    client3.printInfo();

    jumpLine();

    if(client1.setEmail(null)) {
      System.out.println("Email alterado");
    } else{
      System.out.println("Email em branco");
    }

    jumpLine();

    if(client1.setEmail("novo@email.com")) {
      System.out.println("Email alterado");
    } else{
      System.out.println("Email em branco");
    }

    jumpLine();

    client1.setEmailAndPhone("outro@email.com", "(11)9879-8798");

    client1.printInfo();

    Pessoa[] a = new Pessoa[10];
    System.out.println(Arrays.toString(a));
  }

  public static void jumpLine() {
    System.out.println();    
  }
}