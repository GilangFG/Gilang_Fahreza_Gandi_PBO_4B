package uas;

public class guru {
   //atribut dan encapsulation
    private String nama;
    private String nuptk;

    //constructor
    public guru(String nama, String nuptk) {
        this.nama = nama;
        this.nuptk = nuptk;
    }
    
    //mutator 
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNuptk(String nuptk) {
        this.nuptk = nuptk;
    }
    
    //accessor
    public String getNama() {
        return nama;
    }

    public String getNuptk() {
        return nuptk;
    }
    
    public String displayinfo(){
         return "nama: "+getNama()+
                "\nnuptk: "+getNuptk();
    }
    
    //polymorphism (overload)
    public String displayinfo(String mapel) {
        return displayinfo() + "\nMapel: "+mapel;
    } 
        
}
 