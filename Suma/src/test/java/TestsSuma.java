/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.suma.Suma;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumne
 */
public class TestsSuma {
    
    public TestsSuma() {
    }
    
    @Test
    public void testSuma1(){
    Suma Sumar= new Suma();
    int resultado = Sumar.sumar(2, 3);
    int esperado= 5;
    assertEquals(esperado,resultado);
    }
    
    @Test
    public void TestSuma2(){
    Suma Sumar=new Suma();
    int resultado = Sumar.getNum1(2, 3);
    int esperado=2;
    assertEquals(esperado,resultado);
    }
    
    @Test
    public void TestSuma3(){
    Suma Sumar=new Suma();
    int resultado =Sumar.SumarValorAbsolut(-2, -3);
    int esperado=4;
    assertEquals(esperado,resultado);
    }  
}
