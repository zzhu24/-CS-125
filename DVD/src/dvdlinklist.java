public class dvdlinklist {

public String title;
public String genre;
public double originalp;
public double salep;
public boolean onsale;
public int rentedtime;
public boolean isretendout;

public dvdlinklist next;

public dvdlinklist(String newtitle,String genre,double originalp,double salep,boolean onsale,int rentedtime,boolean isretendout, dvdlinklist next) {
        this.title=newtitle;
this.genre=genre;
this.originalp=originalp;
this.salep=salep;
this.onsale=onsale;
this.rentedtime=rentedtime;
this.isretendout=isretendout;
this.next=next;}

public dvdlinklist(String newtitle,double neworip, dvdlinklist next) {
this.title = newtitle;
this.originalp=neworip;
this.next = next;}

public boolean titleexist (String newtitle) {
if (this.title.equalsIgnoreCase(newtitle)) return true;
if (this.next==null && (!this.title.equals(newtitle))) return false;
return this.next.titleexist(newtitle);}

public boolean inventoryexist (String newtitle) {
if ((!this.isretendout)&&this.title.equalsIgnoreCase(newtitle)) return true;
else if (this.next!=null) return this.next.inventoryexist(newtitle);
else return false;}

public static boolean genreexist (String newgenre) {
if (newgenre.equalsIgnoreCase("musical")||newgenre.equalsIgnoreCase("comedy")||newgenre.equalsIgnoreCase("drama")||newgenre.equalsIgnoreCase("documentary")||newgenre.equalsIgnoreCase("horror")||newgenre.equalsIgnoreCase("romance")) return true;
else return false;}

public void add(String newtitle, double neworiginp) {
if (this.next==null){this.next = new dvdlinklist(newtitle," ",neworiginp,(int)(neworiginp*0.8),false,0,false,null); }
else if (this.next.title.compareTo(newtitle)>0){dvdlinklist temp= this.next; this.next=new dvdlinklist(newtitle," ",neworiginp,neworiginp*0.8,false,0,false,null); this.next.next=temp;}
else next.add(newtitle, neworiginp);
}


     public void remove(String newtitle,dvdlinklist previous) {
    	 if (this.next!=null){ 
    	 if (this.next.title.equalsIgnoreCase(newtitle)){
    	 if (this.next.next!=null){dvdlinklist temp=this.next.next; this.next.next=null;this.next=temp;}
    	 else this.next=null;}
    	 else this.next.remove(newtitle,this);}
    	 else if (this.next==null&&(this.title.equalsIgnoreCase(newtitle))){previous.next=null;}
    	 else return;
}
     
     public void displayinventory() {
 	if (!this.isretendout){System.out.print(this.title+" (Rented "+this.rentedtime+" times)"+" Price: ");
 	if (this.originalp==0.0){System.out.println("$0.0   [Free!]");}
 	else if(this.onsale){System.out.println("$"+this.salep+"   [On Sale!]");}
 	else System.out.println("$"+this.originalp);
 	}
 	if (this.next!=null){this.next.displayinventory();}
 	else return;
 	}
     
     public void togglesalesign(String chosetitle) {
  	if (this.title.equalsIgnoreCase(chosetitle)){this.onsale=(!this.onsale);return;}	
  	if (this.next!=null){this.next.togglesalesign(chosetitle);} return;
  	}
     
     public void genredisplay(String chosegenre) {
  	if (this.genre.equalsIgnoreCase(chosegenre)&&(!this.isretendout)){System.out.print(this.title+" (Rented "+this.rentedtime+" times)"+" Price: ");
if (this.originalp==0){System.out.println("$0.0   [Currently Free!]");}
else if(this.onsale){System.out.println("$"+this.salep+"   [On Sale!]");}
 	else System.out.println("$"+this.originalp);
 	}
  	if (this.next!=null){this.next.genredisplay(chosegenre);} return;
  	}
     public double getrentprice(String renttitle) {
  	if (this.title.equalsIgnoreCase(renttitle)){
  	if (this.onsale){return this.salep;}
  	else return this.originalp;
 	}
  	else return this.next.getrentprice(renttitle); 
  	}
     public void rentthisdvd(String renttitle) {
  	if (this.title.equalsIgnoreCase(renttitle)){
  	this.isretendout=true;
  	this.rentedtime++;
 	}
  	else this.next.rentthisdvd(renttitle); 
  	}	

    public static void users_mannualdisplay() {
    	System.out.println("Welcome to the DVD Store! Select an option below:");
System.out.println("1) adding DVD");
System.out.println("2) removing DVD");
System.out.println("3) displaying inventory");
System.out.println("4) on sale / off sale");
System.out.println("5) display genre");
System.out.println("6) rent DVD");
System.out.println("7) quit\n\n");
System.out.print ("Select an option: ");
    }

}