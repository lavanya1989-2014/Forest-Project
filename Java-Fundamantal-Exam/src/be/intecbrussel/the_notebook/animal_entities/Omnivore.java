package be.intecbrussel.the_notebook.animal_entities;

import java.util.Set;
import be.intecbrussel.the_notebook.plant_entities.Plant;


public class Omnivore extends Animal {
	
//Properties
	private double maxFoodSize;
	private Set<Plant> plantDiet;
	
//constructors
	public Omnivore(String name) {
		this.name=name;
	}
	public Omnivore(String name,double weight,double height,double length) {
		this.name=name;
		this.weight=weight;
		this.height=height;
		this.length=length;
	}
	
//getters and setters
	public double getMaxFoodSize() {
		return maxFoodSize;
	}
	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}
	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}
	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}
	public void addPlantToDiet(Plant p) {
		this.plantDiet.add(p);
		
	}
	

	@Override
	public String toString() {
		return   getName(); 
	}
	
}
