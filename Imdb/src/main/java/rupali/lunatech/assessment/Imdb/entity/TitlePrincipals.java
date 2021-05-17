package rupali.lunatech.assessment.Imdb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Rupali *This class referes to the table title_principles from
 *         lunatech_imdb database
 * 
 */
@Entity
@Table(name = "title_principals")
public class TitlePrincipals {

	@Id
	@Column(name = "tconst", nullable = false)
	private String tconst;

	@Column(name = "ordering")
	private Integer ordering;

	@Column(name = "nconst")
	private String nconst;

	@Column(name = "category")
	private String category;

	@Column(name = "job")
	private String job;

	@Column(name = "characters")
	private String characters;

	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public Integer getOrdering() {
		return ordering;
	}

	public void setOrdering(Integer ordering) {
		this.ordering = ordering;
	}

	public String getNconst() {
		return nconst;
	}

	public void setNconst(String nconst) {
		this.nconst = nconst;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getCharacters() {
		return characters;
	}

	public void setCharacters(String characters) {
		this.characters = characters;
	}

	// toString method
	@Override
	public String toString() {
		
		return super.toString();
	}

}
