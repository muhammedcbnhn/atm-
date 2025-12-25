import java.util.Scanner;

import static java.util.Scanner.*;

public class ATM {

    public void atm (kullanici Kullanici) {
        login login = new login();
        Scanner input = new Scanner(System.in);

        System.out.println("bankamıza hoşgeldiniz...");
        System.out.println("******************************");
        System.out.println("kullanıcı girişi");
        System.out.println("******************************");



        int giris_hakkı=3;
        while(true){
            kullanici kullanici;
            if(login.login(Kullanici)){
                System.out.println("giriş başarılı");
                break;
            }
            else{
                System.out.println("giriş başarsız...");
                giris_hakkı-=1;
                System.out.println("kalan giriş hakkı sayısı:"+giris_hakkı);
            }
            if(giris_hakkı==0){
                return;
            }

        }


        String islemler= "1. para yatırma \n"
                + "2. para çekme \n"
                + "3.bakiye sorgulama\n"
                +"4. çıkış için 'q' basın";

        System.out.println(islemler);
        System.out.println("******************************");



        while(true) {
            System.out.println("bir işlem seçiniz:");
            String islem = input.nextLine();


            if (islem.equals("1")) {
                System.out.println("yatırma istediğniz tutarı girin:");
            int tutar = input.nextInt();
                input.nextLine();
                Kullanici.parayatir(tutar);

            } else if (islem.equals("2")) {
                System.out.println("çekmek istediğniz tutarı girin:");
                int tutar = input.nextInt();
                input.nextLine();
                Kullanici.paracek(tutar);


            } else if (islem.equals("3")) {
                System.out.println("mevcut bakiyeniz:" + Kullanici.getBakiye());


            } else if (islem.equals("q")) {
                break;


            } else {
                System.out.println("gecersiz iselm...");
            }

        }
    }
    }

