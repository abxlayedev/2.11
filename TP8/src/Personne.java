class Personne {
	
//attributs de la class
String nom, prenom;
int compteBancaire; // montant de son compte en euros

// constructeur
Personne(String nom, String prenom){
this.nom = nom; this.prenom = prenom;
this.compteBancaire = 0;
}


void addSous(int montant){
this.compteBancaire = this.compteBancaire+montant;
}

}