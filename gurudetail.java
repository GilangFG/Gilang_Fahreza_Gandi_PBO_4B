package uas;

//inheritance
public class gurudetail extends guru{
    //overriding
    public gurudetail(String nama, String nuptk) {
        super(nama, nuptk);
    }
        public int getTahunMengajar(){
            return Integer.parseInt(getNuptk().substring(0, 2)) + 2000;
        }    
        
        public String getPangkat(){
            String KodePangkat = getNuptk().substring(2, 4);
            if(KodePangkat.equals("01")){
                return "Guru Pengajar";
            } else {
                return "Pengurus";
            }
        }
        
        public String getSekolah(){
           String KodeSekolah = getNuptk().substring(4, 6); 
           switch(KodeSekolah){
               case "01":
                   return "Sekolah Dasar";
               case "02":
                   return "Sekolah Menengah Pertama";
               case "03":
                   return "Sekolah Menengah Atas";
               default:
                   return "Sekolah Lain";
           }      
        }
        public int getKelas(){
            return Integer.parseInt(getNuptk().substring(6, 8));
        }
        
        public String getMataPelajaran(){
            String KodeMataPelajaran = getNuptk().substring(8, 10);
            switch(KodeMataPelajaran){
                case "01":
                   return "Matematika";
               case "02":
                   return "B.Indonesia";
               case "03":
                   return "Ilmu Pengetahuan Alam";
               case "04":
                   return "Agama";
               default:
                   return "Pelajaran lain";
            }
                    
        }
        
        //polymorphism override
        @Override
        public String displayinfo(){
            return super.displayinfo()+
                    "\nTahun Mengajar: "+getTahunMengajar()+
                    "\nPangkat: "+getPangkat()+
                    "\nTingkat Sekolah: "+getSekolah()+
                    "\nKelas: "+getKelas()+
                    "\nMata Pelajaran: "+getMataPelajaran();
        }
}
