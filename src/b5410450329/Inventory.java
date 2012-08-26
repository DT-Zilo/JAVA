package b5410450329;


public class Inventory {
   private static int startId = 1001;
   private int id;
   private String name;
   private int amount;
     public Inventory(String name,int amount){
    	 this.id = startId;
    	 this.startId++;
    	 this.name = name;
    	 this.amount = amount;
     }
     public String getName(){
    	 return this.name;
    	 
     }
     public void setName(String name){
    	 this.name = name;
     }
     public void addAmount(int amount){
    	 amount += amount;
     }

     public int getAmount(){
    	 return this.amount;
     }
     public int getId(){
    	 return this.id;
     }
}

