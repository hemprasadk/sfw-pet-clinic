package prasad.springframework.sfwpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import prasad.springframework.sfwpetclinic.services.VetService;

@Controller
public class VetsController {

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    private final VetService vetService;

    @RequestMapping({"vets","vets/index","vets/index.html","vets.html"})
    public String listvets(Model model)
    {
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
