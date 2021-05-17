package rupali.lunatech.assessment.Imdb.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Rupali *This class referes to the table title_crew from lunatech_imdb
 *         database
 * 
 */
@Entity
@Table(name = "title_crew")
public class TitleCrew {

	@Id
	@Column(name = "tconst")
	private String tconst;

	@Column(name = "directors")
	private String directors;

	@Column(name = "writers")
	private String writers;

	// getter setter methods
	public String getTconst() {
		return tconst;
	}

	// Getter and setter methods
	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public String getDirectors() {
		return directors;
	}

	public void setDirectors(String directors) {
		this.directors = directors;
	}

	public String getWriters() {
		return writers;
	}

	public void setWriters(String writers) {
		this.writers = writers;
	}

	// toString Method
	@Override
	public String toString() {
		
		return super.toString();
	}

}
