package rupali.lunatech.assessment.Imdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rupali.lunatech.assessment.Imdb.VO.TitleBasicVO;
import rupali.lunatech.assessment.Imdb.entity.TitleBasic;
import rupali.lunatech.assessment.Imdb.repository.AppRepository;

/* This is Service class used to write the logic of the problem 
 * In this class requirement #1 which is to find movie with primary title or original title is written in the method listAll
 * requirement #2 which is to find top rated movies according to genre searched by user which is written in the class searchWithGenre
 * 
 * 
 * */
@Service
public class AppService {

	@Autowired
	private AppRepository repo;

	public List<TitleBasicVO> listAll(String title) {

		/*
		 * if (title != null) { 
		 */
		//return repo.findAll();
		return repo.search(title);

	}
	
	
	/*
	 * public List<TitleBasic> searchWithGenre(String genre) {
	 * 
	 * if (genre != null) { return repo.searchWithGenre(genre); } return
	 * repo.findAll();
	 * 
	 * }
	 */

}
