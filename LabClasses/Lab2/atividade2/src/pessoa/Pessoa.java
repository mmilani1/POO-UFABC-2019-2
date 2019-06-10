package pessoa;

public class Pessoa {
    private String name;
    private String email;
    private String phone;

    public Pessoa(String name, String email, String phone) {
      this.name = name;
      this.email = email;
      this.phone = phone;
    } 

    public void setName(String name) {
      if(name == null || name.isBlank()) return;

      this.name = name;
    }
    public boolean setEmail(String email) {
      if(email == null || email.isBlank()) return false;
      
      this.email = email;
      return true;
    }
    public boolean setPhone(String phone) {
      if(phone == null || phone.isBlank()) return false;
      
      this.phone = phone;
      return true;
    }

    public String getEmail() {
      return email;
    }
    public String getName() {
      return name;
    }
    public String getPhone() {
      return phone;
    }

    public String setEmailAndPhone(String email, String phone) {
      if(setEmail(email) && setPhone(phone)) return "Dados alterados com sucesso!";

      return "Não foi possivel salvar os dados.";
    }

    public void printInfo() {
      System.out.printf("Nome: %s\nEmail: %s\nPhone: %s\n", this.name, this.email, this.phone);
    }
}
