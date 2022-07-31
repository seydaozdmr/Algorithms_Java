package src;

public class Aralik {

	public static void main(String[] args) {
		int n=Integer.parseInt("5");
		
		Interval1D [] aralik=new Interval1D[n];
		
		aralikOlustur(aralik);

		System.out.println("Aralık Çifti:");
		printIntervalIntersections(aralik);
	}

	private static void printIntervalIntersections(Interval1D[] aralik) {
		for(int i=0;i<aralik.length-1;i++) {
			System.out.println(i+": ");
			for(int j=i+1;j<aralik.length;j++) {
				
				if(aralik[i].intersects(aralik[j])) {
					System.out.printf("Aralık 1 - Min: %.3f Max: %.3f\n", aralik[i].min(),aralik[i].max());
					System.out.printf("Aralık 2 - Min: %.3f Max: %.3f\n", aralik[j].min(),aralik[j].max());
					System.out.println();
				}
				
			}
		}
		
	}

	private static void aralikOlustur(Interval1D[] aralik) {
		//aralığı rastgele değerlerle oluşturuyoruz.
		for(int i=0;i<aralik.length;i++) {
			double firstValue=StdRandom.uniform();
			double secondValue=StdRandom.uniform();
			
			if(firstValue>secondValue) {
				double temp=firstValue;
				firstValue=secondValue;
				secondValue=temp;
			}
			aralik[i]=new Interval1D(firstValue,secondValue);
		}
		
	}

}
