package com.sp.model;

public class Cart {
	private int id;
	private String name;
	private String family;
	private String description;
	private String affinity;
	private int hp; 
	private int defence;
	private int energy;
	private int attack;
	
	public Cart() {
		
	}
	
	public Cart(int id, String name, String family, String descritption, String affinity, int hp, int defence, int energy, int attack)
	{
		this.id = id;
		this.name = name;
		this.family = family;
		this.description = descritption;
		this.affinity = affinity;
		this.hp = hp;  
		this.defence = defence;
		this.energy = energy;
		this.attack = attack;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getFamily()
	{
		return family;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getAffinity()
	{
		return affinity;
	}
	
	public int getHp()
	{
		return hp;
	}
	
	public int getDefence()
	{
		return defence;
	}
	
	public int getEnergy()
	{
		return energy;
	}
	
	public int getAttack()
	{
		return attack;
	}
	
	
	
	
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setFamily(String family)
	{
		this.family = family ;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public void setAffinity(String affinity)
	{
		this.affinity =  affinity;
	}
	
	public void setHp(int hp)
	{
		this.hp = hp;
	}
	
	public void setDefence(int defence)
	{
		this.defence = defence;
	}
	
	public void setEnergy(int energy)
	{
		this.energy = energy;
	}
	
	public void setAttack(int attack)
	{
		this.attack = attack;
	}
	
	@Override
	public String toString() {
		return "HERO ["+this.id+"]: name:"
	+this.name+", family:"+this.family+", description:"+this.description+" affinity:"+this.affinity
	+" hp:"+this.hp + " defence:"+this.defence + " energy:"+this.energy + " attack :"+this.attack ;
	}


}
