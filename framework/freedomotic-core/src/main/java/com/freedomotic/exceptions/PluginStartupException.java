/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freedomotic.exceptions;

/**
 *
 * @author enrico
 */
public class PluginStartupException extends Exception {
    

    public PluginStartupException(String msg) {
        super(msg);
    }


    public PluginStartupException(String message, Throwable cause) {
        super(message, cause);
    }

}
