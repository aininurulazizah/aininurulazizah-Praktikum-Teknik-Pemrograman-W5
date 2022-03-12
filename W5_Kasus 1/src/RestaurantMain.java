/**
 * @author Aini Nurul Azizah
 * @since 2022-03-12
 * Class RestaurantMain, sebagai main program
 * Disini dilakukan penambahan menu dan input
 * order atau pesanan
 */

import java.util.Scanner;

public class RestaurantMain {

	public static void main(String[] args) {
		Restaurant menu = new Restaurant();				// Membuat objek baru sebagai menu
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);	// Menambah menu, mulai dari makanan, harga, dan stok
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		menu.tampilMenuMakanan();						// Menampilkan menu makanan
		
		Scanner input = new Scanner(System.in);			
		System.out.println("\n==== Pesan makanan ====");
		System.out.println("Nama Makanan   : ");
		String makanan = input.nextLine();				// Menerima input pesanan makanan
		System.out.println("Jumlah Pesanan : ");
		int jumlah_pesanan = input.nextInt();			// Menerima input jumlah pesanan
		System.out.println("========================");
		
		menu.order(makanan, jumlah_pesanan);	// Melakukan order dengan memanggil methor order
		menu.tampilMenuMakanan();	// Menampilkan kembali menu makanan (stok berkurang)

	}

}
