package praktek02fix;
public class jajargenjang {
    double alas;
    double tinggi;
    
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
}
