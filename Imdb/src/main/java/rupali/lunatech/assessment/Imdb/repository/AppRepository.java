package rupali.lunatech.assessment.Imdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import rupali.lunatech.assessment.Imdb.VO.TitleBasicVO;
import rupali.lunatech.assessment.Imdb.entity.TitleBasic;

@Repository
public interface AppRepository extends JpaRepository<TitleBasic, Long> {

	//This query is for requirement #1
	/*
	 * @Query("SELECT p.tconst, p.primaryTitle, p.originalTitle, p.startYear, p.runtimeMinutes, p.genres FROM TitleBasic p WHERE p.primaryTitle LIKE '%?1%'"
	 * + " OR p.originalTitle LIKE '%?1%'")
	 */	
	@Query(value ="SELECT new rupali.lunatech.assessment.Imdb.VO.TitleBasicVO(t.tconst, t.primaryTitle, t.originalTitle, t.startYear, t.runtimeMinutes, t.genres) FROM TitleBasic t WHERE t.primaryTitle = 'Hamlet'")
	public List<TitleBasicVO> search(String title);

	/*
	 * //This query is for requirement #2
	 * 
	 * @Query("select t.primaryTitle, t.originalTitle,t.genres,t1.averageRating from TitleBasic t,"
	 * + " TitleRating t1 where t.tconst=t1.tconst " +
	 * "and t.genres like %?1% order by t1.averageRating desc") public
	 * List<TitleBasic> searchWithGenre(String genre);
	 */
	}
