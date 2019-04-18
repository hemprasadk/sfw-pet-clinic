package prasad.springframework.sfwpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import prasad.springframework.sfwpetclinic.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    private final OwnerService ownerService;

    @RequestMapping({"","/index","index.html"})
    public String listvets(Model model)
    {
        model.addAttribute("owners",ownerService.findAll());
        return "owner/index";
    }

    @RequestMapping("/find")
    public String find(Model model)
    {
        model.addAttribute("owners",ownerService.findAll());
        return "notimplemented";
    }

}
