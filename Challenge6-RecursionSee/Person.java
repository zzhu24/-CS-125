//UIUC CS125 FALL 2014 MP. File: Person.java, CS125 Project: Challenge6-RecursionSee, Version: 2015-03-30T09:35:13-0500.461573126
/**
 * @author zzhu24
 *
 */
public class Person
{
private final String name;
private final int age;
private final char gender;
private final Person child1; //left child
private final Person child2; //right child

public Person(String name, int age, char gender, Person c1, Person c2)
{
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.child1 = c1;
    this.child2 = c2;
}

public String toString()
{
    return name+"*"+age+"*"+gender;
}

public String getName() 
{
	return name;
}

public int getAge() 
{
	return age;
}

public char getGender() 
{
	return gender;
}

public boolean equals(Person p)
{
	return (this.name.equals(p.name)) &&
			(this.age==p.age) &&
			(this.gender==p.gender);
}


public void print() 
{
   System.out.println(this);
   if(child1 != null)
       child1.print();
   if(child2 != null)
       child2.print();
   
}

//this instance method take no parameters. Specifically,it should return the 
//number of people in the tree (including this person) and so this method
//returns an int. Note that if the family tree had only a single node,  count() would 
//return 1.
public int count() {// total person count including this object
if((child1 != null) && (child2 != null))
{return 1 + child1.count() + child2.count();}
if((child1 == null) && (child2 != null))
{return 1 + child2.count();}
if ((child1 != null) && (child2 == null))
{return 1 + child1.count();}
else
return 1;}

//this instance method takes no parameters and returns an int. This method should
//return the number of grandchildren of the current person. Note that the children, great 
//grandchildren... are NOT included. This method counts ONLY the grandchildren
//of the current person. Be sure to use recursion.
//Hint: make this method a wrapper to a general recursive method with a depth integer parameter.
public int countGrandChildren() {// but not greatGrandChildren
int count =0;
if(this.child1!=null){
if(this.child1.child1!=null)count++;
if(this.child1.child2!=null)count++;}
if(this.child2!=null){
if(this.child2.child1!=null)count++;
if(this.child2.child2!=null)count++;}
return count;}

//this instance method takes no parameters and counts the number of  generations 
//represented by the family tree. The method returns an int. 
//The root counts as the first generation. 
public int countMaxGenerations(){
if ((child1 != null) && (child2 != null))
{if (this.child1.countMaxGenerations() > this.child2.countMaxGenerations())
{return (1 + this.child1.countMaxGenerations());}
else
{return (1 + this.child2.countMaxGenerations());}}
if ((child1 == null) && (child2 != null))
{return (1 + this.child2.countMaxGenerations());}
if ((child1 != null) && (child2 == null))
{return (1 + this.child1.countMaxGenerations());}
else
return 1;}

//this instance method takes one parameter, a char denoting the gender we want to 
//count( we will only use 'M' and 'F' ). This method should return the number 
//of males or females in the family tree. So, the return type should be an int. 
public int countGender(char gen){
if((child1 != null) && (child2 != null))
{if (this.getGender() == gen)
{return 1 + this.child1.countGender(gen) + this.child2.countGender(gen);}
else
{return 0 + this.child1.countGender(gen) + this.child2.countGender(gen);}}
if((child1 == null) && (child2 != null))
{if (this.getGender() == gen)
{return 1 + this.child2.countGender(gen);}
else
{return 0 + this.child2.countGender(gen);}}
if((child1 != null) && (child2 == null))
{if (this.getGender() == gen)
{return 1 + this.child1.countGender(gen);}
else
{return 0 + this.child1.countGender(gen);}}
else
{if (this.getGender() == gen)
{return 1;}
else
{return 0;}}}


//this instance method searches for a particular person in the family tree.
public Person search(String name, int maxGeneration)
{if(maxGeneration<=0){
return null;} 
else
{if(this.getName().equals(name))
{return this;}
else
{if((child1 != null)&&(child2 == null)){
if(child1.search(name, maxGeneration-1) != null) return child1.search(name, maxGeneration-1);
else return null;}
if((child1 == null)&&(child2 != null))
{if(child2.search(name, maxGeneration-1) != null) return child2.search(name, maxGeneration-1);
else return null;}
if((child1 != null)&&(child2 != null))
{if(child1.search(name, maxGeneration-1) != null) return child1.search(name, maxGeneration-1);
else{
if(child2.search(name, maxGeneration-1) != null) return child2.search(name, maxGeneration-1);}
return null;}
return null;}}













}}// end of class