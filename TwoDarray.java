
public class TwoDarray {

	public static void main(String[] args) {
		int sum=0;
		int[][] arr1={{1,2,3,4},{5,6,7,8}};
		for(int []i:arr1)
		{
			for(int j:i){
				sum=sum+j;
			}
		}
		System.out.println("SUM = "+sum);
	}
}
