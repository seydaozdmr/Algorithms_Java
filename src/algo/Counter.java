package src.algo;

public class Counter implements Comparable<Counter> {
	//Sayaç ismi
	private final String name;
	//Sayaç 
	private int count=0;
	
	public Counter(String id) {
		this.name=id;
	}
	
	//Arttıma metodu
	public void increment() {
		count++;
	}
	
	//Son eleman
	public int tally() {
		return count;
	}
	
	public String toString() {
		return count + " " + name;
	}
	//compareTo methodunu override ediyorum.
	@Override
	public int compareTo(Counter that) {
		if(this.count<that.count) 		return -1;
		else if(this.count>that.count)	return +1;
		else 							return 0;
	}
	
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int trials=Integer.parseInt(args[1]);
		Counter[] hits=new Counter[n];
		for(int i=0;i<n;i++) {
			hits[i]=new Counter("Sayaç "+i);
		}
		
		// Sayaçları rastgele arttırıyoruz.
        for (int t = 0; t < trials; t++) {
            hits[StdRandom.uniform(n)].increment();
        }
        
        //Sonuçları Bas
        for (int i = 0; i < n; i++) {
            System.out.println(hits[i]);
        }
		
		

	}

	

}
