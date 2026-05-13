import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        User [] arr = new  People [4];
        Scanner scan_int = new  Scanner (System.in);
        Scanner Scan_string = new Scanner(System.in);
        for (int i = 0 ; i <= 1 ; i ++)
        {
            System.out.println("введите ФИО");
            String fio = Scan_string.nextLine();
            System.out.println("введите возраст ");
            int age = scan_int.nextInt();
            System.out.println("введите должность ");
            String post = Scan_string.nextLine();
            arr[i] = new Teacher(fio,age , post);
            System.out.println("Введите логин ");
            String login = Scan_string.nextLine();
            System.out.println("введите пароль");
            String pasvord = Scan_string.nextLine();
            arr[i].t(login, pasvord);
        }
        for (int i = 0 ; i <= 1 ; i ++)
        {
            System.out.println("введите ФИО");
            String fio = Scan_string.nextLine();
            System.out.println("введите возраст ");
            int age = scan_int.nextInt();
            System.out.println("введите должность ");
            String post = Scan_string.nextLine();
            arr[i] = new Student(fio,age , post);
            System.out.println("Введите логин ");
            String login = Scan_string.nextLine();
            System.out.println("введите пароль");
            String pasvord = Scan_string.nextLine();
            arr[i].t(login, pasvord);
        }

    }
}
interface  User {
    void t (String login , String pasvord);
}
abstract  class  People implements  User{
    String fio;
    int age ;
    String post;
    People (String fio, int age,String post) {
        this.fio = fio;
        this.age = age;
        this.post = post;
    }

    public void t(String login, String pasvord){
        System.out.println("login" + login + ", passvord "  + pasvord);
    }
}
class  Teacher extends  People
{
    Teacher (String fio , int age , String post){super( fio , age , post);}
    @Override
    public void t(String login, String pasvord){
        System.out.println("login" + login + ", pasvord "  + pasvord);
    }

}
class  Student extends  People
{
    Student (String fio , int age , String post){super( fio , age , post);}
    @Override
    public void t(String login, String pasvord){
        System.out.println("login" + login + ", pasvord "  + pasvord);
    }
}