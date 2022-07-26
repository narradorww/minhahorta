package br.com.balaiorural.minhahorta;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class HortaController {

    @Autowired
    private VegetalRepository repositorio;

    @GetMapping("/vegetais")
    public List<Vegetal> getVegetable() {
        List<Vegetal> vegetais = repositorio.findAll();
        return vegetais;
    }
    
    @PostMapping("/vegetais")
    public Vegetal postVegetable(@RequestBody Vegetal vegetal) {
        Vegetal vegetalSalvo = repositorio.save(vegetal);
        return vegetalSalvo;
    }


    @PatchMapping("/vegetais/{id}")
    public Vegetal updateVegetable(@PathVariable("id") String id, @RequestBody Vegetal request){
            return repositorio.findById(id)
            .map(obj -> {
                obj.setTitle(request.getTitle());
                obj.setDescription(request.getDescription());
                obj.setImageURL(request.getImageUrl());
                obj.setPlantingTimeSSE(request.getPlantingTimeSSE());
                obj.setPlantingTimeONNE(request.getPlantingTimeONNE());
                obj.setMinTemperature(request.getMinTemperature());
                obj.setMinTemperature(request.getMaxTemperature());
                obj.setOcupationX(request.getOcupationX());
                obj.setOcupationY(request.getOcupationY());
                obj.setOcupationZ(request.getOcupationZ());
                obj.setSeedsperWeight(request.getSeedsperWeight());
                obj.setPlantsperHectare(request.getPlantsperHectare());
                return repositorio.save(obj);
        })
        .orElseGet(() -> {
        return new Vegetal();
        });
    }


    @DeleteMapping("/vegetais/{id}")
    public String deleteVegetable(@PathVariable ("id") String id) {
        String message;
        try{
            repositorio.deleteById(id);
            message = "Vegetal deletado com sucesso";
        }catch(Exception e){
            message = "Erro ao deletar Vegetal";
        }
        return message;
    }


    

}
