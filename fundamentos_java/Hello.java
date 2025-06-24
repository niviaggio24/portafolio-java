//LISTAS


// Una lista sirve para guardar elementos dentro de ella y dentro esos elementos podemos hacer varias cosas. Eje, Cuantos elementos tenems en esa lista, cambair el elemento, remover el elemento.
// una busqueda en google todos los elementos perteneces a la lista de resultados y con un loop recorrer cada uno.
import java.util.ArrayList;
class MyClass{

    public static void main(String[] args){
        ArrayList<String>figuras = new ArrayList<String>(); //Creando una instancia del objeto ArrayList llamada figuras
        System.out.println(figuras.size());

        //Agregar elementos a nuestra lista

        figuras.add("Cuadrado");
        figuras.add("triangulo");
        figuras.add("circulo");
        figuras.add("rombo");
        figuras.add("hexagono");
        figuras.add("octagono");

        System.out.println(figuras);
        System.out.println(figuras.get(0));  //trae el elemento de acuerdo al posicion del elemento en el la lista.
        figuras.remove("hexagono") // remueve de la lista el elemento.
        figuras.set(0,"chirimbolo"); //cambia el valor de un elemento en el arreglo
        figuras.clear(); // Borrar todas la figuras
    }    
}

