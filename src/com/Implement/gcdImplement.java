/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Implement;

/**
 *
 * @author Rathnayaka RMBS
 */
import com.interface1.gcdInterFace;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class gcdImplement extends UnicastRemoteObject implements gcdInterFace
{

    public gcdImplement () throws RemoteException{
    }


    public int gcd(int a, int b) throws RemoteException {
      if(b==0){
          return a;
      }
      else{
          return gcd(b,a%b);
      }

    }
    
}
