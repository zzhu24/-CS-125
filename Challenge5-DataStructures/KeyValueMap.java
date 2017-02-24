//UIUC CS125 FALL 2014 MP. File: KeyValueMap.java, CS125 Project: Challenge5-DataStructures, Version: 2015-03-10T01:18:54-0500.421666706
/* @author zzhu24 */
import java.awt.Color;

public class KeyValueMap { // aka Dictionary or Map
	private String name[];
	private Color color[];
	private int number = 94;
	private int a;
	
	public KeyValueMap() {
	color = new Color[number];
	name = new String[number]; }
	
	/**
	 * Adds a key and value. If the key already exists, it replaces the original
	 * entry.
	 */
	
	public void add(String key, Color value) {
	if (a < number){
	color[a] = value;
	name[a] = key;
	a ++;}
	if (a >= number) {
	number = number * 2;
	if (a < number ){
	color[a] = value;
	name[a] = key;
	a ++;}}}

	/**
	 * Returns particular Color object previously added to this map.
	 */
	
	public Color find(String key) {
	for(int j = 0; j < a; j++){
	if(name[j].equals(key))
	return color[j];}
	return null;}

	/**
	 * Returns true if the key exists in this map.
	 */
	
	public boolean exists(String key) {
	for(int j = 0; j < a; j++){
	if(name[j].equals(key))
	return true;}
	return false;}

	/**
	 * Removes the key (and the color) from this map.
	 */
	
	public void remove(String key) {
	int b = 0;
	for(int j  = 0; j < a; j++){
	if(key.equals(name[j]) == true){
	b = j;
	break;}
	if((j == a)  &&  (key.equals(name[j]) == false) )
	return;}
	for(int j = b; j < a; j++){
	name[j] = name[j+1];
	color[j] = color[j+1];}
	color[a] = null;
	name[a] = null;
	a--;}}
