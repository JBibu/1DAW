public class Ejemplo207{
    public static void main(String[] args){
        
        int [][] matriz = {
            {2, 6, 7, 8, 1},
            {8, 9, 3, 2, 3},
            {6, 7, 8, 2, 1},
            {9, 5, 4, 5, 9},
            {7, 3, 4, 8, 2},
        };

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}