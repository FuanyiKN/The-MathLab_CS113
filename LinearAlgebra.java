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
            if (matrix[i][i] == 0) {
                for (int k = i + 1; k < rows; k++) {
                    if (matrix[k][i] != 0) {
                        double[] temp = matrix[i];
                        matrix[i] = matrix[k];
                        matrix[k] = temp;
                        break;
                    }
                }
            }
            for (int j = i + 1; j < rows; j++) {
                double ratio = matrix[j][i] / matrix[i][i];
                for (int k = 0; k < columns; k++) {
                    matrix[j][k] -= ratio * matrix[i][k];
                }
            }
        }
    }

    public void reducedRowEchelonForm() {
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

    public String determinant() {
        if (rows != columns) {
            return "The matrix is not square. Determinant cannot be calculated.";
        }
        double det = 1;
        for (int i = 0; i < rows; i++) {
            det *= matrix[i][i];
        }
        return "The determinant of the matrix is: " + det;
    }

    public double[][] transpose() {
        double[][] transposeMatrix = new double[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        return transposeMatrix;
    }

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

    public String getMatrixString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == (long) matrix[i][j]) {
                    sb.append((long) matrix[i][j]).append(" ");
                } else {
                    sb.append(matrix[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
