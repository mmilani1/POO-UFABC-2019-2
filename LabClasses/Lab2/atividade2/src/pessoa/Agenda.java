package pessoa;

public class Agenda {
  private Pessoa[] list;

  public Agenda() {
    this.list = new Pessoa[10];
  }

  public void add(Pessoa person) {
    if (isFull(list)) {
      System.out.printf("Agenda está cheia para adicionar %s\n", person.getName());
      return;
    }

    for (int i = 0; i < list.length; i++) {
      if (list[i] == null) {
        System.out.printf("Adicionando %s\n", person.getName());
        list[i] = person;
        break;
      }
    }
  }

  public void remove(Pessoa person) {
    if (person == null)
      return;

    for (int i = 0; i < list.length; i++) {
      if (person.equals(list[i]))
        list[i] = null;
    }
  }

  public int includes(Pessoa person) {
    if (person == null)
      return -1; // Null guard clause

    for (int i = 0; i < list.length; i++) {
      if (person.equals(list[i]))
        return i + 1;
    }

    return 0;
  }

  public void searchPhoneByName(String name) {
    if (name == null || name.isBlank())
      return;

    int found = 0;

    for (Pessoa person : list) {
      if (person == null)
        continue;

      if (person.getName().toLowerCase().contains(name.toLowerCase())) {
        found++;
        System.out.printf("Name: %s, Phone: %s\n", person.getName(), person.getPhone());
      }
    }

    System.out.printf("%d pessoa(s) encontrada(s)\n", found);
  }

  public void searchEmailByName(String name) {
    if (name == null || name.isBlank())
      return;

    int found = 0;

    for (Pessoa person : list) {
      if (person == null)
        continue;

      if (person.getName().toLowerCase().contains(name.toLowerCase())) {
        found++;
        System.out.printf("Name: %s, Phone: %s\n", person.getName(), person.getEmail());
      }
    }

    System.out.printf("%d pessoa(s) encontrada(s)\n", found);
  }

  private static boolean isFull(Pessoa[] list) {
    for (Pessoa person : list) {
      if (person == null)
        return false;
    }

    return true;
  }
}