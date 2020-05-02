package be.intecbrussel.the_notebook.plant_entities;


public class Flower extends Plant {
	
//Properties
		private Scent smell;
		
//Constructors
		public Flower(String name){
			this.name=name;
		}
		public Flower(String name,double height) {
			this.name=name;
			this.height=height;
		}
		
//getters and setters 
		public Scent getSmell() {
			return smell;
		}
		public void setSmell(Scent smell) {
			this.smell = smell;
		}
		
		@Override
		public String toString() {
			return   getName(); 
		}

}
