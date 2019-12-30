package Wallet.Ui;
import Wallet.Entity.*;



public class WalletMain {
	
	public static void main(String[] args) {
		
		//Map <String, WalletEntity>  store =new HashMap<>();
		
		
		
	 WalletEntity store[]=new WalletEntity[3];
		
		store[0]=new WalletEntity("9703894660", "alekhya",1000);
		
		store[1]=new WalletEntity("23563814","Nandini",4000);
		
		
		store[2]=new WalletEntity("56474657","Ravi",2000);
		
		store[2].transferamount(store[0], 200);
		
		WalletMain m=new WalletMain();
		m.print(store);
		
		//WalletEntity fetched=findBymobileno(2);
		  //System.out.println(fetched.getmobileno());
	}
	
	

	  //public WalletEntity findBymobileno(String mobileno) {
		  //WalletEntity e=store.get(mobileno);
		  //return e;
	  //}
	  
	
	
	public void print(WalletEntity[] c) {
		for (int i=0; i<3;i++) {
			System.out.println("mobile no:"+c[i].getmobileno() +"name:" +c[i].getname() +"balance:" +c[i].getbalance());
			
		}
	}
}
		
		
	
	
