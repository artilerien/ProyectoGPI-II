public class MaxMin
{
    int i; //variable para recorrer el array
    int num_max; //aqui se almacena el numero maximo
    int num_min; //aqui se almacena el numero minimo
    
    //metodo que busca el numero maximo del array
    int Maximo(int array[])
    {
	if(array.length>0)
	{	
	    num_max = array[0];
	    for(i=1;i<array.length;i++)
	    {
		if(array[i]>num_max)
		{
		   num_max = array[i]; 
		}
	    }
	    return num_max;
	}
	else
	{
	  return -1;
	}
    }
    
    //metodo que busca el elemento minimo del array
    int minimo(int array[])
    {
	if(array.length>0)
	{	
	    num_min = array[0];
	    for(i=1;i<array.length;i++)
	    {
		if(array[i]<num_min)
		{
		   num_min = array[i]; 
		}
	    }
	    return num_min;
	}
	else
	{
	  return -1;
	}
    }
}