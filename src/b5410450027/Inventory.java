public class Inventory {
	
	private int cpd = 1001;
	private String User;
	private int idpd;
	public Inventory(int j,String k){
		this.cpd += j;
		this.User = k;
		this.idpd = 0;
	}
	public String seeUser(){
		return this.User;
	}
	public void correctUser(String k){
		this.User = k;	
	}
	public void adpd(int j){
		this.idpd = j;	
	}
	public int seepd(){
		return this.idpd;
	}
	public int seeid(){
		return this.cpd;
	}
}