package be.intecbrussel.the_notebook.plant_entities;


public class Bush extends Plant{
	
//properties
		private String fruit;
		private LeafType leafType;
		
//Constructors
		public Bush(String name) {
			this.name=name;
		}
		public Bush(String name,double height)
		{
			this.name=name;
			this.height=height;
		}
		
//Setters and getters
		public String getFruit() {
			return fruit;
		}
		public void setFruit(String fruit) {
			this.fruit = fruit;
		}
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
