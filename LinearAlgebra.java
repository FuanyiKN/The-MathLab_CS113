
public class LinearAlgebra {
    private double[][] matrix;
    private int rows;
    private int columns;

    public LinearAlgebra(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new double[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setElement(int i, int j, double element) {
        matrix[i][j] = element;
    }

    public double getElement(int i, int j) {
        return matrix[i][j];
    }

    public void rowEchelonForm() {
        for (int i = 0; i < rows; i++) {
            if (matrix[i][i] == 0) { //The idea here is to check if the first element in the matrix is 0, if it is, swap the row with the next row with a non-zero element.
                for (int k = i + 1; k < rows; k++) { //This loop is to find the next row with a non-zero element.
                    if (matrix[k][i] != 0) {
                        double[] temp = matrix[i];
                        matrix[i] = matrix[k];
                        matrix[k] = temp;
                        break;
                    }
                }
            }
            for (int j = i + 1; j < rows; j++) { //This loop performs row operations to make the elements below the diagonal 0.
                double ratio = matrix[j][i] / matrix[i][i];
                for (int k = 0; k < columns; k++) {
                    matrix[j][k] -= ratio * matrix[i][k];
                }
            }
        }
    }

    public void reducedRowEchelonForm() { //This is the elder brother of rowEchelonForm. It makes the elements above the diagonal 0.
        rowEchelonForm();
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                double ratio = matrix[j][i] / matrix[i][i];
                for (int k = 0; k < columns; k++) {
                    matrix[j][k] -= ratio * matrix[i][k];
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            double divisor = matrix[i][i];
            for (int j = 0; j < columns; j++) {
                matrix[i][j] /= divisor;
            }
        }
    }

    // Method to convert a matrix to upper triangular form.
    private double[][] toUpperTriangular(double[][] matrix) {
        int n = matrix.length;
        double[][] upperMatrix = new double[n][n];

        // Copy original matrix to avoid the wahala of modifying it.
        for (int i = 0; i < n; i++) {
            System.arraycopy(matrix[i], 0, upperMatrix[i], 0, n);
        }

        // Perform Gaussian elimination
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (upperMatrix[i][i] == 0) {
                    throw new ArithmeticException("Division by zero detected during Gaussian elimination.");
                }
                double factor = upperMatrix[j][i] / upperMatrix[i][i];
                for (int k = i; k < n; k++) {
                    upperMatrix[j][k] -= factor * upperMatrix[i][k];
                }
            }
        }
        return upperMatrix;
    }

    public String determinant() { //Now life is easy, because the matrix is in upper triangular form.
        if (rows != columns) {
            return "The matrix is not square. Determinant cannot be calculated.";
        }

        double[][] upperTriangularMatrix = toUpperTriangular(matrix);
        double det = 1;
        for (int i = 0; i < rows; i++) {
            det *= upperTriangularMatrix[i][i];
        }
        return "The determinant of the matrix is: " + det;
    }


    public double[][] transpose() { //This method exchanges the rows with the columns. Light work, haha
        double[][] transposeMatrix = new double[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        return transposeMatrix;
    }

    //This is one of the things we needed help with. We just added it for good measure. Definitely not our work.
    public double[][] inverse() {
        if (rows != columns) {
            return null;
        }
        double[][] augmentedMatrix = new double[rows][2 * columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                augmentedMatrix[i][j] = matrix[i][j];
                augmentedMatrix[i][j + columns] = (i == j) ? 1 : 0;
            }
        }
        for (int i = 0; i < rows; i++) {
            if (augmentedMatrix[i][i] == 0) {
                for (int k = i + 1; k < rows; k++) {
                    if (augmentedMatrix[k][i] != 0) {
                        double[] temp = augmentedMatrix[i];
                        augmentedMatrix[i] = augmentedMatrix[k];
                        augmentedMatrix[k] = temp;
                        break;
                    }
                }
            }
            double divisor = augmentedMatrix[i][i];
            for (int j = 0; j < 2 * columns; j++) {
                augmentedMatrix[i][j] /= divisor;
            }
            for (int j = 0; j < rows; j++) {
                if (i != j) {
                    double ratio = augmentedMatrix[j][i];
                    for (int k = 0; k < 2 * columns; k++) {
                        augmentedMatrix[j][k] -= ratio * augmentedMatrix[i][k];
                    }
                }
            }
        }
        double[][] inverseMatrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                inverseMatrix[i][j] = augmentedMatrix[i][j + columns];
            }
        }
        return inverseMatrix;
    }

}
