package praktek02fix;
public class jajargenjang {
    double alas;
    double tinggi;

    public jajargenjang() {
        alas=4;
        tinggi=4;
    }

    public jajargenjang(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    
    void cetakInfo(){
        System.out.println("====wkwk==NGITUNG LUAS JAJARGENJANG==wkwk====");
        System.out.println("ALAS NA SABARAHA? :"+alas);
        System.out.println("TINGGI NA SABARAHA? :"+tinggi);
        System.out.println("====hmmmmm====oke====hmmmmm======");
    }
    
    double hitungLuas(){
        double luas;
        luas=alas*tinggi;
        return luas;
    }
    
     void cetakLuas(){
        System.out.println("Luasnya adalah= "+hitungLuas());
    }  
}
