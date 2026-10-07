package es.unileon.prg.tema5;

import java.math.BigDecimal;

/**
 * Clase con los ejercicios correspondientes a tipos de datos basicos.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030101 extends Apartado {

	protected String obtenerPractica() {
		return "P-VAR";
	}

	protected String obtenerBloque() {
		return "Tipos de datos basicos";
	}

	/**
	 * Tipos de datos basicos - Ejercicio1.
	 *
	 * </br>
	 *
	 * Se pide modificar el codigo a fin de eliminar los errores de compilacion
	 * existentes. Los errores de compilacion tienen que ver con el manejo de
	 * tipos de datos basicos.
	 */
	public void ejercicio01() {
		cabecera("01", "Correccion de errores de compilacion");

		// Inicio modificacion

// Int no existe, es int en minúscula.
int entero = 6; 

// Un número con puntos de millar da error. Los long llevan una 'L' al final.
long otroEntero = 1000L; 

// 7.0 es un decimal, no cabe en un long (que es solo para enteros). Lo cambio a double.
double decimal = 7.0; 

// Los decimales usan punto, no coma.
double otroDecimal = 7.0; 

// Un byte solo admite valores hasta 127. 10000 necesita al menos un short.
short enteroDe8Bits = 10000; 

// Los caracteres (char) deben ir entre comillas simples.
char caracter = 'a'; 

// Las comillas dobles, es una cadena (String).
String otrocaracter = "a"; 

// true es una palabra reservada, no lleva comillas.
boolean booleano = true; 

// Un short solo admite hasta 32767. 50000 necesita un int.
int enteroDe16Bits = 50000; 

// "static" e "int" son palabras reservadas del sistema, no pueden ser nombres de variables.
byte variableEstatica = 5; 
byte variableEntera = 3; 

// Los nombres de variables no pueden llevar guiones medios (-). Usamos camelCase.
double otraVariable = 2.0;
		// Fin modificacion
	}

	/**
	 * Tipos de datos basicos - Ejercicio2.
	 *
	 * </br>
	 *
	 * Se pide completar el codigo a fin de determinar el tipo de dato mas
	 * adecuado para cada literal.
	 */
	public void ejercicio02() {
		cabecera("02", "Definicion de tipo de datos");

		// Inicio modificacion
	// 637 es un número entero estándar.
int variable1 = 637;

// La 'L' indica explícitamente que es un long (entero largo).
long variable2 = 637L;

// Un número con decimales por defecto es double.
double variable3 = 6.37;

// La 'f' indica que es un float.
float variable4 = 6.37f;

// La 'd' indica double.
double variable5 = 6.37d;

// Las comillas simples indican un único carácter.
char variable6 = '6';

// Las comillas dobles indican una cadena de texto.
String variable7 = "6.37";

// Comilla simple = carácter.
char variable8 = 'a';

// Comilla doble = texto.
String variable9 = "a";

// Valor lógico.
boolean variable10 = true;
		// Fin modificacion
	}

	/**
	 * Tipos de datos basicos - Ejercicio3.
	 *
	 * </br>
	 *
	 * Se pide definir variables que permitan representar la informacion
	 * referida en los comentarios.
	 */
	public void ejercicio03() {
		cabecera("03", "Definicion de variables");

		// Inicio modificacion

		//Numero de asignaturas de un curso
		int numeroAsignaturas = 5;
		//Nota media de la asignatura
		double notaMedia = 7.5;
		//Edad de una persona
		int edadPersona = 30;
		//Salario mensual de un empleado
		double salarioMensual = 2500.0;
		//Nombre de una asignatura
		String nombreAsignatura = "Matemáticas";
		//Constante PI
		final double PI = 3.14159;
		//Constante VERDADERO´
		boolean constanteVerdadero = true;
		//Portal de la direccion de una vivienda
        int portal = 4;
		//Piso de la direccion de una vivienda
		int piso = 3;
		//Puerta la direccion de una vivienda
		char puerta = 'A';
		// Fin modificacion
	}

	/**
	 * Tipos de datos basicos - Ejercicio4.
	 *
	 * </br>
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * <li> Explicar en el fichero LEEME.txt el porque de los resultados
	 * </ul>
	 */
	public void ejercicio04() {
		cabecera("04", "Formato decimales");

		// Inicio modificacion
		double valor1 = 2.8;
		double valor2 = 1.5;

		double resultado = valor1 - valor2;
		System.out.println(valor1+" - "+valor2+" = "+resultado);
		// Fin modificacion
	}


	/**
	 * Tipos de datos basicos - Ejercicio5.
	 *
	 * </br>
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * </ul>
	 */
	public void ejercicio05() {
		cabecera("05", "La clase <<BigDecimal>>");

		// Inicio modificacion
		BigDecimal valor1 = new BigDecimal("2.8");
		BigDecimal valor2 = new BigDecimal("1.5");

		System.out.println(valor1+" - "+valor2+" = "+valor1.subtract(valor2));
		// Fin modificacion
	}
}

