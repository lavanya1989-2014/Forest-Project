package be.intecbrussel.the_notebook.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import be.intecbrussel.the_notebook.animal_entities.Animal;
import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.plant_entities.Plant;
	
public class ForestNotebook {
		
	//Properties
		private List<Carnivore> carnivores= new ArrayList<>();
		private List<Omnivore> omnivores=new ArrayList<>();
		private List<Herbivore> herbivores=new ArrayList<>();
		private int plantCount;
		private int animalCount;
		private List<Animal> animals=new ArrayList<Animal>();
		private List<Plant> plants=new ArrayList<Plant>();
		
		//constructors
		public ForestNotebook() {
			
		}
		
		//getters and setters
		public List<Carnivore> getCarnivores() {
			return carnivores;
		}
		
		public void setCarnivores(List<Carnivore> carnivores) {
			this.carnivores = carnivores;
				}
		
		public List<Omnivore> getOmnivores() {
		return omnivores;
		}
		
	    public void setOmnivores(List<Omnivore> omnivores) {
			this.omnivores = omnivores;
			}
	    
		public List<Herbivore> getHerbivores() {
			return herbivores;
		}
		
	    public void setHerbivores(List<Herbivore> herbivores) {
			this.herbivores = herbivores;
		}
	    
		public int getPlantCount() {
			
			return plantCount;
		}
		
		public int getAnimalCount() {
			return animalCount;
		}
		
		
		public void addAnimal(Animal a) {
			animalCount++;
			if(a instanceof Carnivore) {
				carnivores.add((Carnivore)a);
			}
			else if(a instanceof Herbivore) {
				herbivores.add((Herbivore)a);
			}
			else if(a instanceof Omnivore) {
				omnivores.add((Omnivore)a);
			}
					this.animals.add(a);
			}
		
		
		public void addPlant(Plant p) {
			plantCount++;
			this.plants.add(p);
			
		}
		public void printNotebook() {
			System.out.println();
			System.out.println();
			System.out.println("List of different kind of animals");
			System.out.println("------------------------------------------------");
			for(Animal a:animals)
				System.out.println(a);
			
			System.out.println();
			System.out.println();
			System.out.println("List of Plants");
			System.out.println("------------------------------------------------");
			for(Plant p:plants)
				System.out.println(p);
			
			System.out.println();
			System.out.println();
			System.out.println("List of Carnivorous");
			System.out.println("------------------------------------------------");
			System.out.println("Herbivorous List is :"+getCarnivores());
			
				
				System.out.println();
				System.out.println();
				System.out.println("List of Omnivorous");
				System.out.println("------------------------------------------------");
				System.out.println("Omnivorous animals are :"+getOmnivores());
					
				System.out.println();
				System.out.println();
				System.out.println("List of Herbivorous");
				System.out.println("------------------------------------------------");
				System.out.println("Carnivorous list are :"+getCarnivores());
			
			
			
		}
		public void sortAnimalsByName() {
		  
			animals.sort(new Comparator<Animal>() {

				@Override
				public int compare(Animal o1, Animal o2) {
	                 int comparision=0;
	                 comparision=o1.getName().compareTo(o2.getName());
	                 
	                 return comparision;
	                 }
				
			});
			System.out.println();
			System.out.println();
			System.out.println("Sorted Animal List according to Names:");
			System.out.println("------------------------------------------------");
			for(Animal a:animals)
			{
				System.out.println(a);
			}
				
			}
			
		public void sortPlantsByName() {
			plants.sort(new Comparator<Plant>() {

				@Override
				public int compare(Plant o1, Plant o2) {
					 int comparision=0;
	                 comparision=o1.getName().compareTo(o2.getName());
	                 return comparision;

					}
			});
			
			System.out.println();
			System.out.println();
			System.out.println("Sorted Plant List :");
			System.out.println("------------------------------------------------");
			for(Plant p:plants)
			{
				System.out.println(p);
			}
				
			}
	
			
		}


