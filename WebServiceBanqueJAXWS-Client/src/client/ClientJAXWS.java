package client;

import java.rmi.RemoteException;

import webservice.Account;
import webservice.BanqueService;
import webservice.BanqueServiceProxy;

public class ClientJAXWS {

	public static void main(String[] args) {

BanqueService stub = new BanqueServiceProxy().getBanqueService();
		
		try {
			System.out.println("\n 100Euros = "+stub.conversionEuroFcfa(100)+" FCFA");
			
			Account cp = stub.getCompte(2);
			System.out.println("\n"+cp.getSolde());
			
			for (Account c : stub.listeAllComptes()) {
				System.out.println("\n code : " +c.getCode()+" --> Solde = "+c.getSolde());
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
