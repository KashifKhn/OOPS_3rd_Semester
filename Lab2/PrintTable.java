public class PrintTable{
	
	public static void main(String[] args) {
		int tableNUm = 2;
		int upperLimit = 10;
		for(int i=1; i<=upperLimit; i++) {
			System.out.printf("\t\t%d x %d = %d\n", tableNUm, i, tableNUm * i);
		}
	}


}