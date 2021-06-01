import java.util.*;
public class SolutionLeet48{

	public static void main(String[] args) {
		
		int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		transpose(matrix);
		reverse(matrix);
		for(int[] rows:matrix){
			System.out.println(Arrays.toString(rows));

		}

	}

	private static void transpose(int[][] M){

		int len=M[0].length;

		for(int i=0;i<len;i++){
			for(int j=i;j<len;j++){
				int temp=M[i][j];
				M[i][j]=M[j][i];
				M[j][i]=temp;
			}
		}
	}

	private static void reverse(int[][] M){

		int len=M[0].length;

		for(int i=0;i<len;i++){
			for(int j=0;j<len/2;j++){
				int temp=M[i][j];
				M[i][j]=M[i][len-j-1];
				M[i][len-j-1]=temp;
			}
		}
	}
}