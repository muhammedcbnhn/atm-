public class kullanici {
    private String kullaniciAdi;
    private String parola;
    private double bakiye;

    public kullanici(String kullaniciAdi, String parola, double bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }


    public void setKullaniciAdi(String adi) {
        this.kullaniciAdi = adi;
    }

    public String getKullaniciAdi() {
        return this.kullaniciAdi;
    }
    public void setParola(String parola) {
        this.parola = parola;
    }
    public String getParola() {
        return this.parola;
    }
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public double getBakiye() {
        return this.bakiye;
    }

    public void paracek(int tutar){
        if(bakiye<tutar){
            System.out.println("yetersiz bakiye, mevcut bakiyeniz :"+bakiye);
        }else {
            bakiye -= tutar;
            System.out.println("yeni bakiye:" + bakiye);
        }
    }
    public void parayatir(int tutar){
        bakiye+=tutar;
        System.out.println("yeni bakiye:"+bakiye);
    }
}
