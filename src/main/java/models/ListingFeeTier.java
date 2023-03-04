package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListingFeeTier {
    @JsonProperty("MinimumTierPrice")
    private Integer minimumTierPrice;
    @JsonProperty("FixedFee")
    private Double fixedFee;
}
