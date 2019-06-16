package pessoa;

public class Agenda {
  private Pessoa[] list;
  
  public Agenda() {
    this.list = new Pessoa[10];
  }

  public void add(Pessoa person) {
    if(isFull(list)) return;

    for (int i = 0; i < list.length; i++) {
      if(list[i] == null) {
        list[i] = person;
        break;
      }
    }
  }

  public void remove(Pessoa person) {
    if(person == null) return;

    for (int i = 0; i < list.length; i++) {
      if(person.equals(list[i])) list[i] = null;
    }
  }

  public int includes(Pessoa person) {
    if(person == null) return -1; // Null guard clause

    for (int i = 0; i < list.length; i++) {
      if(person.equals(list[i])) return i;
    }

    return 0;
  }

  private static boolean isFull(Pessoa[] list) {
    for (Pessoa person : list) {
      if(person == null) return false;
    }

    return true;
  }
}