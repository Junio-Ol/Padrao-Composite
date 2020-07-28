public class Test {

    public static void main(String[] args) {
     
    	Gol gol = new Gol();
    	Celta celta= new Celta();
    	Astra astra =new Astra();

        
    	CompositeConcessionaria  Concessionaria1 = new CompositeConcessionaria ();
    	CompositeConcessionaria  Concessionaria2 = new CompositeConcessionaria ();

       
       Concessionaria1.adicionar(gol);
       Concessionaria1.adicionar(celta);
       Concessionaria1.remover(astra);

       
       Concessionaria2.adicionar(gol);
       Concessionaria2.adicionar(celta);
       
      
     //  Concessionaria1.print();
       Concessionaria2.print();
    }
}