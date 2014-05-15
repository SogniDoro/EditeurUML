package model;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * 
 * @author Dashell
 *
 */
public class ObjectUML implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private ArrayList<Method> methodeList;
	private ArrayList<Attribute> attributList;
	//Type de l'objet , 1 pour une classe , 2 pour une interface, 3 pour une classe abstraite
	private final int OBJECTTYPE;
	
	
	private Coordinates position;
	
	
	public ObjectUML(int objectType,int number){
		methodeList= new ArrayList<Method>();
		attributList=new ArrayList<Attribute>();
		//a changer , les coordonn��es seront pas 0,0 par default
		// Done ?
		position=new Coordinates(10+10*number,10+10*number);
		//Cr��ation d'un objet vide
		this.OBJECTTYPE=objectType;
		name="Object"+(number+1);
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	
	public int getOBJECTTYPE() {
		return OBJECTTYPE;
	}
	
	//Gestion de la liste des m��thodes:
	public void addMethod(Method m){
		methodeList.add(m);
	}
	public int methodeListSize(){
		return methodeList.size();
	}
	public Method getMehodAt(int index){
		return methodeList.get(index);
	}
	
	
	
	//Gestion de la liste des attributs:
	public void addAttribute(Attribute a){
		attributList.add(a);
	}
	public int attributListSize(){
		return attributList.size();
	}
	public Attribute getAttributeAt(int index){
		return attributList.get(index);
	}
	//Gestion des coordonn��es
	public int getX(){
		return position.getX();
	}
	public int getY(){
		return position.getY();
	}
	
	//Gestion de la position d'un objet
	/**
	 * 
	 * @param obj UML Object to Compare position on the vertical axe
	 * @return a positive number if the main object is above , negative else
	 */
	public int isAbove(ObjectUML obj){
		return obj.getY()-this.getY();
	}
	/**
	 * 
	 * @param obj UML Object to Compare position on the horizontal axe
	 * @return a positive number if the main object is on the right, negative else
	 */
	public int isOnTheRigth(ObjectUML obj){
		return this.getX()-obj.getX();
	}

	public int getObjectType() {
		return OBJECTTYPE;
	}


	
	public void setPosition(int x, int y){
		position.setX(x);
		position.setY(y);
	}
	
	
}