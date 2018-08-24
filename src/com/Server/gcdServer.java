 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Server;

/**
 *
 * @author Rathnayaka RMBS
 */
import com.Implement.gcdImplement;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class gcdServer {
    public static void main(String args[]){
        try{
        Registry reg= LocateRegistry.createRegistry(1099);
        gcdImplement gcd=new gcdImplement();
        reg.rebind("gcd", gcd);
        System.out.println("Server is working");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
