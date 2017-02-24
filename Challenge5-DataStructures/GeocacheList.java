//UIUC CS125 FALL 2014 MP. File: GeocacheList.java, CS125 Project: Challenge5-DataStructures, Version: 2015-03-10T01:18:54-0500.421666706
/**
 * Complete the following GeocacheList, to ensure all unit tests pass.
 * There are several errors in the code below
 *
 * Hint: Get the Geocache class working and passing its tests first.
 */
/* @author zzhu24*/

public class GeocacheList {
private Geocache[] data = new Geocache[0];
private int size = 0;

public Geocache getGeocache(int i) {
return data[i];}

public int getSize() {
return size;}

public GeocacheList() {
data = new Geocache[0];
size = data.length;}

public GeocacheList(GeocacheList other, boolean deepCopy) {
if (deepCopy == true)
{data = new Geocache[other.size];
for(int a = 0; a < other.size; a++){
data[a] = new Geocache(other.data[a].getX(), other.data[a].getY());}
size = data.length;}
if(deepCopy == false){
data = other.data;
size = other.size;
System.out.println(data);}}

public void add(Geocache p) {
size++;
if (size > data.length) {
Geocache[] old = data;
data = new Geocache[size * 2];
for (int i = 0; i < old.length; i++)
data[i] = old[i];}
data[size-1] = p;}

public Geocache removeFromTop() {
size--;
Geocache[] removeTop = new Geocache[data.length - 1];
Geocache top = data[0];
for(int a = 1; a < data.length; a++)
removeTop[a-1] = data[a];
data = new Geocache[removeTop.length];
data = removeTop;	
return top;}

public String toString() {
StringBuffer s = new StringBuffer("GeocacheList:");
for (int i = 0; i < size; i++) {
if (i > 0)
s.append(',');
s.append(data[i]);}
return s.toString();}}