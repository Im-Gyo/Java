package CodingTest;

public class Test11 {

	public static void main(String[] args) {
		boolean res;		
		int y = 8;
		int z = 10;
		      res = ++y <z || ++y==z && ++y ==z;
		      System.out.println(res);
		      System.out.println(y);
		      
		      res = ++y <z && ++y==z || ++y ==z;
		       
		      System.out.println(res);
		      System.out.println(y);
		      
		      
		      res = ++y <z && ++y==z  || ++y ==z;
		      System.out.println(res);
		      System.out.println(y);
	}

}
