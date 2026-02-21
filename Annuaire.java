package ex2_Map;
import java.util.HashMap;
import java.util.TreeMap;
public class Annuaire {
	HashMap<String,Fiche>table=new HashMap<String,Fiche>();
	public Annuaire() {
		
	}
	public HashMap<String, Fiche> getTable() {
		return table;
	}
	public void setTable(HashMap<String, Fiche> table) {
		this.table = table;
	}
	 public void ajouter(Fiche f) {
	        table.put(f.getNom(), f);
	    }

	    public Fiche chercher(String nom) {
	        return table.get(nom);
	    }

	    public void afficherTout() {
	        for (Fiche f : table.values()) {
	            System.out.println(f);
	        }
	    }
	    public void trier() {
	        TreeMap<String, Fiche> tableTriee =
	                new TreeMap<String, Fiche>(table);

	        for (Fiche f : tableTriee.values()) {
	            System.out.println(f);
	        }
	    }
	}
	


