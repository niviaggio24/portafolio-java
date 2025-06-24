import java.util.ArrayList;
class MyClass{

    public static void main(String[] args){
        ArrayList<String>figuras = new ArrayList<String>(); //Creando una instancia del objeto ArrayList llamada figuras
        figuras.add("Cuadrado");
        figuras.add("triangulo");
        figuras.add("circulo");
        figuras.add("rombo");
        figuras.add("hexagono");
        figuras.add("octagono");

        for(int i=0; int<ArrayList.size(); i++){
            print("va a iterar hasta que i no sea menor que el tamaño de la lista, es decir, cuando termine con la lista")
        }
        
    }
}

// Este es otra forma de loop con la clase Iterator que provee java
Iterator<String> interator = list.iterator();
while(iterator.hasNext{}){
    String next = iterator.next();
    print(next);
}
