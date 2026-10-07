package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a conversiones de tipo.
 *
 * @author PRG
 * @version 1.0
 */
    public class Apartado030104 extends Apartado {
   
       protected String obtenerPractica(){
         return "P-VAR";
      }
   
       protected String obtenerBloque() {
         return "Conversiones de tipo";
      }
   
   /**
    * Conversiones de tipo - Ejercicio1.
    *
    * </br>
    *
    * Comprobar cuales de las conversiones implicitas realizadas son correctas y comentar las incorrectas.
    */
       public void ejercicio01() {
         cabecera("01","");
      
         byte varByte;
         short varShort;
         int varInt;
         long varLong;
         float varFloat;
         double varDouble;
         char varChar ;
         boolean varBoolean;
         
         varByte = 50;
         varShort = 1500 ;
         varInt = 1500000 ;
         varLong = 65000000 ;
         varFloat = 20.0E4F ;
         varDouble = 0.123456789e9 ;
         varChar = 'H' ;
         varBoolean = true ;
      
         varInt    = varShort; 
         varDouble = varFloat;
         varFloat  = varLong; 
         varLong   = varInt;
         varLong   = 9223372036854775807L;
         varFloat  = varLong;
        // INCORRECTAS  Hay que comentarlas para que compile:
        // varByte = varShort; // Error: un short (16 bits) no cabe directamente en un byte (8 bits)
        // varShort = varInt; // Error: un int (32 bits) no cabe directamente en un short (16 bits)  
      
      }
   
   /**
    * Conversiones de tipo - Ejercicio2.
    *
    * </br>
    *
    * Asignar varLong al resto de variables realizando las conversiones explicitas necesarias
    * Imprime por pantalla el resultado de dichas conversiones
    */
       public void ejercicio02() {
         cabecera("02", "");
      
      // Inicio modificacion
         long varLong = 35000L;
         int varInt = 0;
         short varShort = 0;
         byte varByte = 0;

         varInt = (int) varLong;
         varShort = (short) varLong;
         varByte = (byte) varLong;

         System.out.println("int: " + varInt);
         System.out.println("short: " + varShort);
         System.out.println("byte: " + varByte);
      // Fin modificacion
      }
   
   /**
    * Conversiones de tipo - Ejercicio3.
    *
    * </br>
    *
    * Asignar varFloat al resto de variables realizando las conversiones necesarias.
    * Imprime por pantalla el resultado de dichas conversiones
    */
       public void ejercicio03() {
         cabecera("03", "");
      // Inicio modificacion
        float varFloat = 123.1f;
        double varDouble = 0.0;
        long varLong = 0L;
        int varInt = 0;
        short varShort = 0;
        byte varByte = 0;

        varDouble = varFloat; // Implícita
        varLong = (long) varFloat; // Explícita
        varInt = (int) varFloat; // Explícita
        varShort = (short) varFloat; // Explícita
        varByte = (byte) varFloat; // Explícita

        System.out.println("De float a double: " + varDouble);
        System.out.println("De float a int (pierde el .1): " + varInt);
        // Fin modificacion
      }
   
   /**
    * Conversiones de tipo - Ejercicio4.
    *
    * </br>
    *
    * Arreglar los posibles errores de compilacion y explicar en el fichero LEEME.TXT los resultados    */
       public void ejercicio04() {
         cabecera("04", "");
      
         double dGigante = 1.766e289; 
         double dNormal = 35.987654321; 
         double dMinimo = 0.2E-256;

         float fGigante = (float)dGigante; 
         float fNormal = (float)dNormal; 
         float fMinimo = (float)dMinimo; 

         System.out.println("Gigante: " + fGigante);
         System.out.println("Normal: " + fNormal);
         System.out.println("Minimo: " + fMinimo);

         byte b = (byte)130; 
         short s = (short)32770; 
         int i = (int) 21474836501L; 

         System.out.println("Byte: " + b);
         System.out.println("Short: " + s);
         System.out.println("Int: " + i);

         float f = 1.3e22f; 
         System.out.println("f: " + f);
      }
   }
EOF