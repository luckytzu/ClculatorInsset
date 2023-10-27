/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.RootPanel;
import org.insset.client.exemple.ExemplePresenter;
import org.insset.client.percent.PercentPresenter;
import org.insset.client.calculator.roman.CalculatorRomainPresenter;

/**
 *
 * @author user
 */
public class HistoryListener implements ValueChangeHandler<String> {

    @Override
    public void onValueChange(ValueChangeEvent<String> event) {


        //Accès a la page de conversion roman
        if (event.getValue().equals("pourcentage")) {
            RootPanel.get().clear();
            RootPanel.get().add(new PercentPresenter());
        }

        //Accès a la page de conversion roman
        if (event.getValue().equals("roman")) {
            RootPanel.get().clear();
            RootPanel.get().add(new CalculatorRomainPresenter());
        }

        //Accès a la page d'exemple
        if (event.getValue().equals("exemple")) {
            RootPanel.get().clear();
            RootPanel.get().add(new ExemplePresenter());
        }

        //Accès a la page pourcentage
        //Add your code 
    }

}
