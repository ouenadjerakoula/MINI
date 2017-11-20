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
public class ManutentionRisque extends Manutention implements Arisque {
    public static final int PrimeArisque=25000;
    public ManutentionRisque(String nom,String prenom,String matricule,String dateEmbauche,int age,int nombreHeure){
        super(nom,prenom,matricule,dateEmbauche,age,nombreHeure);
    }
    @Override
    
    public double calculerSalaire(){
       return SalaireBase + (nombreHeure * 65) + prime;
    }
    
}

