import java.util.Scanner ;

public class AplikasiTanah
{
    public static void main(final String... args) {
        // Membuat Scanner yang digelar "in" .
        final Scanner in = new Scanner(System.in);

        // Declaring 4 Tanah ;
        Tanah tanah1, tanah2, tanah3, tanah4, tanahBesar;

        // Creating 4 Tanah object .
        tanah1 = new Tanah(tanahjajahan , panjang , lebar , mahar );
        tanah2 = new Tanah(tanahjajahan , panjang , lebar , mahar);
        tanah3 = new Tanah(tanahjajahan , panjang , lebar , mahar);
        tanah4 = new Tanah(tanahjajahan , panjang , lebar , mahar);
        tanahBesar = new Tanah(tanahjajahan , panjang , lebar , mahar);

        // Assigning the values of attributes of the objects .
        System.out.println("Sila masukkan lokasi tanah pertama : ");
        tanah1.setTanahJajahan(in.nextLine());
        System.out.println("Sila masukkan lokasi tanah kedua : ");
        tanah2.setTanahJajahan(in.nextLine());
        System.out.println("Sila masukkan lokasi tanah ketiga : ");
        tanah3.setTanahJajahan(in.nextLine());
        System.out.println("Sila masukkan lokasi tanah keempat : ");
        tanah4.setTanahJajahan(in.nextLine());

        System.out.println("Sila masukkan panjang tanah pertama : ");
        tanah1.setPanjang(in.nextInt());
        System.out.println("Sila masukkan panjang tanah kedua : ");
        tanah2.setPanjang(in.nextInt());
        System.out.println("Sila masukkan panjang tanah ketiga : ");
        tanah3.setPanjang(in.nextInt());
        System.out.println("Sila masukkan panjang tanah keempat : ");
        tanah4.setPanjang(in.nextInt());

        System.out.println("Sila masukkan lebar tanah pertama : ");
        tanah1.setLebar(in.nextInt());
        System.out.println("Sila masukkan lebar tanah kedua : ");
        tanah2.setLebar(in.nextInt());
        System.out.println("Sila masukkan lebar tanah ketiga : ");
        tanah3.setLebar(in.nextInt());
        System.out.println("Sila masukkan lebar tanah keempat : ");
        tanah4.setLebar(in.nextInt());

        final int luas1 = tanah1.ukurLuaspersegi();
        tanah1.setMahar(tanah1.kiraMaharTanah(luas1));
        final int luas2 = tanah2.ukurLuaspersegi();
        tanah2.setMahar(tanah2.kiraMaharTanah(luas2));
        final int luas3 = tanah3.ukurLuaspersegi();
        tanah3.setMahar(tanah3.kiraMaharTanah(luas3));
        final int luas4 = tanah4.ukurLuaspersegi();
        tanah4.setMahar(tanah4.kiraMaharTanah(luas4));

        //Comparing area of Lands.
        System.out.println((tanahBesar.bandingLuasTanah(tanah2,tanah3)).getTanahJajahan() + " ialah tanah terbesar.");

    }
}
