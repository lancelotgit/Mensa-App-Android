package at.sti2.model;


public class Menu {

	private String name;
	private String description;
	private String availabilityStarts;
	private String availabilityEnds;

	public Menu(String name, String description, String availabilityStarts, String availabilityEnds) {
		this.name = name;
		this.description = description;
		this.availabilityStarts = availabilityStarts;
		this.availabilityEnds = availabilityEnds;
	}

	public Menu() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvailabilityStarts() {
		return availabilityStarts;
	}

	public void setAvailabilityStarts(String availabilityStarts) {
		this.availabilityStarts = availabilityStarts;
	}

	public String getAvailabilityEnds() {
		return availabilityEnds;
	}

	public void setAvailabilityEnds(String availabilityEnds) {
		this.availabilityEnds = availabilityEnds;
	}

	public String getAvailabilityToDisplay() {
		String str = "Von ";
		str += this.getAvailabilityStarts().substring(this.getAvailabilityStarts().indexOf("T") + 1, this.getAvailabilityStarts().indexOf("T") + 6);
		str += " bis ";
		str += this.getAvailabilityEnds().substring(this.getAvailabilityEnds().indexOf("T") + 1, this.getAvailabilityEnds().indexOf("T") + 6);
		return str;
	}

}
