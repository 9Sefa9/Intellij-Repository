package GPT;

public class Table {
	private int[][] data = null;

	// spalten zeilen
	// creates table with provided number of columns, number of rows
	public Table(int numCols, int numRows) {
		data = new int[numCols][numRows];
	}

	// returns number of columns
	public int getNumCols() {
		return data.length;
	}

	// returns number of rows
	public int getNumRows() {
		return data[0].length;
	}

	// returns value of given cell
	public int get(int col, int row) {
		return data[col][row];
	}

	// sets value of given cell
	public void set(int col, int row, int val) {
		this.data[col][row] = val;
	}

	// returns column at given index as an array
	public int[] getCol(int index) {
		int array[] = new int[data.length];
		for(int i=0; i<=data.length-1; i++){
			array[i] = data[i][index];	
		}
		return array;
	}

	// replaces column at index with provided array
	public void setCol(int index, int[] col) {
		for(int i=0; i<=data.length-1; i++)
			data[i][index] = col[i];
		
	}

	// returns row at given index as an array
	public int[] getRow(int index) {
		int[] array = new int[index];
		
		for(int i = 0; i<= data[index].length-1; i++){
			data[index][i] = array[i];
		}
		return array ;
	}

	// replaces row at index with provided array
	public void setRow(int index, int[] row) {
		for(int i=0; i<=data[0].length-1; i++)
		data[index][i] = row[i];
	}

	// returns sum of column at given index
	public int getColSum(int index) {
		int sum =0;
		for(int i = 0; i<= data.length-1; i++)
		sum+=data[i][index];
		
		return sum;
	}

	// returns sum of row at given index
	public int getRowSum(int index) {
		int sum =0;
		for(int i = 0; i<= data[index].length-1; i++)
		sum+=data[index][i];
		
		return sum;
	}

	// returns sum of all cells
	public int getSum() {
		int sum = 0;
		for(int i = 0; i<=data.length-1; i++){
			for(int j = 0; j<=data[i].length-1;j++){
				sum+=data[i][j];
			}
		}
		return sum;
	}

	// prints table to console
	public void print() {
		 for(int i=0; i<data.length; i++) {
		       for(int j=0; j<data[i].length; j++){
		    	   System.out.print(data[i][j] + " ");
		       }
		       System.out.println();
		        
		 }
	       
	}

	public static void main(String[] args) {
		int[] arr = {2,4,2,8,7,3};
		Table t = new Table (4,6);
		t.set(0, 0, 4);
		t.set(3, 4, 1);
		t.set(3, 2, 4);
		t.set(2, 5, 9);
		t.set(1, 5, 9);
		
		t.setRow(1, arr);
		t.setCol(1, arr);
			t.print();
			for(int i: t.getCol(1))
				System.out.print(i+", ");
//		System.out.println(t.getSum());
//		System.out.println(t.getRowSum(3));
//		System.out.println(t.getColSum(5));
	}
}