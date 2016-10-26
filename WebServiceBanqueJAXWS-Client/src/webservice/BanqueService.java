/**
 * BanqueService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public interface BanqueService extends java.rmi.Remote {
    public java.lang.String test() throws java.rmi.RemoteException;
    public double conversionEuroFcfa(double montant) throws java.rmi.RemoteException;
    public webservice.Compte[] listeAllComptes() throws java.rmi.RemoteException;
    public webservice.Compte getCompte(int code) throws java.rmi.RemoteException;
}
