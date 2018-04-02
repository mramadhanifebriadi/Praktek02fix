package praktek02fix;
public class jajargenjangAksi {
    public static void main(String[] args) {
        
        jajargenjang j1 = new jajargenjang();
        j1.alas = 5;
        j1.tinggi =5;
       
        j1.cetakInfo();
        System.out.println("Luas Jajargenjang ="+j1.hitungLuas());
        j1.cetakLuas();
        
        jajargenjang j2 = new jajargenjang();
        j2.cetakInfo();
        
        jajargenjang j3 = new jajargenjang(50,30);
        j3.cetakInfo();
    }
    
}
