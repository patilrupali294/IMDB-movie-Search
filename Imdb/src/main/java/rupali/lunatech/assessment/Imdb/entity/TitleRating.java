package rupali.lunatech.assessment.Imdb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Rupali *This class referes to the table title_ratings from
 *         lunatech_imdb database
 *
 */
@Entity
@Table(name = "title_ratings")
public class TitleRating {

	@Id
	@Column(name = "tconst", nullable = false)
	private String tconst;

	@Column(name = "averagerating")
	private Double averageRating;

	@Column(name = "numvotes")
	private Integer numVotes;

	public String getTconst() {
		return tconst;
	}

	// Getter and setter methods
	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

	public Integer getNumVotes() {
		return numVotes;
	}

	public void setNumVotes(Integer numVotes) {
		this.numVotes = numVotes;
	}

	// toString Method
	@Override
	public String toString() {
		
		return super.toString();
	}

}
