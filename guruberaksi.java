package uas;

import java.util.Scanner;  

public class guruberaksi {
    public static void main(String[] args) {
          //eror handling
        try{
            //IO sederhana
            Scanner scanner = new Scanner(System.in);

            //array
            gurudetail[] pengajar = new gurudetail[1];

            for(int i=0; i<pengajar.length; i++){
                System.out.print ("masukkan nama guru "+(i+1)+": ");
                String nama = scanner.nextLine(); 
                System.out.print("masukkan nuptk guru "+(i+1)+": ");
                String nuptk = scanner.nextLine();

                //object
                pengajar[i] = new gurudetail (nama, nuptk);
            }

            for(gurudetail data: pengajar){
                System.out.println("                       ");
                System.out.println("Informasi Data Guru Sekolah");
                System.out.println(data .displayinfo());
            }
        }   catch (NumberFormatException e){
            System.out.println("Kesalahan Input Nuptk: "+e.getMessage());
        }   
            catch (Exception e) {
                System.out.println("Kesalahan Input Data: "+e.getMessage());
            }
        
    }
          
}
