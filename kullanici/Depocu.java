package kullanici;

//public class Depocu extends Kullanici {
//    public Depocu(String kullaniciAdi, String parola, String eposta) {
//        super("kullanici.Depocu", kullaniciAdi, parola, eposta);
//    }
//}

public class Depocu {
    private String ad;
    private String parola;
    private String eposta;
    private String rol;

    // Getter ve Setter
    public String getKullaniciAdi() { return ad; }
    public void setKullaniciAdi(String ad) { this.ad = ad; }
    public String getParola() { return parola; }
    public void setParola(String parola) { this.parola = parola; }
    public String getEposta() { return eposta; }
    public void setEposta(String eposta) { this.eposta = eposta; }
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}
