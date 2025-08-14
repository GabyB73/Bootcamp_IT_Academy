package cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t01.n01.S04T01N01BustamanteGabriela;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue="UNKNOWN") String nombre){
        return "Hola " + nombre + " estás ejecutando un proyecto con Maven!";
    }
    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nombre}"})
    public String saluda2(@PathVariable(required = false) String nombre){
        return "Hola " + nombre + " estás ejecutando un proyecto con Maven!";
    }
}
