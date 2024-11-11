// Leetcode 73 Set Matrix Zeroes Medium 11/11/2024 
public class setZero{
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;        
        int n = matrix[0].length;     
        boolean row = false;          
        boolean col = false;          

        // zero out the first row and columns as a marker if corresponding row or col has zero
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) row = true;  
                    if (j == 0) col = true;  
                    matrix[0][j] = 0;        
                    matrix[i][0] = 0;        
                }
            }
        }

        // Step 2: Use the markers in the first row and column to set the rest of the matrix to zero
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;       // Set the cell to zero if its row or column is marked
                }
            }
        }

        // Step 3: Set the first row to zero if needed
        if (row) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;          // Zero out the entire first row
            }
        }

        // Step 4: Set the first column to zero if needed
        if (col) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;          // Zero out the entire first column
            }
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        
        setZero solution = new setZero();
        solution.setZeroes(matrix);

        // Print the modified matrix
        System.out.println("Modified matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}