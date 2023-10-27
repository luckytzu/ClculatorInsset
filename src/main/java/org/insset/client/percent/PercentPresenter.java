/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.percent;

import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.ResetButton;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import org.insset.client.service.PercentService;
import org.insset.client.service.PercentServiceAsync;

import com.google.gwt.core.client.GWT;

/**
 *
 * @author insset
 */
public class PercentPresenter extends Composite {

    interface MainUiBinder extends UiBinder<HTMLPanel, PercentPresenter> {
    }
    
    private static final MainUiBinder ourUiBinder = GWT.create(MainUiBinder.class);
    
    private final PercentServiceAsync service = GWT.create(PercentService.class);

    //Constructeur
    public PercentPresenter(){ 
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


       
    
}
