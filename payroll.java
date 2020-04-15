import java.util.Scanner;

public class payroll {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nama,nim,divisi;
        int gol,hari,asuransi,gapok,transport,total,gaji;
        identitas identitas = new identitas();

        identitas.kelompok("Kelompok 46");
        identitas.aplikasi();
        System.out.print ("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print ("Masukkan NIM : ");
        nim = input.nextLine();
        System.out.print ("Masukkan Divisi : ");
        divisi = input.nextLine();
        System.out.println ("Golongan Karyawan : \n <1>I\n <2>II\n <3>III" );
        System.out.print ("Masukkan Pilihan : ");   
        gol = input.nextInt(); 
        System.out.print ("Masukkan Jumlah Hari Masuk : ");
        hari = input.nextInt();
        transport = 0;
        // Transport setiap hari ke 7 ditambah bonus 10.000
        for (int i = 1; i <= hari; i++) {
            if (i % 7 == 0) {
                transport += 20000;
            } else {
                transport += 10000;
            }
        }
        System.out.println ("\n-----------------------------");
        System.out.println ("Nama \t: "+nama);
        System.out.println ("NIM \t: "+nim);
        System.out.println ("Divisi \t: "+divisi);
       
        switch (gol) {
            case 1:
                gapok=3000000;
                asuransi=gapok*5/100;
                gaji=gapok-asuransi;
                total=gaji+transport;
                tampilkan(transport,gapok,asuransi,total);
                break;
            case 2:
                gapok=2500000;
                asuransi=gapok*3/100;
                gaji=gapok-asuransi;
                total=gaji+transport;
                tampilkan(transport,gapok,asuransi,total);
                break;
            case 3:
                gapok=2000000;
                asuransi=gapok*2/100;
                gaji=gapok-asuransi;
                total=gaji+transport;
                tampilkan(transport,gapok,asuransi,total);
                break;
            default:
                break;
        }  
    }

    //function  
static void tampilkan(int transport, int gapok, int asuransi, int total) {
    System.out.println ("Tunjangan Transport : "+transport);
    System.out.println ("Gaji Pokok : "+gapok);
    System.out.println ("Asuransi : "+asuransi);
    System.out.println ("Total Gaji : "+total);
}
}



