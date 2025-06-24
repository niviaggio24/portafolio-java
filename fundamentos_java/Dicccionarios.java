//Los diccionarios nos sirve en automation para saber por ejemplo las configuraciones de como se maneja la test
// data, se van  a poder crear pares diccionarios. como por ejemplo decir, el usuario admin el valor es este
// para el usuario tester el valor es este etc.

import java.util.*;

class Mi_diccionario
{
    public static void main(String[] args)    
    {
        //Crear una instancia de una hastable.vamos a pasar dos tipos, para el par key:value
        Hashtable<String, String> diccionario = new Hashtable<String, String>();

        //metodo put()
        diccionario.put("Colombia","Colombianos");
        diccionario.put("Uruguay","Charruas");

        //metodo get()
        System.out.println("Valor para la Key: "+ diccionario.get("Colombianos"));


        //Metodo isEmply  devuelve falso o verdadero (si esta vacio)

        System.out.println("esta vacio el diccionario?" +diccionario.isEmply));

        //Metodo remove

        diccionario.remove("Uruguay");
        system.out.println("valor para la key "+ diccionario.get("Uruguay"));



    }

    


}

