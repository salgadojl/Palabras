/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabras;

public class PrimeraMayuscula {

    /**
     * Dada una cadena de caracteres se pasara a mayusculas la primera letra de
     * cada palabra, es decir, de aquellas palabras que esten despues de un
     * espacio, un punto o una coma, y tambien de la primera palabra de la
     * cadena.
     * 
     * @param cadena
     *            cadena a modificar
     * @return cadena modificada
     * 
     * @example "linea de codigo" -> "Linea De Codigo"
     */
    public static String primeraMayuscula(String cadena) {
        
        if(cadena == null || cadena.length() == 0)
            return cadena;      
        
        char[] caracteres = cadena.toCharArray();
        
        // El primer caracter siempre se pone en mayuscula.
        caracteres[0] = Character.toUpperCase(caracteres[0]);

        for (int i = 0; i < cadena.length() - 2; i++)
            if (caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',')
                caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);

        return new String(caracteres);
    }


}
