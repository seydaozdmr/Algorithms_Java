package algorithms;

public class ebob {

public static int ebb(int p,int q) {
		System.out.println("q: "+q+" p: "+p);
		//Bölümden kalan olmayana kadar yani tam bölünene kadar devam ediyor. Böylece en büyük ortak bölen bulunuyor.
		if(q==0) return p;
		//Bölümden kalanı r'ye atıyor.
		int r=p%q;
		//q'yu başa alıyor böylece küçük sayı büyüğü bölmeye bölmeye çalışıyor.
		return ebb(q,r);
	}
  
  public static void main(String[] args) {
		System.out.println(ebb(1111111,1234567));
		System.out.println(ebb(30,100));

	}

}
