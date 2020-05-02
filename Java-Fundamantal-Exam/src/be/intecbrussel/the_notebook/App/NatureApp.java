package be.intecbrussel.the_notebook.App;

import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.plant_entities.Bush;
import be.intecbrussel.the_notebook.plant_entities.Flower;
import be.intecbrussel.the_notebook.plant_entities.Tree;
import be.intecbrussel.the_notebook.plant_entities.Weed;
import be.intecbrussel.the_notebook.service.ForestNotebook;

public class NatureApp {

	public static void main(String[] args) {

			ForestNotebook fnb =new ForestNotebook();
			fnb.addPlant(new Bush("Azalea"));
			fnb.addPlant(new Tree("CoastREdWood"));
			fnb.addPlant(new Flower("Jasmin"));
			fnb.addPlant(new Weed("Gorse"));
			fnb.addPlant(new Flower("Lotus"));
			fnb.addAnimal( new Carnivore("Lion"));
			fnb.addAnimal( new Omnivore("RedFox"));
			fnb.addAnimal( new Herbivore("Horse"));
			fnb.addAnimal( new Carnivore("Tiger"));
			fnb.addAnimal( new Omnivore("Bears"));
			fnb.addAnimal( new Herbivore("Deer"));
			fnb.addAnimal( new Carnivore("BlackPanther"));
			fnb.addAnimal( new Omnivore("Raccoon"));
			fnb.addAnimal( new Herbivore("Goat"));
		
		
		
		 	System.out.println("Number of Plants : "+fnb.getPlantCount());
			System.out.println("Number of Animals : "+fnb.getAnimalCount());
	      
			fnb.printNotebook();
			fnb.sortAnimalsByName();
			fnb.sortPlantsByName();
			
			
			

	}

}
