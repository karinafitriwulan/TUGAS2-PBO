public class nomor1{
	String nim, nama, jurusan, fakultas;
	
	public nomor1()
	{
		nim ="13020180137";
		nama ="Karina fitriwulandari ilham";
		jurusan ="Teknik Informatika";
		fakultas ="Ilmu Komputer";
	}
	
	public static void main(String[] args)
	{
		nomor1 bio = new nomor1();
		
		System.out.println("Nim		: " +(bio.nim));
		System.out.println("Nama	: " +(bio.nama));
		System.out.println("Jurusan	: " +(bio.jurusan));
		System.out.println("Fakultas: " +(bio.fakultas));
	}
}