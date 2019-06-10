import pessoa.*;

/**
 * AgendaDefault
 */
public class AgendaDefault {
  public static void main(String[] args) {
    Agenda agenda = new Agenda();
    Pessoa pessoa1 = new Pessoa("Nome1", "teste@teste.com", "(11)1234-5678");
    Pessoa pessoa2 = new Pessoa("Nome2", "teste@teste.com", "(11)1234-5678");
    Pessoa pessoa3 = new Pessoa("Nome3", "teste@teste.com", "(11)1234-5678");
    Pessoa pessoa4 = new Pessoa("Nome4", "teste@teste.com", "(11)1234-5678");
    Pessoa pessoa5 = new Pessoa("Nome5", "teste@teste.com", "(11)1234-5678");
    Pessoa pessoa6 = new Pessoa("Nome6", "teste@teste.com", "(11)1234-5678");
    Pessoa pessoa7 = new Pessoa("Nome7", "teste@teste.com", "(11)1234-5678");
    Pessoa pessoa8 = new Pessoa("Nome8", "teste@teste.com", "(11)1234-5678");
    Pessoa pessoa9 = new Pessoa("Nome9", "teste@teste.com", "(11)1234-5678");
    Pessoa pessoa10 = new Pessoa("Nome10", "teste@teste.com", "(11)1234-5678");

    agenda.add(pessoa1);
    agenda.add(pessoa10);
    agenda.add(pessoa2);
    agenda.add(pessoa3);
    agenda.add(pessoa7);
    agenda.add(pessoa8);
    agenda.add(pessoa5);
    agenda.add(pessoa6);
    agenda.add(pessoa4);
    agenda.add(pessoa9);

    System.out.printf("Nome: %s, Posição: %d\n", pessoa1.getName(), agenda.includes(pessoa1));
    System.out.printf("Nome: %s, Posição: %d\n", pessoa2.getName(), agenda.includes(pessoa2));
    System.out.printf("Nome: %s, Posição: %d\n", pessoa3.getName(), agenda.includes(pessoa3));
    System.out.printf("Nome: %s, Posição: %d\n", pessoa4.getName(), agenda.includes(pessoa4));
    System.out.printf("Nome: %s, Posição: %d\n", pessoa5.getName(), agenda.includes(pessoa5));
    System.out.printf("Nome: %s, Posição: %d\n", pessoa6.getName(), agenda.includes(pessoa6));
    System.out.printf("Nome: %s, Posição: %d\n", pessoa7.getName(), agenda.includes(pessoa7));
    System.out.printf("Nome: %s, Posição: %d\n", pessoa8.getName(), agenda.includes(pessoa8));
    System.out.printf("Nome: %s, Posição: %d\n", pessoa9.getName(), agenda.includes(pessoa9));
    System.out.printf("Nome: %s, Posição: %d\n", pessoa10.getName(), agenda.includes(pessoa10));

  }
}