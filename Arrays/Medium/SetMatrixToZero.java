public class SetMatrixToZero{
	public static void display(int matrix[][]){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void setZeroes(int[][] matrix) {
       	boolean row[] = new boolean[matrix.length];
        	boolean col[] = new boolean[matrix[0].length];
	
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
                    			row[i] = true;
                    			col[j] = true;
				}
			}
		}
		
		for(int i=0;i<matrix.length;i++){
            		for(int j=0;j<matrix[i].length;j++){
               		if(col[j]){
                    			matrix[i][j] = 0;
                		}else if(row[i]){
                    			matrix[i][j] = 0;
                		}
            		}
        	}
    }
	public static void main(String args[]){
		int matrix[][] = {{1,1,1},{1,1,0},{1,1,1}};
		
		setZeroes(matrix);
		display(matrix);
	}
}
