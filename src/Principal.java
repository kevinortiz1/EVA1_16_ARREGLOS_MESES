
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kevin Ortiz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] asMeses = {"Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] aiDias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //EQUIVALENTE A:
        /*
         String[] asMeses = new Sring[12];
         asMeses[0]= "Enero";
         asMEses[1]= "Febrero";
         ...
         */
        Scanner scCaptu = new Scanner(System.in);
        System.out.println("Introdice el # de mes [1-12] ");
        int iMes = scCaptu.nextInt();
        //Imprimir el mes(iMes va de 1 a 12. el arreglo va de 0 a 11,
        //por eso restamops 1.
        System.out.println("El mes es " + asMeses[iMes - 1] + " y tiene "
                + aiDias[iMes - 1] + " dias");
        
    }

}
