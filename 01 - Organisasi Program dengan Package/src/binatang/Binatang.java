package binatang;

class Biodata{
	String nama;
	String habitat;
	String makanan;

	Biodata(String nama, String habitat, String makanan){
		this.nama = nama;
		this.habitat = habitat;
		this.makanan = makanan;
	}

	void show(){
		System.out.println("nama hewan: " + this.nama);
		System.out.println("habitat: " + this.habitat);
		System.out.println("makanan: " + this.makanan);
	}
}

public class Binatang{
	public static void main(String[] args) {
		Biodata hewan1 = new Biodata("Penyu", "Perairan Laut", "Ikan, Rumput laut, Ubur ubur");
		hewan1.show();
	}
}