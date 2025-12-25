//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        kullanici Kullanici = new kullanici("muhammed","12345",1000);

        atm.atm(Kullanici);
        System.out.println("programdan çıkılıyor...");


    }
}