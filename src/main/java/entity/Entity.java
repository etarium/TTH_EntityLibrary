package entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import entity.enums.SpeciesEnum;
import entity.enums.Temperament;
import general.Statblock;
import items.Item;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entity {

	String name;
	String description;
	Temperament temperament;
	SpeciesEnum species;
	List<Item> inventory = new ArrayList<Item>();
	Statblock stats = new Statblock();;
	int level;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Temperament getTemperament() {
		return temperament;
	}
	public void setTemperament(Temperament temperament) {
		this.temperament = temperament;
	}
	public SpeciesEnum getSpecies() {
		return species;
	}
	public void setSpecies(SpeciesEnum species) {
		this.species = species;
	}
	public List<Item> getInventory() {
		return inventory;
	}
	public void setInventory(List<Item> inventory) {
		this.inventory = inventory;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public Statblock getStats() {
		return stats;
	}
	public void setStats(Statblock stats) {
		this.stats = stats;
	}
	@Override
	public String toString() {
		return "Entity [name=" + name + ", description=" + description + ", temperament=" + temperament + ", species="
				+ species + ", inventory=" + inventory + ", stats=" + stats + ", level=" + level + "]";
	}

}
