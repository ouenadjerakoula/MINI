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
public class Personnel {
    
 private int nombreEmployé;
    private final static int maxEmployé=200;
    private Employe [] staff;
     
    public Personnel(){
        
     staff =new Employe[maxEmployé];  
    nombreEmployé=0;
    }
     public void ajouteremploye(Employe e){        
        ++nombreEmployé;
        
    if(nombreEmployé<=maxEmployé){
        
        staff[nombreEmployé-1]=e;
        
        
    }
    
    else{
        System.out.println("pas plus de " + maxEmployé + "employé");
        
    }
    }
    public double SalaireMoyen(){
        double somme =0.0;
        for(int i=0; i<nombreEmployé; i++){
    somme=somme + staff[i].calculerSalaire();
        }
    return somme/nombreEmployé;
    }
    public  void AfficherSalaire(){
        for(int i=0; i<nombreEmployé; i++){
     System.out.println(staff[i].getNom() + "gagne" + staff[i].calculerSalaire() + "franc");
    }
       
    
    }
}
    
     

        
     
     
    
   

    