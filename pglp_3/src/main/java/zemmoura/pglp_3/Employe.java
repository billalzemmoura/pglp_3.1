package zemmoura.pglp_3;



public class Employe {
private final String nom;
private final String adresse;
private double salaire;
	
	public Employe(double salaire,String nom,String adresse) {
		this.salaire=salaire;
		this.nom=nom;
		this.adresse=adresse;
		

        } 
        public double calculSalaire() {return salaire*12;}
        

}