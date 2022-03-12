/**
 * @author Aini Nurul Azizah
 * @since 2022-03-12
 * Class Restaurant, untuk menambahkan makanan
 * yang dijual dan stoknya
 */

public class Restaurant {
	private String[] nama_makanan;		// Data dienkapsulasi
	private double[] harga_makanan;
	private int[] stok;
	private static byte id = 0;
	
	public Restaurant() {				// Constructor
		nama_makanan = new String[10];
		harga_makanan = new double[10];
		stok = new int[10];
	}

	/**
	 * Method menambahkan menu makanan (Mutator)
	 * @param nama
	 * @param harga
	 * @param stok
	 */
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.nama_makanan[id] = nama;
		this.harga_makanan[id] = harga;
		this.stok[id] = stok;
	}
	
	/**
	 * Method menampilkan menu makanan
	 */
	public void tampilMenuMakanan(){
		System.out.println("\n=====   Daftar Menu   =====");
		for(int i = 0; i <= id; i++){
			if(!isOutOfStock(i)){		// Jika stok tidak kosong
				System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
			}
		}
		System.out.println("===========================");
	}
	
	/**
	 * Method mengkalkulasikan total harga yang harus dibayar
	 * @param jumlah
	 * @param harga
	 */
	public double totalHarga(int jumlah, double harga) {
		return jumlah * harga;
	}
	
	/**
	 * Method menampilkan pesanan
	 * @param makanan
	 * @param totalBayar
	 */
	public void printOrder(String makanan, double totalBayar) {
		System.out.println("\n==== Daftar Pesanan ====");
		System.out.println(makanan + "	 ---   " + totalBayar);
		System.out.println("========================");
	}
	
	/**
	 * Method melakukan pemesanan, terdiri dari proses pengecekkan stok,
	 * mencari makanan sesai menu, mengurangi stok, memanggil method kalkulasi
	 * pembayaran, memanggil method menampilkan pesanan
	 * @param makanan
	 * @param jumlah_pesanan
	 */
	public void order(String makanan, int jumlah_pesanan) {
		for(int i = 0; i <= id; i++) {
			if(!isOutOfStock(i)){
				if(nama_makanan[i].equals(makanan)) {
					stok[i] = stok[i] - jumlah_pesanan;
					double totalBayar = totalHarga(jumlah_pesanan, harga_makanan[i]);
					printOrder(makanan, totalBayar);
				}	
			}	
		}
	}

	/**
	 * Method mengecek apakah stok kosong(true) 
	 * atau tidak(false). Nilai kembalian adalah boolean
	 * @param id
	 */
	public boolean isOutOfStock(int id){
		if(stok[id] == 0){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * Method menambahkan id, untuk menambah elemen
	 */
	public static void nextId(){
		id++;
	}
}