import pessoa.*;

/**
 * AgendaDefault
 */
public class AgendaDefault {
  public static void main(String[] args) {
    Agenda agenda = new Agenda();
    populateAgenda(agenda); // Adding 9 pessoas

    Pessoa pessoa1 = new Pessoa("Nome1", "teste@teste.com", "(11)1234-5678");
    agenda.add(pessoa1);

    Pessoa pessoa11 = new Pessoa("Nome11", "teste@teste.com", "(11)1234-5678");
    agenda.add(pessoa11); // Agenda is full already

    System.out.printf("Nome: %s, Posição: %d\n", pessoa1.getName(), agenda.includes(pessoa1));
    System.out.printf("Nome: %s, Posição: %d\n", pessoa11.getName(), agenda.includes(pessoa11));

    agenda.searchEmailByName("Email");
    agenda.searchPhoneByName("Phone");

  }

  private static void populateAgenda(Agenda agenda) {
    Pessoa pessoa2 = new Pessoa("Nome2", "teste@teste.com", "(11)1234-5678");
    Pessoa pessoa3 = new Pessoa("Nome3", "teste@teste.com", "(11)1234-5678");
    Pessoa pessoa4 = new Pessoa("BuscarEmail", "searchedEmail@teste.com", "(11)1234-5678");
    Pessoa pessoa5 = new Pessoa("Nome5", "teste@teste.com", "(11)1234-5678");
    Pessoa pessoa6 = new Pessoa("Nome6", "teste@teste.com", "(11)1234-5678");
    Pessoa pessoa7 = new Pessoa("BuscarPhone", "teste@teste.com", "(11)9999-9999");
    Pessoa pessoa8 = new Pessoa("Nome8", "teste@teste.com", "(11)1234-5678");
    Pessoa pessoa9 = new Pessoa("Nome9", "teste@teste.com", "(11)1234-5678");
    Pessoa pessoa10 = new Pessoa("Nome10", "teste@teste.com", "(11)1234-5678");

    agenda.add(pessoa10);
    agenda.add(pessoa2);
    agenda.add(pessoa3);
    agenda.add(pessoa7);
    agenda.add(pessoa8);
    agenda.add(pessoa5);
    agenda.add(pessoa6);
    agenda.add(pessoa4);
    agenda.add(pessoa9);
  }
}