public class Main {
  public static void main(String[] args) {
    User user1 = new User();
    user1.setFirstName("Alex");
    user1.setLastName("Macedon");

    User user2 = new User();
    user2.setFirstName("Maria");
    user2.setLastName(null);


    User user3 = new User();
    user3.setFirstName(null);
    user3.setLastName("Smith");

    User user4 = new User();
    user4.setFirstName(null);
    user4.setLastName(null);

    System.out.println(user1.getFullName());
    System.out.println(user2.getFullName());
    System.out.println(user3.getFullName());
    System.out.println(user4.getFullName());

  }

}
