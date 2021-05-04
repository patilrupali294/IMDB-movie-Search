package rupali.lunatech.assessment.Imdb.entity;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * @author Rupali
 *This class referes to the table name_basics from lunatech_imdb database
 */

@Entity
@Table(name ="name_basics")
public class NameBasics {
	@Id
	private String nconst;
	private String primaryName;
	private Integer birthYear;
	private Integer deathYear;
	private String primaryProfession;
	private String knownForTitles;
	
	//Constructor
	public NameBasics()
	{
		
	}
	
	
	public NameBasics(String nconst, String primaryName, Integer birthYear, Integer deathYear,
			String primaryProfession, String knownForTitles) {
		
		this.nconst = nconst;
		this.primaryName = primaryName;
		this.birthYear = birthYear;
		this.deathYear = deathYear;
		this.primaryProfession = primaryProfession;
		this.knownForTitles = knownForTitles;
	}

	//getter and setter methods
	public String getNconst() {
		return nconst;
	}
	public void setNconst(String nconst) {
		this.nconst = nconst;
	}
	public String getPrimaryName() {
		return primaryName;
	}
	public void setPrimaryName(String primaryName) {
		this.primaryName = primaryName;
	}
	public Integer getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}
	public Integer getDeathYear() {
		return deathYear;
	}
	public void setDeathYear(Integer deathYear) {
		this.deathYear = deathYear;
	}
	public String getPrimaryProfession() {
		return primaryProfession;
	}
	public void setPrimaryProfession(String primaryProfession) {
		this.primaryProfession = primaryProfession;
	}
	public String getKnownForTitles() {
		return knownForTitles;
	}
	public void setKnownForTitles(String knownForTitles) {
		this.knownForTitles = knownForTitles;
	}

	// toString method
	@Override
	public String toString() {
		return "NameBasics [nconst=" + nconst + ", primaryName=" + primaryName + ", birthYear=" + birthYear
				+ ", deathYear=" + deathYear + ", primaryProfession=" + primaryProfession + ", knownForTitles="
				+ knownForTitles + "]";
	}
	
	
	
	
}
