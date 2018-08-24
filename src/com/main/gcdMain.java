/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.interface1.gcdInterFace;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Rathnayaka RMBS
 */
public class gcdMain {
    public gcdMain(){
    
    }
    public static void main(String args[]) throws NotBoundException,MalformedURLException,RemoteException,IOException{
        gcdInterFace obj=(gcdInterFace)Naming.lookup("rmi://localhost:1099/gcd");
        
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          int a=0,b=0,ans=0;
          
          do{
              System.out.println("Enter the first number");
              a=Integer.parseInt(br.readLine());
              System.out.println("Enter the second number");
              b=Integer.parseInt(br.readLine());
              
              ans=obj.gcd(a,b);
              
              System.out.print("Greatest common devisor is ");
              System.out.println(ans);
              System.out.println("\n-------------------------------------------------------------------------------------------------------\n");
          }while(true);
    }
}
