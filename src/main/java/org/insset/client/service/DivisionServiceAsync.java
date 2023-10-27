/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 *
 * @author user
 */
public interface DivisionServiceAsync {

    /**
     * Convertion Obtenir prix initial avec prix final et pourcentage
     *
     * @param nbr
     * @param nb
     * @param callback
     * @throws IllegalArgumentException
     */
    void Divider(Integer nbr, Integer nb, AsyncCallback<String> callback);

}
