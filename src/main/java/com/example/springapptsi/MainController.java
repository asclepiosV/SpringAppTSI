package com.example.springapptsi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class MainController {

    @RequestMapping(path= "/info")
    public String info(){
        return " <h1>Paul Flammarion</h1>\n" +
                " <h2>St62487</h2>\n" +
                " <h3>Variant N°8</h3>\n" +
                " <h3>Exam date : 2022</h3>";
    }
    @Autowired
    private BoatRepository boatRepository;

    @GetMapping(path="/getAll")
    public Iterable<Boat> getAllBoats() {
        return boatRepository.findAll();
    }
    @GetMapping("/get")
    public Optional<Boat> getById(
            @RequestParam(
                    value = "id",
                    defaultValue = "1") Integer id){
                return boatRepository.findById(id);
    }

    @GetMapping(path="/totalprice")
    public double getTotal() {
        return boatRepository.findAll()
                .stream()
                .mapToDouble(Boat::getPrice)
                .sum();
    }
}

