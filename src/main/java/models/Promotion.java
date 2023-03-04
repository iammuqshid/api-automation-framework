package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Promotion {
    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Price")
    private Double price;
    @JsonProperty("OriginalPrice")
    private Double originalPrice;
    @JsonProperty("Recommended")
    private Boolean recommended;
    @JsonProperty("MinimumPhotoCount")
    private Integer minimumPhotoCount;
}
