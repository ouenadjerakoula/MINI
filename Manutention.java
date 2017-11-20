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
public class Manutention extends Employe {
      private int nombreHeure;
    public final static int SalaireBase=110000;
    public Manutention(String nom,String prenom,String matricule,String dateEmbauche,int age,int nombreHeure){
        super(nom,prenom,dateEmbauche,age);
        this.nombreHeure=nombreHeure;
    }
    
    public double getNombreHeure(){
        return nombreHeure;
    }
    public void setNombreHeure(int h){
        this.nombreHeure=nombreHeure;
    }
    
    public double calculerSalaire(){
        return (nombreHeure*65)+SalaireBase;
    }
    
}
    

