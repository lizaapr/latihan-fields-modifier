public class Nasabah{
	public static void main(String[] args) {
		Bank nasabah1 = new Bank();
		Bank nasabah2 = new Bank();

		nasabah1.namaNasabah("Liza");
		nasabah1.addSaldo(80);
		nasabah1.minSaldo(20, "Terimakasih transaksi telah berhasil!");
		nasabah1.showInfo();
	}
}