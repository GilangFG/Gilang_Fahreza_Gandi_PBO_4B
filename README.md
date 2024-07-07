# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data guru menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NUPTK Guru, dan memberikan output berupa informasi detail dari NUPTK tersebut seperti tahun mengajar, pangkat, sekolah, kelas, dan mata pelajaran.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Guru`, `GuruDetail`, dan `GuruBeraksi` adalah contoh dari class.

```bash
public class guru {
Guru
}

public class guruDetail extends Mahasiswa {
GuruDetail
}

public class guruBeraksi {
    GuruBeraksi
}
```

2. **Object** adalah instance dari class. Pada kode ini, `pengajar[i] = new guruDetail(nama, nuptk);` adalah contoh pembuatan object.

```bash
pengajar[i] = new gurudetail (nama, nuptk);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `nuptk` adalah contoh atribut.

```bash
private String nama;
    private String nuptk;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Guru` dan `GuruDetail`.

```bash
public guru(String nama, String nuptk) {
        this.nama = nama;
        this.nuptk = nuptk;
}
public gurudetail(String nama, String nuptk) {
        super(nama, nuptk);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNuptk` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;}

public void setNuptk(String nuptk) {
        this.nuptk = nuptk;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNuptk` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getNuptk() {
    return nuptk;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `nuptk` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String nuptk;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class MahasiswaDetail extends Guru {
    public gurudetail(String nama, String nuptk) {
        super(nama, nuptk);
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Guru` merupakan overloading method `displayInfo` dan `displayInfo` di `GuruDetail` merupakan override dari method `displayInfo` di `Guru`.

```bash
public String displayinfo(String mapel) {
        return displayinfo() + "\nMapel: "+mapel;
}

@Override
public String displayInfo() {
    return super.displayinfo()+
                    "\nTahun Mengajar: "+getTahunMengajar()+
                    "\nPangkat: "+getPangkat()+
                    "\nTingkat Sekolah: "+getSekolah()+
                    "\nKelas: "+getKelas()+
                    "\nMata Pelajaran: "+getMataPelajaran();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getPangkat` dan seleksi `switch` dalam method `getSekolah`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < mahasiswas.length; i++) {
    System.out.print ("masukkan nama guru "+(i+1)+": ");
                String nama = scanner.nextLine(); 
                System.out.print("masukkan nuptk guru "+(i+1)+": ");
                String nuptk = scanner.nextLine();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print ("masukkan nama guru "+(i+1)+": ");
                String nama = scanner.nextLine(); 
                System.out.print("masukkan nuptk guru "+(i+1)+": ");
                String nuptk = scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `GuruDetail[] Pengajar = new GuruDetail[2];` adalah contoh penggunaan array.

```bash
gurudetail[] pengajar = new gurudetail[1];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    catch (NumberFormatException e){
            System.out.println("Kesalahan Input Nuptk: "+e.getMessage());
        }   
            catch (Exception e) {
                System.out.println("Kesalahan Input Data: "+e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Gilang Fahreza Gandi
NPM: 2210010388
