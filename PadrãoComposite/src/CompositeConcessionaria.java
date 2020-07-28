import java.util.List;
import java.util.ArrayList;

class CompositeConcessionaria  implements Concessionaria {

	    
	    private List<Concessionaria> Conce = new ArrayList<Concessionaria>();

	    
	    public void print() {
	        for (Concessionaria concessionaria : Conce) {
	            concessionaria.print();
	        }
	    }

	    
	    public void adicionar(Concessionaria concessionaria) {
	    	Conce.add(concessionaria);
	    }
	    
	    public void remover(Concessionaria concessionaria) {
	    	Conce.remove(concessionaria);
	    }
	}


