package rupali.lunatech.assessment.Imdb.VO;

import javax.persistence.Column;

public class  TitleBasicVO {

	private String tconst;

	private String primaryTitle;

	private String originalTitle;

	private Long startYear;

	private Long runtimeMinutes;

	private String genres;

	public TitleBasicVO(String tconst, String primaryTitle, String originalTitle, Long startYear, Long runtimeMinutes,
			String genres) {
		this.tconst = tconst;
		this.primaryTitle = primaryTitle;
		this.originalTitle = originalTitle;
		this.startYear = startYear;
		this.runtimeMinutes = runtimeMinutes;
		this.genres = genres;
	}

	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
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

	public Long getStartYear() {
		return startYear;
	}

	public void setStartYear(Long startYear) {
		this.startYear = startYear;
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
	
}
