public class App {
    public static void main(String[] args) throws Exception {
       
      

    int i=1 , aux=1 , r=0 ,Cantidad=10;
    do{
         System.out.println(i);
       r=i+aux;
       aux=i;
       i=r;
    }
    while(i<Cantidad);
    }

}
