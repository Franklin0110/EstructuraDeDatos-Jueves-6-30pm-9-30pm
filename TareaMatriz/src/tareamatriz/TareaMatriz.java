/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareamatriz;

/**
 *
 * @author Franklin Rojas Vargas
 */
import java.util.Scanner;

public class TareaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Diagonalderecha = 1;
        int Diagonalizquierda = 1;
        int temp;
        String verificacion = "";
        int matriz[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor Dijite los valores de la matriz.");
        for (int columna = 0; columna < 3; columna++) {
            for (int fila = 0; fila < 3; fila++) {

                System.out.println("Valor Columna: " + columna + " Fila: " + fila);
                verificacion = scanner.nextLine();

                matriz[columna][fila] = Integer.parseInt(verificacion);

            }
        }
        for (int i = 0; i <= 2; i++) {
            temp = matriz[i][i];

            Diagonalderecha *= temp;

        }
        for (int i = 2; i >= 0; i--) {
            temp = matriz[i][i];
            Diagonalizquierda *= temp;
        }

        System.out.println("Valor de Diagonal Izquierda: " + Diagonalizquierda + " Valor de Diagonal Derecha: " + Diagonalderecha);

    }

}
