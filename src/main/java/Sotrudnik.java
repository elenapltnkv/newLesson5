public class Sotrudnik {
    String surname;
    String name;
    String post;
    String email;
    String phone;
    int salary;
    int age;

        Sotrudnik(String surname,
                  String name,
                  String post,
                  String email,
                  String phone,
                  int salary,
                  int age)
        {
        this.surname = surname;
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        }

        void printInfo() {
        System.out.println("Фамилия:" + this.surname);
        System.out.println("Имя:" + this.name);
        System.out.println("Должность:" + this.post);
        System.out.println("Email:" + this.email);
        System.out.println("Телефон:" + this.phone);
        System.out.println("Зарплата:" + this.salary);
        System.out.println("Возраст:" + this.age);
    }
}

