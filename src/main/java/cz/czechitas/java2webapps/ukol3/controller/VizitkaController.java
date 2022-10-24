package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import cz.czechitas.java2webapps.ukol3.service.VizitkaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */

@Controller
@RequestMapping("/")
public class VizitkaController {

  private final VizitkaService service;

  public VizitkaController(VizitkaService service) {
    this.service = service;
  }

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("seznam");
    modelAndView.addObject("vizitky", service.nacistVsechnyVizitky());
    return modelAndView;
  }

  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView modelAndView = new ModelAndView("detail");
    modelAndView.addObject("vizitka", service.vyhledatVizitkuPomociId(id));
    return modelAndView;
  }

  @GetMapping("/nova")
  public ModelAndView novaVizitka() {
    ModelAndView modelAndView = new ModelAndView("novaVizitkaFormular");
    return modelAndView;
  }

  @PostMapping("/nova")
  public String pridatVizitku(Vizitka vizitka) {
    service.pridatVizitku(vizitka);
    return "redirect:/";
  }

  @PostMapping("/delete")
  public String odebratVizitku(int id) {
    service.smazatPodleId(id);
    return "redirect:/";
  }

}
