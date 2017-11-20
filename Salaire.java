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
public class Salaire {
    
    public static void main(String[] args){
        
        
    Personnel p=new Personnel();
    
    
    
        p.ajouterEmploye(new Vendeur("Gong","Emmanuel","43A3FS","1996",27,3000));
        p.ajouterEmploye (new Representation("Wati","mario","5B6FS","1995",30,1000));
        p.ajouterEmploye (new Production("Maiso","Claire","32A87FS","1999",25,1000));
        p.ajouterEmploye (new Manutention("Gaissala","jean","8B98FS","2000",28,200));
        p.ajouterEmploye (new ProductionRisque("Alain","Moudina","32B67FS","1985",45,1100));
        p.ajouterEmploye (new ManutentionRisque("Sara","Beatrice","12B7FS","2001",38,100));
        
        //cette instruction nous permettra d'afficher les noms des personnels et leurs salaires
        p.AfficherSalaire();
        //nous permet d'afficher le salaire moyen
         System.out.println("Le salaire moyen est " + p.SalaireMoyen() + " francs ");
    }
}