package be.intecbrussel.the_notebook.plant_entities;

public class Weed extends Plant {
	
//Properties
		private double area;
		
//constructors
		public Weed(String name){
			this.name=name;
			}
		public Weed(String name,double height) {
			this.name=name;
			this.height=height;		
		}
		
//getters and setters
		public double getArea() {
			return area;
		}
		public void setArea(double area) {
			this.area = area;
		}
		
		@Override
		public String toString() {
			return   getName(); 
		}

}
