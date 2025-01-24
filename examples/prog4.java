package examples;

public interface prog4 {
	public static void main(String[] args){
		int num =123456,min=9,max=0;
		while(num!=0) {
			int r=num%10;
			if(r>max) {
				max=r;
			}
			else if(r<min){
				min=r;
			}
			num =num/10;
		}
		System.out.println("min--->"+min);
		System.out.println("max--->"+max);

		
		
	} 

	

}
