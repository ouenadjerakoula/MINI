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
public class Representation extends Commercial{     
        private static final int SalaireBase=110000;
        private static final double pourcentageVendeur=0.2;
        private static final int beneficeVendeur=200;
        private double chiffreAffaire;
    public Representation(String nom,String prenom,String matricule,String dateEmbauche,int age,double chiffreAffaire){
        super(nom,prenom,matricule,dateEmbauche,age,chiffreAffaire);
        
    }

    
    public double calculerSalaire(){
        return SalaireBase + (chiffreAffaire * 0.2)/100+200;
    }
        
  }

