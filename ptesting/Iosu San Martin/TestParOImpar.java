public class TestParOImpar
{
  public static void main(String args[])
  {
      ParOImpar test = new ParOImpar();
      if(test.Par(2))
      {
	  System.out.println("Test numero par: correcto");
      }
      else
      {
	  System.out.println("Test numero par: incorrecto");
      }
      
      if(!test.Par(3))
      {
	  System.out.println("Test numero par: correcto");
      }
      else
      {
	  System.out.println("Test numero par: incorrecto");
      }
      
      if(test.Impar(3))
      {
	  System.out.println("Test numero impar: correcto");
      }
      else
      {
	  System.out.println("Test numero impar: incorrecto");
      }
      
      if(!test.Impar(2))
      {
	  System.out.println("Test numero impar: correcto");
      }
      else
      {
	  System.out.println("Test numero impar: incorrecto");
      }
      
  }
}