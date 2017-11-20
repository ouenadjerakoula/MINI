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
public class Production extends Employe{
      public   int nombreUnite;
      public int unites;
    public final static int SalaireBase=110000;
    public Production(String nom,String prenom,String matricule,String dateEmbauche,int age,int nombreUnite){
        super(nom,prenom,matricule,dateEmbauche,age);
        this.nombreUnite=nombreUnite;
    }
    
    public double getNombreHeure(){
        return nombreUnite;
    }
   
    public void setNombreHeure(int h){
        this.nombreUnite=h;
    }
    
    public double calculerSalaire(){
        return (nombreUnite* unites)+SalaireBase;
    }
    
}
    

