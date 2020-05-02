package be.intecbrussel.the_notebook.animal_entities;

import java.util.Set;
import be.intecbrussel.the_notebook.plant_entities.Plant;

public class Herbivore extends Animal {
	
//Properties
   Set<Plant> plantDiet;
	
//constructors
	public Herbivore(String name) {
		this.name=name;
	}
	public Herbivore(String name,double weight,double height,double length) {
		this.name=name;
		this.weight=weight;
		this.height=height;
		this.length=length;
	}
	
//getters and setters
	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}
	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}
	public void printDiet(){
		getPlantDiet().forEach(plant->System.out.println(plant));
		
	}
	public void addPlantToDiet(Plant p) {
		this.plantDiet.add(p);
	}
	
	@Override
	public String toString() {
		return   getName(); 
	}
	}