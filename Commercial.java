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
public class Commercial extends Employe {
         private double chiffreAffaire;
    public Commercial(String nom,String prenom,String matricule,String dateEmbauche,int age,double chiffreAffaire){
        super(nom,prenom,matricule,dateEmbauche,age);
        this.chiffreAffaire=chiffreAffaire;
    }
    public double getChiffreAffaire(){
        return chiffreAffaire;
    }
    public void setChiffreAffaire(double chiffreAffaire){
        this.chiffreAffaire=chiffreAffaire;
    }
    
}

    
