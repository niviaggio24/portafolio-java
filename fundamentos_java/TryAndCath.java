//es lo que se va a manejar mas para el manejo  de los errorres, es mas cuando el programa no se comporta de la manera que queremos
//poder capturar ese error y decir porque fallo
//Try ; es un bloque de codigo que va intentar ha hacer algo y si eso falla y si no pasa lo que estamos esperando que
// falle el try va hacer ser tirado al catch y hay colocamos lo que queremos
import java.util.*;

public class TryCatchExample2{
    try{
        int data=50/0; //puede fallar        
    }

    //se maneja el error 
    catch(ArithmeticException e){
        System.out.println(e);
    }
    System.out.println("resultado del codigo");
}   

