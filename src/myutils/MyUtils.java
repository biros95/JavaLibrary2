/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myutils;

import java.util.*;

/**
 *
 * @author Lluis
 * Classe de funcions pròpies utils.
 */
public class MyUtils {
    

/**
 * 
 * @param cadena Strint cadena que es vol invertir
 * @return cadena invertida (null per cadenes nulls).
 */
public static String inverteix (String cadena)
{
    
    String CadenaInvertida = "";
    if (cadena!=null){
    for (int y=cadena.length()-1;y>=0;y--) {
     
     CadenaInvertida = CadenaInvertida + cadena.charAt(y);
    }
    }
    else{
        CadenaInvertida=null;
    }
   
    
    return CadenaInvertida;
}
/**
 * 
 * @param day int dia del naixement
 * @param month int  mes del naixement
 * @param year int any del naixement
 * @return edat de la persona, per edat>150 retorna -1, per dates impossibles retorna -2
 * 
 */
public static int edat (int day, int month, int year)
{
    Calendar calendari = Calendar.getInstance();
    Calendar calendari2 = Calendar.getInstance();
    calendari2.set(year, month-1, day);
   
     int edad=(calendari.get(Calendar.YEAR)-calendari2.get(Calendar.YEAR));
     if (calendari.get(Calendar.DAY_OF_YEAR)<calendari2.get(Calendar.DAY_OF_YEAR)) {
        edad-=1;
    }
    if (calendari2.compareTo(calendari)>0 || day>31 || month >12 || day<1 || month <1 ) {
        edad=-2;
    }
    if (edad>150) {
        edad=-1;
    }
    
    return edad;
}

/**
 * 
 * @param numero número del que es calcula el factorial
 * @return retorna el factorial d'un número. Si el nombre es negatiu retorna -1.
 */
public static double factorial (double numero) {
  if (numero == 0) {
            return 1;
        } else if (numero < 0) {
            return -1;
        } else {
            return numero * factorial(numero - 1);
        }
}
}
