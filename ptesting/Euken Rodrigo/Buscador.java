public class Buscador{
   static int[] array;
   public static boolean buscar(int num,int array[]){  
      int i;
      if(array.length>0){
         for(i=0;i<array.length;i++){
            if(array[i]==num)
               return true;         
         }
      }
      return false;
   }
}