package cz.czechitas.java2webapps.ukol3.service;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class VizitkaService {

    private final List<Vizitka> seznamVizitek = new ArrayList<>();

    public VizitkaService() {
        seznamVizitek.add(new Vizitka("Zdeněk Špirk", "Pharmavo", "U Červených domků 2962/6", "69501 Hodonín", "zdenda@pharmavo.com", "775665665", null));
        seznamVizitek.add(new Vizitka("Gerlinda Kožnarová", "Pharminga", "Václavské náměstí 846/1", "11000 Praha 1", null, "775987845", "www.koznarova.net"));
        seznamVizitek.add(new Vizitka("Milan Andrejsek", "Fabpharm", "Jabloňová 2168", "73532 Rychvald", "milan@fabpharm.com", "756122544", "www.fabpharm.com"));
        seznamVizitek.add(new Vizitka("František Hlavinka", "Pharmaco", "Na Dolanech 69/23", "73601 Havířov", "franat@pharmaco.eu", "732781592", "www.frantapharmaco.com"));
    }

    public List<Vizitka> nacistVsechnyVizitky() {
        return seznamVizitek;
    }

    public Vizitka vyhledatVizitkuPomociId(int id) {
        if (id < seznamVizitek.size()) {
             return seznamVizitek.get(id);
        }
        return null;
    }

    public void pridatVizitku(Vizitka vizitka) {
        seznamVizitek.add(vizitka);
    }

    public void smazatPodleId(int id) {
        seznamVizitek.remove(id);
    }

}
