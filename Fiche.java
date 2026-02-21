package ex2_Map;

public class Fiche {
	private String nom;
	private String num;
	private String adrs;
	public Fiche(String nom,String num,String adrs) {
		this.adrs=adrs;
		this.nom=nom;
		this.num=num;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getAdrs() {
		return adrs;
	}
	public void setAdrs(String adrs) {
		this.adrs = adrs;
	}
	@Override
	public String toString() {
		return "Fiche [nom=" + nom + ", num=" + num + ", adrs=" + adrs + "]";
	}
	

}
