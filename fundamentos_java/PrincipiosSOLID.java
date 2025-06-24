
// se utilizan para desarrollar de una forma mantenible


//1. principio de responsabilidad unica : Este principio se refiere a una clase y esta clase va a tener una unica 
  // responsabilidad ejemplo; modelar una persona, no tendria sentido sumar un perro a una clase persona porque
  // una persona puede tener un perro, porque el dia de mañana vamos a tener que modificar algo para el comportamientos  
  // del perro y vamos a estar tocando una clase que no necesariamente esta atada al comportamiente del perro
  // como es la clase persona.

  // La responsabilidad unica es que una clase debe ser responsable de una unica cosa sino se hace
  // podemos estar tocando muchas otras clases que pueden impactar.


//2 principio OPEN/CLOSE : Se refiere a que las clases y funciones deberian estar pensadas para ser extendidas
  // desde afuera  pero no modificadas desde adentro. ejem: Si yo el dia de manana tengo nuestra clase Persona
  // con una funcion que es comer , esa funcion que es comer deberia estar ya completmamente cerrada, el dia de 
  // manana tengo comer spagueti por ejemplo deberia ser una extension de esa funcion  y no deberia  yo tener
  // que modificar desde adentro pues la idea es hacer las cosas para hacerlas una vez sin tener que hacerlas una 
  // y otra vez.


  //3 Liskov principio de la Sustitucion: donde las SuperClase deberia poder reemplazar sus metodos o su
    //comportamiento con metodos de las clases derivadas, esto viene un poco de la mano con la abstracion
    //del polimorfismo. y por ejemplo el webDriver que es la interfaz de selenium con la cual nosotros tenemos
    // Chrome driver , geko driver van a tener las funciones abstractas  definidas en cada una de estas subclases
    // y van a estar implementando la clase principal que es el web driver y la idea es que se pueda reemplzar
    // las funciones de estas interfaces en las superclases principal que este caso vendria siendo Web Driver
    // sin que se rompan todo eso el principio. Puede sustituir lo que esta usando una clase derivada de una clase
    // principal sin que necesariamente se rompa la clase principal. 

    // 4. Principio de segregacion de interfaces : No se debe tener una interfaz con muchas responsabilidades
    //  se deberia tener esto segregado segmentado en interfaces que hagan una solo cosa en terminos sencillos
    // lo que se dijo es que "un cliente no deberia estar forzado a depender de interfaces  que no va usar",
    // esa es la frase que define al principio de segregacion de interfaces. tener Interfaces limpias que hagan
    // una sola cosa y evitar que dependa de cosas que en definitiva nos vas a usar.

    //5. Inversion de dependicias: Consiste en que una vez tengas en principio de sustitucion de liskov y de 
    // Open/Close lo que te queda ahy es separar la interfaces entre los componentes hight-level y low-lever
    // y los low level. Lo detallado y los mas abstracto. Para esa manera tener las dependencias ahi aisladas
    // y no estar dependiendo ambas cosas de lo mismo.