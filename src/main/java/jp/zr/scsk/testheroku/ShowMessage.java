package jp.zr.scsk.testheroku;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShowMessage {
	@RequestMapping(value = "/show", method = RequestMethod.POST)
//	public String login(Model model) {
//		model.addAttribute("adname", "OK");
//		return "top";
//	}
	public String login1(Model model,@ModelAttribute("adInput") String adInput) {
		model.addAttribute("adName", adInput);
		return "top";
	}
}