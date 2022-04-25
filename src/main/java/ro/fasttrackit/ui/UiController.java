package ro.fasttrackit.ui;


import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ro.fasttrackit.service.CountryService;

@Controller
@RequestMapping("countries")
public class UiController {
    private final CountryService countryService;


    public UiController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    String getCountry(Model model, @RequestParam(required = false) Integer countryId){
        model.addAttribute("countries",countryService.getCountries());
        if(countryId!=null){
            model.addAttribute("countryInfo",countryService.getCountry(countryId)
                    .orElse(null));
        }
        return "countries";
    }
}
