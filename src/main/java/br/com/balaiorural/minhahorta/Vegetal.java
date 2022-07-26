package br.com.balaiorural.minhahorta;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vegetais")
public class Vegetal {

    @Id
    private String id;
    private String title;
    private String description;
    private String imageUrl;
    private String plantingTimeSSE;
    private String plantingTimeONNE;
    private Number minTemperature;
    private Number maxTemperature;
    private Number ocupationX;
    private Number ocupationY;
    private Number ocupationZ;
    private Number timeHarvest;
    private Number seedsperWeight;
    private Number plantsperhectare;


    public Vegetal() {
        
    }

    public Vegetal(String title, String description, String imageUrl, String string,
            String string2, Number minTemperature, Number maxTemperature, Number ocupationX,
            Number ocupationY, Number ocupationZ,  Number timeHarvest, Number seedsperWeight, Number plantsperhectare) {
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.plantingTimeSSE = string;
        this.plantingTimeONNE = string2;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.ocupationX = ocupationX;
        this.ocupationY = ocupationY;
        this.ocupationZ = ocupationZ;
        this.timeHarvest = timeHarvest;
        this.seedsperWeight = seedsperWeight;
        this.plantsperhectare = plantsperhectare;
    }


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getPlantingTimeSSE() {
        return plantingTimeSSE;
    }

    public String getPlantingTimeONNE() {
        return plantingTimeONNE;
    }

    public Number getMinTemperature() {
        return minTemperature;
    }

    public Number getMaxTemperature() {
        return maxTemperature;
    }

    public Number getOcupationX() {
        return ocupationX;
    }

    public Number getOcupationY() {
        return ocupationY;
    }

    public Number getOcupationZ() {
        return ocupationZ;
    }

    public Number getTimeHarvest() {
        return timeHarvest;
    }

    public Number getSeedsperWeight() {
        return seedsperWeight;
    }

    public Number getPlantsperHectare() {
        return plantsperhectare;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageURL(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setPlantingTimeSSE(String plantingTimeSSE) {
        this.plantingTimeSSE = plantingTimeSSE;
    }

    public void setMinTemperature(Number minTemperature) {
        this.minTemperature = minTemperature;
    }

    public void setOcupationX(Number ocupationX) {
        this.ocupationX = ocupationX;
    }

    public void setOcupationY(Number ocupationY) {
        this.ocupationY = ocupationY;
    }

    public void setOcupationZ(Number ocupationZ) {
        this.ocupationZ = ocupationZ;
    }

    public void setSeedsperWeight(Number seedsperWeight) {
        this.seedsperWeight = seedsperWeight;
    }

    public void setPlantsperHectare(Number plantsperHectare) {
        this.plantsperhectare = plantsperHectare;
    }

    public void setPlantingTimeONNE(String plantingTimeONNE) {
        this.plantingTimeONNE = plantingTimeONNE;
    }

}
