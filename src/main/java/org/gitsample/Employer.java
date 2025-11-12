package org.gitsample;

public class Employer {
	
	private String name;
	private String industry;
	private String startedYear;
	
	public Employer(String name, String industry, String startedYear) {
		super();
		this.name = name;
		this.industry = industry;
		this.startedYear = startedYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getStartedYear() {
		return startedYear;
	}
	public void setStartedYear(String startedYear) {
		this.startedYear = startedYear;
	}

}
