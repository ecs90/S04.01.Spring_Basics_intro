package cat.itacademy.barcelonactiva.salas.ezequiel.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nom){
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }

    @GetMapping(value = {"/HelloWorld2/{nom}", "HelloWorld2"})
    public String saluda2(@PathVariable(required = false) String nom){
        if (nom == null) {
            nom = "UNKNOWN";
        }
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }
}
