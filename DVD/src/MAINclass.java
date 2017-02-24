public class MAINclass {
	
	/**
	 * @reviewed yyu18, ykang27
	 * @author zzhu24
	 * @param args
	 */
  public static void main(String[] args) {
// TODO Auto-generated method stub

dvdlinklist head=new dvdlinklist(" "," ",0.0,0.0,false,1,true,null);
dvdlinklist a=new dvdlinklist("Mr.Beam","Comedy",18.0,17.0,true,1,true,null);
dvdlinklist b=new dvdlinklist("White Whale","Thriller",17.9,16.9,true,2,true,null);
dvdlinklist c=new dvdlinklist("Alvin and The Chipmunks","Comedy",23.3,22.2,true,3,true,null);
dvdlinklist d=new dvdlinklist("Mulan","Carton",108.78,107.78,false,4,false,null);
dvdlinklist e=new dvdlinklist("Two Broken Girls","Comedy",64.5,63.5,false,5,false,null);
dvdlinklist f=new dvdlinklist("The Planton of The Opera","musical",297.8,296.8,false,6,true,null);
dvdlinklist g=new dvdlinklist("Castle in the sky","Cartoon",0,0,false,7,false,null);
dvdlinklist h=new dvdlinklist("Scream","Thriller",68.3,67.3,true,8,false,null);
head.next=a;a.next=b; b.next=c; c.next=d; d.next=e;e.next=f;f.next=g; g.next=h;

boolean notquit=true;

dvdlinklist.users_mannualdisplay();
while(notquit==true){
int userintchoice=TextIO.getlnInt();
if(userintchoice==1){ 
TextIO.putln("Choices: 1) add an DVD. ");
TextIO.putln("Please enter the title of which DVD you want to add: (case does not matter)");
String chosetitle=TextIO.getln(); 
while (head.titleexist(chosetitle)==true) {System.out.println("DVD \""+chosetitle+"\" already exist, create another title: "); chosetitle=TextIO.getln(); }
TextIO.putln("Enter the price: "); double newpriceori=TextIO.getlnInt();
head.add(chosetitle, newpriceori); 
TextIO.putln("Successfully added \""+chosetitle+"\" in store.");
TextIO.putln("\nPlease enter another action number or enter \"7\" to quit.");}

if(userintchoice==2){ 
TextIO.putln("Your choice is: 2) remove an DVD. ");
TextIO.putln("Please enter the title to remove: (case does not matter)");
String chosetitle=TextIO.getln(); 
if (head.titleexist(chosetitle)==true) {head.remove(chosetitle, head); System.out.println("DVD \""+chosetitle+"\" has been successfully removed"); }
else TextIO.putln("The title dose not exist.");
TextIO.putln("\nPlease enter another action number or enter \"7\" to quit.");}

if(userintchoice==3){  
TextIO.putln("\n\nHere are the DVDs that currently in our store:\n"); 
head.displayinventory();
TextIO.putln("\nPlease enter another action number or enter \"7\" to quit.");}

if(userintchoice==4){  
TextIO.putln("\nPlease enter the title of which DVD (*notice that this will alter sale status of this dvd): ");
String titlechosed=TextIO.getln(); 
while (head.titleexist(titlechosed)==false){System.out.println("DVD \""+titlechosed+"\" does not exist, please enter a new title: ");titlechosed=TextIO.getln(); }
head.togglesalesign(titlechosed);
TextIO.putln("The sale status of DVD \""+titlechosed+"\" have been successfully altered."); 
TextIO.putln("\nPlease enter another action number or enter \"7\" to quit.");}

if(userintchoice==5){  
TextIO.putln("\nPlease select a gener you interestedin: \ncomedy, drama, documentary, thriller, cartoon, soap opera, romance, musical\nPlease enter the genre: ");
String choosegenre=TextIO.getln();
while (dvdlinklist.genreexist(choosegenre)==false){System.out.println("Please enter the genre carefully: ");choosegenre=TextIO.getln();}
TextIO.putln("\nHere are the DVDs under genre \""+choosegenre+"\" that currently in our store inventory:");
head.genredisplay(choosegenre);
TextIO.putln("\nPlease enter another action number ior enter \"7\" to quit.");}

if(userintchoice==6){  
TextIO.putln("This the list of DVDs that are currently in our inventory: \n");
head.displayinventory();
TextIO.putln("Please enter the title of the DVD you want to rent: \n");
String rentdvd=TextIO.getln();
while (head.inventoryexist(rentdvd)==false){System.out.println("Please enter the title since some mistakes occur: ");rentdvd=TextIO.getln();}
TextIO.putln("Total amount is $"+head.getrentprice(rentdvd)+" from your credit card, if correct enter true. Else enter false:");
boolean sure=TextIO.getlnBoolean();
if (sure==true) {head.rentthisdvd(rentdvd);
TextIO.putln("congrats! you have successfully rented \""+rentdvd+"\" from our store.");
TextIO.putln("\nPlease enter another action number if you want to continue, else enter \"7\" to quit.");}
else {System.out.println("Since you decided not to rent, your money is kept.");
TextIO.putln("\nPlease enter another action number if you want to continue, else enter \"7\" to quit.");}}


if(userintchoice==7){  
TextIO.putln("Are you sure you want to quit? - all your data will be lost.");
boolean answer=TextIO.getlnBoolean();
if (answer==true){notquit=false;}
else TextIO.putln("\nPlease enter another action number if you want to continue, else enter \"7\" to quit.");}

else if(userintchoice<1||userintchoice>7)
TextIO.putln("please enter your choice carefully since some mistakes occur: ");}}}
