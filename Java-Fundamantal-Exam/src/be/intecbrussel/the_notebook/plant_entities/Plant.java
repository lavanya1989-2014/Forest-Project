package be.intecbrussel.the_notebook.plant_entities;

public class Plant {
	
//properties
		protected String name;
		protected double height;
		 
//Constructors
		public Plant() {
			
		}
		 public Plant(String name){
			 this.name=name;
		 }
		 public Plant(String name,double height){
			 this.name=name;
			 this.height=height;
		 }		 
		 
//getters and setters
		public String getName() {
			return name;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}

}
