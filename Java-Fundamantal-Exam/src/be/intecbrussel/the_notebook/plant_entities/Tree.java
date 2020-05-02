package be.intecbrussel.the_notebook.plant_entities;


public class Tree extends Plant {
	
//variables
		private LeafType leafType;
		
//constructors
		public Tree(String name) {
			this.name=name;
		
		}
		public Tree(String name,double height) {
			this.name=name;
			this.height=height;
		}
		
//getters and setters
		public LeafType getLeafType() {
			return leafType;
		}
		public void setLeafType(LeafType leafType) {
			this.leafType = leafType;
		}

		
		@Override
		public String toString() {
			return   getName(); 
		}
}
