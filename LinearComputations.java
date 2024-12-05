import java.util.Scanner;

public class LinearComputations {
    Scanner scnr = new Scanner(System.in);

    private int rows;
    private int columns;
    private int [][] matrix;

    public LinearComputations() {
        this.rows = 0;
        this.columns = 0;
    }

    public LinearComputations(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }
    public void setRows(int rows) {
        this.rows = rows;
    }
    public int getColumns() {
        return columns;
    }
    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int [][] getMatrix() {
        return matrix;
    }
    public void setMatrix(int [][] matrix) {
        this.matrix = matrix;
    }

    //Method to row reduce the matrix to row echelon form.
    public int [][] ref (LinearComputations test) {
        rows = scnr.nextInt();
        columns = scnr.nextInt();
        matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scnr.nextInt();
            }
        }
        int lead = 0;

        for (int r = 0; r < rows; r++) {
            if (columns <= lead) {
                return matrix;
            }
            int i = r;
            while (matrix[i][lead] == 0) {
                i++;
                if (rows == i) {
                    i = r;
                    lead++;
                    if (columns == lead) {
                        return matrix;
                    }
                }
            }
            int [] temp = matrix[i];
            matrix[i] = matrix[r];
            matrix[r] = temp;
            int val = matrix[r][lead];
            for (int j = 0; j < columns; j++) {
                matrix[r][j] = matrix[r][j] / val;
            }
            for (i = 0; i < rows; i++) {
                if (i != r) {
                    val = matrix[i][lead];
                    for (int j = 0; j < columns; j++) {
                        matrix[i][j] = matrix[i][j] - val * matrix[r][j];
                    }
                }
            }
            lead++;
        }

        return matrix;
    }


    //Method to row reduce the matrix to reduced row echelon form.
    public int [][] rref(LinearComputations test) {
        rows = scnr.nextInt();
        columns = scnr.nextInt();
        matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scnr.nextInt();
            }
        }
        int lead = 0;

        for (int r = 0; r < rows; r++) {
            if (columns <= lead) {
                return matrix;
            }
            int i = r;
            while (matrix[i][lead] == 0) {
                i++;
                if (rows == i) {
                    i = r;
                    lead++;
                    if (columns == lead) {
                        return matrix;
                    }
                }
            }
            int [] temp = matrix[i];
            matrix[i] = matrix[r];
            matrix[r] = temp;
            int val = matrix[r][lead];
            for (int j = 0; j < columns; j++) {
                matrix[r][j] = matrix[r][j] / val;
            }
            for (i = 0; i < rows; i++) {
                if (i != r) {
                    val = matrix[i][lead];
                    for (int j = 0; j < columns; j++) {
                        matrix[i][j] = matrix[i][j] - val * matrix[r][j];
                    }
                }
            }
            lead++;
        }

        return matrix;
    }

    //Method to find the determinant of a matrix.
    public int det(LinearComputations test) {
        rows = scnr.nextInt();
        columns = scnr.nextInt();
        matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scnr.nextInt();
            }
        }
        int det = 0;
        if (rows == 2) {
            det = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            for (int i = 0; i < rows; i++) {
                int [][] temp = new int[rows - 1][columns - 1];
                for (int j = 1; j < rows; j++) {
                    for (int k = 0; k < columns; k++) {
                        if (k < i) {
                            temp[j - 1][k] = matrix[j][k];
                        } else if (k > i) {
                            temp[j - 1][k - 1] = matrix[j][k];
                        }
                    }
                }
                det += matrix[0][i] * Math.pow(-1, i) * det(new LinearComputations(rows - 1, columns - 1));
            }
        }
        return det;
    }

    //Method to find the inverse of a matrix.
    public int [][] inv(LinearComputations test) {
        rows = scnr.nextInt();
        columns = scnr.nextInt();
        matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scnr.nextInt();
            }
        }
        int [][] temp = new int[rows][columns * 2];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                temp[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = columns; j < columns * 2; j++) {
                if (j == i + columns) {
                    temp[i][j] = 1;
                } else {
                    temp[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            int lead = i;
            while (temp[lead][i] == 0) {
                lead++;
                if (rows == lead) {
                    return matrix;
                }
            }
            int [] temp2 = temp[lead];
            temp[lead] = temp[i];
            temp[i] = temp2;
            int val = temp[i][i];
            for (int j = 0; j < columns * 2; j++) {
                temp[i][j] = temp[i][j] / val;
            }
            for (int k = 0; k < rows; k++) {
                if (k != i) {
                    val = temp[k][i];
                    for (int j = 0; j < columns * 2; j++) {
                        temp[k][j] = temp[k][j] - val * temp[i][j];
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = temp[i][j + columns];
            }
        }
        return matrix;
    }

    //Method to find the transpose of a matrix.
    public int [][] transpose(LinearComputations test) {
        rows = scnr.nextInt();
        columns = scnr.nextInt();
        matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scnr.nextInt();
            }
        }
        int [][] temp = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                temp[j][i] = matrix[i][j];
            }
        }
        return temp;
    }

    //Method to find the product of two matrices.
    public int [][] product(LinearComputations test) {
        rows = scnr.nextInt();
        columns = scnr.nextInt();
        matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scnr.nextInt();
            }
        }
        int rows2 = scnr.nextInt();
        int columns2 = scnr.nextInt();
        int [][] matrix2 = new int[rows2][columns2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scnr.nextInt();
            }
        }
        int [][] temp = new int[rows][columns2];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns2; j++) {
                temp[i][j] = 0;
                for (int k = 0; k < columns; k++) {
                    temp[i][j] += matrix[i][k] * matrix2[k][j];
                }
            }
        }
        return temp;
    }

    //Method to find the sum of two matrices.
    public int [][] sum(LinearComputations test) {
        rows = scnr.nextInt();
        columns = scnr.nextInt();
        matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scnr.nextInt();
            }
        }
        int rows2 = scnr.nextInt();
        int columns2 = scnr.nextInt();
        int [][] matrix2 = new int[rows2][columns2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scnr.nextInt();
            }
        }
        int [][] temp = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                temp[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }
        return temp;
    }

    //Method to find the difference of two matrices.
    public int [][] difference(LinearComputations test) {
        rows = scnr.nextInt();
        columns = scnr.nextInt();
        matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scnr.nextInt();
            }
        }
        int rows2 = scnr.nextInt();
        int columns2 = scnr.nextInt();
        int [][] matrix2 = new int[rows2][columns2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scnr.nextInt();
            }
        }
        int [][] temp = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                temp[i][j] = matrix[i][j] - matrix2[i][j];
            }
        }
        return temp;
    }

    //Method to find the scalar product of a matrix.
    public int [][] scalarProduct(LinearComputations test) {
        rows = scnr.nextInt();
        columns = scnr.nextInt();
        matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scnr.nextInt();
            }
        }
        int scalar = scnr.nextInt();
        int [][] temp = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                temp[i][j] = matrix[i][j] * scalar;
            }
        }
        return temp;
    }
}
