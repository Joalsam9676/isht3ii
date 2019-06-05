

import com.mycompany.isht3ii.funciones.Palindromes1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aleja
 */
public class PalindromesTest {
 
   @Test
    public void par(){
        System.out.println("cadena par");
        String palabra = "ANNA";
        Palindromes1 prueba = new Palindromes1();
        prueba.evaluate(palabra);
        boolean result = true;
        boolean resultado = prueba.evaluate(palabra);
        assertEquals(result, resultado);        
    }
    
    @Test
    public void impar(){
        System.out.println("Cadena impar");
        String palabra = "arañara";
        Palindromes1 prueba = new Palindromes1();
        prueba.evaluate(palabra);
        boolean result = true;
        boolean resultado = prueba.evaluate(palabra);
        assertEquals(result, resultado);
    }
    
    @Test
    public void vacia(){
        System.out.println("Cadena Vacia");
        String palabra = "";
        Palindromes1 prueba = new Palindromes1();
        prueba.evaluate(palabra);
        boolean result = true;
        boolean resultado = prueba.evaluate(palabra);
        assertEquals(result, resultado);
    }
    
    @Test
    public void espacios(){
        System.out.println("Cadena con espacios");
        String Palabra = "la ruta natural";
        String Palabra2 = "larutanatural";
        Palindromes1 prueba = new Palindromes1();
        prueba.evaluate(Palabra);
        boolean result = true;
        boolean resultado = prueba.evaluate(Palabra);
        boolean resultado2 = prueba.evaluate(Palabra2);
        assertNotEquals(result, resultado);
        assertEquals(result, resultado2);
    }
    
    @Test
    public void mayusculas()
    {
        System.out.println("Cadena COn mayusculas");
        String Palabra = "Atinobonita";
        String Palabra2 = "atinobonita";
        Palindromes1 prueba = new Palindromes1();
        prueba.evaluate(Palabra);
        boolean result = true;
        boolean resultado = prueba.evaluate(Palabra);
        boolean resultado2 = prueba.evaluate(Palabra2);
        assertNotEquals(result, resultado);
        assertEquals(result, resultado2);
    }
    
    @Test
    public void falso(){
        System.out.println("No es palindromo");
        String palabra = "Alejandro";
        Palindromes1 prueba = new Palindromes1();
        prueba.evaluate(palabra);
        boolean result = true;
        boolean resultado = prueba.evaluate(palabra);
        assertNotEquals(result, resultado);
    }
    
    @Test
    public void saltoLinea(){
        System.out.println("Salto de linea");
        String palabra = " \n ";
        Palindromes1 prueba = new Palindromes1();
        prueba.evaluate(palabra);
        boolean result = true;
        boolean resultado = prueba.evaluate(palabra);
        assertEquals(result, resultado);
    }
    
    @Test
    public void caracterUnico()
    {
        System.out.println("Caracter unico");
        String palabra = "A";
        String Palabra2 = "?";
        String Palabra3 = "=";
        Palindromes1 prueba = new Palindromes1();
        prueba.evaluate(palabra);
        boolean result = true;
        boolean resultado = prueba.evaluate(palabra);
        boolean resultado2 = prueba.evaluate(Palabra2);
        boolean resultado3 = prueba.evaluate(Palabra3);
        assertEquals(result, resultado);
        assertEquals(result, resultado2);
        assertEquals(result, resultado3);
    }
}
