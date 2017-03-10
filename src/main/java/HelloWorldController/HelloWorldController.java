package HelloWorldController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import DTO.MiUrl;
import clasesURL.HttpsValidacion;





@Controller
public class HelloWorldController {
	
	@Autowired
	private HttpsValidacion validacion;

	
	
	@RequestMapping("/hello")
	public ModelAndView welcomeMessage(
			@RequestParam(value = "name", required = false) String name) {
		
		
		name = (name.split(","))[0];
		
		validacion.limpiarLista();
		
		List<MiUrl> misurls = validacion.obtenerUrls(name);
		
		List<String> nombreurl = new ArrayList<String>();
		
		for(MiUrl urla: misurls){
			nombreurl.add(urla.getUrlcompleta());
			}
		
		ModelAndView view = new ModelAndView("hello");
		view.clear();
		view.addObject("name", name);
		view.addObject("urls", nombreurl);

		return view;
	}
}