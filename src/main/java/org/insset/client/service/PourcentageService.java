/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 *
 * @author pourcentage
 */

@RemoteServiceRelativePath("pourcentage")
public interface PourcentageService extends RemoteService {
    
    Integer division(Integer nbrA, Integer nbrB) throws IllegalArgumentException;
    
}