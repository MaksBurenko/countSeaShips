public class CountSeaShips {

    public static int count(int[][] matrix) {

        int result = 0;

        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                if(matrix[i][j] == 1){
                    boolean ex = examinationNewShip(matrix,i,j);
                    if(ex){
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static boolean examinationNewShip(int[][] matrix, int i, int j){
        if ((i> 0 && matrix[i-1][j] == 1) || (j>0 && matrix[i][j-1] == 1)){
            return false;
        }else
            return true;
    }
}
