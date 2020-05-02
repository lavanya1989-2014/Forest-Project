package be.intecbrussel.the_notebook.animal_entities;

public class Carnivore extends Animal {
	
//Properties
		private double maxFoodSize;
		
//constructors
		public Carnivore(String name) {
			this.name=name;
		}
		public Carnivore(String name,double weight,double height,double length) {
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
		
		@Override
		public String toString() {
			return   getName(); 
		}

}
