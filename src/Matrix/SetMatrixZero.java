package Matrix;

public class SetMatrixZero {
	
	public static void main(String[] args) {
		int[][] matrix = {{1,1,1,0},{1,1,1,0},{1,1,0,0}};
		
		SetMatrixZero obj = new SetMatrixZero();
		obj.setZero(matrix);
		
	}
	
	public void setZero(int[][] matrix) {
		boolean firstRowZero = false;
		boolean firstColumnZero = false;
		//check first column is zero 
		for(int i=0; i<matrix.length; i++) {
			if(matrix[i][0] == 0) {
				firstColumnZero = true;
				break;
			}
		}
		
		// check first row is zero
		for(int i=0; i< matrix[0].length; i++) {
			if(matrix[0][i] == 0) {
				firstRowZero = true;
				break;
			}
		}
		
		
		
	}

}
