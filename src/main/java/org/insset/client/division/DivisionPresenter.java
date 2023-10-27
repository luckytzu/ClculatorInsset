/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.division;

import org.insset.client.division.*;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.ResetButton;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import org.insset.client.service.DivisionService;
import org.insset.client.service.DivisionServiceAsync;

import com.google.gwt.core.client.GWT;

/**
 *
 * @author insset
 */
public class DivisionPresenter extends Composite {

    interface MainUiBinder extends UiBinder<HTMLPanel, DivisionPresenter> {
    }
    
    private static final MainUiBinder ourUiBinder = GWT.create(MainUiBinder.class);
    
    private final DivisionServiceAsync service = GWT.create(DivisionService.class);

    //Constructeur
    public DivisionPresenter(){ 
        initWidget(ourUiBinder.createAndBindUi(this));
        initHandler();
    }

    @UiField
    public ResetButton boutonClearD;

    private void initHandler() {
        boutonClearD.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                //valR.setText("");
                //errorLabelRToA.setText("");
            }
        });}

    
    
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

       
    
}
