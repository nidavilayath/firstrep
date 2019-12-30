package Wallet.Ui;

import java.util.*;

import Wallet.Entity.WalletEntity;

public class WalletMain1 {

	
	public static void main(String[] args) {
		WalletMain1 ui=new WalletMain1();
		ui.execute();
	}

	
	  Map <String, WalletEntity>  store =new HashMap<>();
	  
	  public void execute() {
		  WalletEntity e1=new WalletEntity("1","Abhinav",7878);
		  store.put("1",e1);
		  
		  WalletEntity e2=new WalletEntity("76868983","ravi",898);
		  store.put("76868983",e2);
		  
		  print();
		  WalletEntity fetched=findBymobileno("1");
		  System.out.println(fetched.getmobileno());
	  }
	  
	  
	  


	public String findBymobileno(String mobileno) {
		  WalletEntity=store.get(mobileno);
		  return e ;
	  }
	  
	  
	  public void print() {
		  Set<String> keys=store.keySet();
		  for (String mobileno :keys) {
			  WalletEntity e= store.get(mobileno);
			  System.out.println(e.getname() +e.getbalance());
			  
				  }
				  
			  }
			  
			  
		
	 
}


