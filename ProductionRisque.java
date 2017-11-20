/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;
/**
 *
 * @author emmanuel
 */
public class ProductionRisque extends Production implements Arisque {
    public static final int PrimeArisque=25000;
    public  ProductionRisque(String nom,String prenom,String matricule,String dateEmbauche,int age,int nombreunite){
    super(nom,prenom,matricule,dateEmbauche,age,nombreunite);
    }
    public double CalculerSalaire(){
        return SalaireBase+(nombreUnite*unites) + prime;
        
    }
}
