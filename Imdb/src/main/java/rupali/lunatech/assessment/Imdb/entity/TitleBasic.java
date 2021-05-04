package rupali.lunatech.assessment.Imdb.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Rupali *This class referes to the table title_basics from
 *         lunatech_imdb database
 * 
 */
@Entity
@Table(name = "title_basics")
public class TitleBasic {

	@Id
	@Column(name = "tconst")
	private String tconst;

	@Column(name = "titletype")
	private String titleType;

	@Column(name = "primarytitle")
	private String primaryTitle;

	@Column(name = "originaltitle")
	private String originalTitle;

	@Column(name = "isadult")
	private boolean isAdult;

	@Column(name = "startyear")
	private Long startYear;

	@Column(name = "endyear")
	private Long endYear;

	@Column(name = "runtimeminutes")
	private Long runtimeMinutes;

	@Column(name = "genres")
	private String genres;

	/*
	 * @OneToOne(cascade = CascadeType.ALL) private TitleCrew titleCrew;
	 * 
	 * @OneToOne(cascade = CascadeType.ALL) private TitlePrincipals titlePrincipals;
	 * 
	 * @OneToOne(cascade = CascadeType.ALL) private TitleRating titleRating;
	 */
	// getter and setter methods
	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public String getTitleType() {
		return titleType;
	}

	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}

	public String getPrimaryTitle() {
		return primaryTitle;
	}

	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public boolean isAdult() {
		return isAdult;
	}

	public void setAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}

	public Long getStartYear() {
		return startYear;
	}

	public void setStartYear(Long startYear) {
		this.startYear = startYear;
	}

	public Long getEndYear() {
		return endYear;
	}

	public void setEndYear(Long endYear) {
		this.endYear = endYear;
	}

	public Long getRuntimeMinutes() {
		return runtimeMinutes;
	}

	public void setRuntimeMinutes(Long runtimeMinutes) {
		this.runtimeMinutes = runtimeMinutes;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	/*
	 * @Embedded public TitleCrew getTitleCrew() { return titleCrew; }
	 * 
	 * @Embedded public void setTitleCrew(TitleCrew titleCrew) { this.titleCrew =
	 * titleCrew; }
	 * 
	 * @Embedded public TitlePrincipals getTitlePrincipals() { return
	 * titlePrincipals; }
	 * 
	 * @Embedded public void setTitlePrincipals(TitlePrincipals titlePrincipals) {
	 * this.titlePrincipals = titlePrincipals; }
	 * 
	 * @Embedded public TitleRating getTitleRating() { return titleRating; }
	 * 
	 * @Embedded public void setTitleRating(TitleRating titleRating) {
	 * this.titleRating = titleRating; }
	 */

	// toString method
	@Override
	public String toString() {
		return super.toString();

	}

}
