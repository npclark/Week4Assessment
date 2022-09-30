/**
 * @author Noah Clark - npclark
 * CIS175 Spring 2022
 * Feb 10, 2022
 */
package model;

public class heroCreation {

	String name;
	String heroTitle;
	
	public heroCreation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public heroCreation(String name) {
		super();
		this.name = name;
		legendBegins(name);
	}
	
	public void legendBegins(String name) {
		if (name.length() < 5) {
			setHeroTitle(name + " the Mighty");
		} else {
			setHeroTitle(name + " the Brave");
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the heroTitle
	 */
	public String getHeroTitle() {
		return heroTitle;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
		legendBegins(name);
	}

	/**
	 * @param heroTitle the heroTitle to set
	 */
	public void setHeroTitle(String heroTitle) {
		this.heroTitle = heroTitle;
	}

	@Override
	public String toString() {
		return "heroCreation [name=" + name + ", heroTitle=" + heroTitle + "]";
	}

}
