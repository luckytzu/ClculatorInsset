/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.percent;

/**
 *
 * @author insset
 */
public class Percent {
    
    //Methode qui permet de diviser 2 nombres et d'obtenir leurs reste
    private String Divider(int divided, int divider) {
        int quotient = 0;
        int remain = 0;
        
        if(divider > 0 && divider <= 200 && divided > 0 && divided <= 200 ){
            
            //Le reste de la division
            remain = divided % divider;
            
            //Le résultat de la division (2 si(4/2))
            quotient = divided / divider;
            
            return "Le résultat de la division est "+quotient+" et le reste : "+remain;

        }
        else {
            return "Les valeurs entrés ne sont pas correctes";
        }

    }

    //Methode qui permet d'obtenir le prix initial avec le prix final et un pourcentage
    private String GetInitPriceWith(int finalPrice, float percent) 
    {

    // Calcul du prix initial
    double initPrice = finalPrice / (1 + percent / 100);

    // Conversion du prix initial en String
    String initPriceStr = String.valueOf(initPrice);

    return initPriceStr;
    }   
    
}
