package rupali.lunatech.assessment.Imdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rupali.lunatech.assessment.Imdb.VO.TitleBasicVO;
import rupali.lunatech.assessment.Imdb.entity.TitleBasic;
import rupali.lunatech.assessment.Imdb.service.AppService;

/*This is a controller class 
 * This class accept the request from UI and serializes the return objects in to httpResponse 
 * 
 * 
 * */

@RestController
public class AppController {

	@Autowired
	private AppService titleService;

	@RequestMapping("/")
	public String viewHomePage(Model model, @RequestParam(required = false, name = "title") String title) {
		/*
		 * List<TitleBasic> listMovies = titleService.listAll(title);
		 * model.addAttribute("movies", listMovies); model.addAttribute("title", title);
		 */
		return "index";
	}
	
	@GetMapping("title")
	public List<TitleBasicVO> greetings() {
		return titleService.listAll("äbc");
	}
	
	/*
	 * @RequestMapping("/") public String viewPage(Model
	 * model, @RequestParam("genre") String genre) { List<TitleBasic> listMovies =
	 * titleService.listAll(genre); model.addAttribute("movies", listMovies);
	 * model.addAttribute("genre", genre);
	 * 
	 * return "index"; }
	 */
}
