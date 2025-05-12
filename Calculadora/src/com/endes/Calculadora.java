package com.endes;
/**
 * 
 * Realiza las operaciones matemáticas básicas:
 * suma, resta, multiplicación y division
 * @version 1.0
 * @author Nombre del autor	
 */
public class Calculadora {
	private int num1;
    private int num2;


  // ejemplo de comentario.
  // Comentario de Ruben
  // Comentario de Daniel
    // Comentario de Daniel 2
    // Comentario de Daniel 3
  
    /**
     * Iniciar clase
     * @param a {@code int}
     * @param b {@code int}
     */

   public Calculadora(int a, int b) {
       num1 = a;
       num2 = b;
   }
  /**
   * Realiza la suma de dos números enteros 
   * @return {@code int}  
   */
   public int suma() {
       int resul = num1 + num2;
       return resul;
   }
   /**
    * Realiza la resta de dos números enteros
    * @return {@code int} 
    */
   
   public int resta() {
       int resul = num1 - num2;
       return resul;
   }
   /**
    * Realiza la multiplicación de dos números enteros
    * @return {@code int} 
    */
   public int multiplica() {
       int resul = num1 * num2;
       return resul;
   }
 /**
  * Realiza la división de dos números enteros
  * @return {@code int} 
  */
   public int divide() {
       int resul = num1 / num2;
       return resul;
   }
   /**
    * Realiza la división de dos números enteros.
    * @return {@code int} 
    * @exception ArithmeticException por 0
    */
   public int divide0() {		   
	   if(num2 == 0) // si el divisor es 0
	      throw new java.lang.ArithmeticException("División por 0"); // lanza excepción
	   else{
	      int resul= num1 / num2; // realiza la división
	      return resul; // devuelve el resultado
	   } 
	}
}