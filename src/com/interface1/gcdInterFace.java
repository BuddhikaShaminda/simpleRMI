
package com.interface1;

/**
 *
 * @author Rathnayaka RMBS
 */
import java.rmi.*;
public interface gcdInterFace extends Remote{
    public int gcd(int a,int b) throws RemoteException;
}
