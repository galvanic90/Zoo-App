/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package edu.udea.zooapp.helper;

/**
 *
 * @author xaraxx
 */
public class ZooAppException extends RuntimeException {

    /**
     * Creates a new instance of <code>ZooAppException</code> without detail
     * message.
     */
    public ZooAppException() {
    }

    /**
     * Constructs an instance of <code>ZooAppException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ZooAppException(String msg) {
        super(msg);
    }

    public ZooAppException(String message, Throwable cause) {
        super(message, cause);
    }
    
    
}
