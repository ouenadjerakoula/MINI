/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniProjet;

/**
 *
 * @author emmanuel
 */
public abstract class Employe {

       private String nom ;
       private  String prenom;
        private   String matricule;
        private  String date_embauche;
       public int age;
        public static final int SalaireBase=110000;
    public Employe(String nom,String prenom,String matricule,String dateEmbauche,int age){

        this.nom=nom;
        this.prenom=prenom;
        this.matricule=matricule;
        this.date_embauche=dateEmbauche;
        this.age=age;
    }
    public abstract double calculerSalaire();
        

    public String getNom(){
    return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public  void setPrenom(String prenom){
        this.prenom=prenom;
    }
}

