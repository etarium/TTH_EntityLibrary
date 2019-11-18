package entity;

import java.util.ArrayList;
import java.util.List;

import entity.enums.Faction;
import general.Quest;

public class NPCEntity extends Entity{

	List<Quest> quests = new ArrayList<Quest>();
	Faction faction;
	int xpEarned;
	int xpLost; //should we?
	
	public List<Quest> getQuests() {
		return quests;
	}
	public void setQuests(List<Quest> quests) {
		this.quests = quests;
	}
	public Faction getFaction() {
		return faction;
	}
	public void setFaction(Faction faction) {
		this.faction = faction;
	}
	
	@Override
	public String toString() {
		return "NPCEntity [quests=" + quests + ", faction=" + faction + ", name=" + name + ", description="
				+ description + ", temperament=" + temperament + ", species=" + species + ", inventory=" + inventory
				+ ", level=" + level + "]";
	}
	
}
