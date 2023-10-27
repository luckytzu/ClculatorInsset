/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.insset.client.service.PercentService;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class DivisionPresenterImpl extends RemoteServiceServlet implements
        PercentService {

    //Methode qui permet de diviser 2 nombres et d'obtenir leurs reste
    private String Divider(int divided, int divider) {
        
        if(divider > 0 && divider <= 200 && divided > 0 && divided <= 200 ){
            
            //Le reste de la division
            int remain = divided % divider;
            
            //Le résultat de la division (2 si(4/2))
            int quotient = divided / divider;
            
            return "Le résultat de la division est "+quotient+" et le reste : "+remain;

        }
        else {
            return "Les valeurs entrés ne sont pas correctes";
        }

    }

    public String Divider(Integer nbr, Integer nb) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
