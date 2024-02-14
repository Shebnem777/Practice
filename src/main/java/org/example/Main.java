package org.example;
public class Main {
    public static void main(String[] args) {
        User.umumi="Salam";
        User u=new User();
        u.surname="Shibliyeva";
        User u2=new User();
        u2.name="Shebnem";
        Test.deyis();

      User user=new User();
      user.foo2();
        System.out.println(user.foo2());
        System.out.println(User.umumi);
        System.out.println(u.surname);
        System.out.println(u2.name);

    }
}