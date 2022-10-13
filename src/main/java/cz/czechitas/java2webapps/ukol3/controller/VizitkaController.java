package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.Vizitka;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
@RequestMapping("/")
public class VizitkaController {

  private final List<Vizitka> seznamVizitek = List.of(
          new Vizitka("Zdeněk Špirk", "Pharmavo", "U Červených domků 2962/6", "69501 Hodonín", "zdenda@pharmavo.com", "775665665", null),
          new Vizitka("Gerlinda Kožnarová", "Pharminga", "Václavské náměstí 846/1", "11000 Praha 1", null, "775987845", "www.koznarova.net"),
          new Vizitka("Milan Andrejsek", "Fabpharm", "Jabloňová 2168", "73532 Rychvald", "milan@fabpharm.com", "756122544", "www.fabpharm.com"),
          new Vizitka("František Hlavinka", "Pharmaco", "Na Dolanech 69/23", "73601 Havířov", "franat@pharmaco.eu", "732781592", "www.frantapharmaco.com")
  );
  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("seznam");
    modelAndView.addObject("vizitky", seznamVizitek);
    return modelAndView;
  }

  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView modelAndView = new ModelAndView("detail");
    modelAndView.addObject("vizitka", seznamVizitek.get(id));
    return modelAndView;
  }
}
