public class coba{
	int a; 
	double b;
	
	//construktor default
	public coba(){
		a = 100;
		b = 3.14;
	}
	//construktor parameter
	public coba(int z){
		a = z;
	}
	
public static void main(String[] args){
	coba cb1 = new coba();
	coba cb2 = new coba(50);
	
	System.out.println(cb1.a);
	System.out.println(cb1.b);
	System.out.println(cb2.a);
}
}
	