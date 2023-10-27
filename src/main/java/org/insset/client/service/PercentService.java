package org.insset.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


/**
 *
 * @author user
 */
@RemoteServiceRelativePath("percent")
public interface PercentService extends RemoteService {

    /**
     * Convertion Obtenir prix initial avec prix final et pourcentage
     *
     * @param nbr
     * @param nb
     * @return
     * @throws IllegalArgumentException
     */
    String Divider(Integer nbr, Integer nb) throws IllegalArgumentException;

}
