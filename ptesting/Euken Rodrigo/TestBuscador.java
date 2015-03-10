public class TestBuscador{

    public static void main(String args[]){

      //Creamos varios array sencillos con elementos que conozco para que me resulte mas fácil realizar las pruebas
      //que tengo que hacer
      int array1[]={1,2,3,5,6,7};
      int array2[]={1,2,3,5,6,7};
      int array3[]={1};
      int array4[]={1,2,3,5,6,7};
      int array5[]={1,2,3,5,6,7};
      int array6[]={};
      

     //Caso de prueba nº1 busqueda del primer elemento en un array 
     if (Buscador.buscar(1, array1)){
	System.out.println("Prueba 1: Correcto");
     }else{
	System.out.println("Prueba 1: Fallo");
     }

     //Caso de prueba nº2 busqueda del ultimo elemento en un array
     if (Buscador.buscar(7, array2)){
        System.out.println("Prueba 2: Correcto");
     }else{
        System.out.println("Prueba 2: Fallo");
     }

     //Caso de prueba nº3 busqueda de un elemento en un array de un único elemento
     if (Buscador.buscar(1, array3)){
        System.out.println("Prueba 3: Correcto");
     }else{
        System.out.println("Prueba 3: Fallo");
     }

     //Caso de prueba nº4 busqueda de un elemento que no está en un array 
     if (Buscador.buscar(8, array4)){
        System.out.println("Prueba 4: Fallo");
     }else{
        System.out.println("Prueba 4: Correcto");
     }

     //Caso de prueba nº5 busqueda de un elemento que está en un array
     if (Buscador.buscar(6, array5)){
        System.out.println("Prueba 5: Correcto");
     }else{
        System.out.println("Prueba 5: Fallo");
     }

     //Caso de prueba nº6 busqueda de un elemento en un array vacio
     if (Buscador.buscar(3, array6)){
        System.out.println("Prueba 6: Correcto");
     }else{
        System.out.println("Prueba 6: fallo");
     }
    }
}