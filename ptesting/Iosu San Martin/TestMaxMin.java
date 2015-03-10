public class TestMaxMin
{
    public static void main(String args[])
    {
	//generamos arrays para las pruebas
	int array1[] = {1,2,3,4};
	int array2[] = {};
	
	MaxMin prueba = new MaxMin();
	
	if(prueba.Maximo(array1) == 4)
	{
	    System.out.println("Maximo buscado correctamente");
	}
	else
	{
	    System.out.println("Maximo buscado erroneamente");
	}
	
	if(prueba.minimo(array1) == 1)
	{
	    System.out.println("Minimo buscado correctamente");
	}
	else
	{
	    System.out.println("Minimo buscado erroneamente");
	}
	
	if(prueba.minimo(array2) == -1)
	{
	    System.out.println("No hay ningun elemento en el array");
	}
	else
	{
	    System.out.println("Error al comprobar que no hay elementos en el array");
	}
    }
}