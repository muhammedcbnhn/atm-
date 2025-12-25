import java.util.Scanner;
public class login {

public boolean login(kullanici Kullanici) {
    String username;
    String password;

    Scanner sc = new Scanner(System.in);
    System.out.print("Username: ");
    username = sc.nextLine();
    System.out.print("Password: ");
    password= sc.nextLine();
    if (username.equals(Kullanici.getKullaniciAdi()) && password.equals(Kullanici.getParola())) {
        return true;
    }
    else{
        return false;
    }


}

}
