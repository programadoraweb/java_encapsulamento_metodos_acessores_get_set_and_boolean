public class App {
    public static void main(String[] args) throws Exception {
       Cachorro pacoca = new Cachorro(); 
       pacoca.setIdade(5); 

       if(pacoca.VerificarIdade() /* == true */){
System.out.println("ela eh idosa");

       }
       else{
        System.out.println("ela eh jovem");
       }
    }
}
