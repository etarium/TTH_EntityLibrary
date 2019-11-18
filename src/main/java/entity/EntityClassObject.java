package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import entity.enums.EntityClassEnum;
import general.Ability;
import general.Statblock;
import items.enums.ArmorMaterial;
import items.enums.WeaponType;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityClassObject {
	EntityClassEnum name;
	String description;
	List<ArmorMaterial> armorType = new ArrayList<ArmorMaterial>();
	List<WeaponType> weaponType = new ArrayList<WeaponType>();
	List<Ability> skills = new ArrayList<Ability>();
	Statblock stats;
	
	public EntityClassEnum getName() {
		return name;
	}
	public void setName(EntityClassEnum name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<ArmorMaterial> getArmorType() {
		return armorType;
	}
	public void setArmorType(List<ArmorMaterial> armorType) {
		this.armorType = armorType;
	}
	public List<WeaponType> getWeaponType() {
		return weaponType;
	}
	public void setWeaponType(List<WeaponType> weaponType) {
		this.weaponType = weaponType;
	}
	public List<Ability> getSkills() {
		return skills;
	}
	public void setSkills(List<Ability> skills) {
		this.skills = skills;
	}
	public Statblock getStats() {
		return stats;
	}
	public void setStats(Statblock stats) {
		this.stats = stats;
	}
	public static List<EntityClassEnum> getClasses() {
		return Arrays.asList(EntityClassEnum.values());
	}
	
	@Override
	public String toString() {
		return "EntityClassObject [name=" + name + ", description=" + description + ", armorType=" + armorType
				+ ", weaponType=" + weaponType + ", skills=" + skills + ", stats=" + stats + "]";
	}
	
}
