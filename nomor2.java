public class nomor2{
	int totalDetik, detikSekarang, totalMenit, menitSekarang, totalJam, jamSekarang;
	
public nomor2(){
	totalDetik = 1203186020;
	detikSekarang = totalDetik%60;
	totalMenit = totalDetik/60;
	menitSekarang = totalMenit%60;
	totalJam = totalMenit/60;
	jamSekarang = totalJam%24;
}
	
public static void main(String[] args)
	{
		nomor2 a = new nomor2();
		
		System.out.println((a.jamSekarang) +" : "+(a.menitSekarang)+" : "+(a.detikSekarang));
	}	
}