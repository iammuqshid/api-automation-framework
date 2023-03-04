package models;

import api.response.ResponseBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseModel extends ResponseBase {

    @JsonProperty("CategoryId")
    private Long categoryId;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Path")
    private String path;
    @JsonProperty("CanListAuctions")
    private Boolean canListAuctions;
    @JsonProperty("CanListClassifieds")
    private Boolean canListClassifieds;
    @JsonProperty("CanRelist")
    private Boolean canRelist;
    @JsonProperty("LegalNotice")
    private String legalNotice;
    @JsonProperty("DefaultDuration")
    private Integer defaultDuration;
    @JsonProperty("AllowedDurations")
    private List<Integer> allowedDurations;
    @JsonProperty("Fees")
    private Fees fees;
    @JsonProperty("FreePhotoCount")
    private Integer freePhotoCount;
    @JsonProperty("MaximumPhotoCount")
    private Integer maximumPhotoCount;
    @JsonProperty("IsFreeToRelist")
    private Boolean isFreeToRelist;
    @JsonProperty("Promotions")
    private List<Promotion> promotions;
    @JsonProperty("EmbeddedContentOptions")
    private List<Object> embeddedContentOptions;
    @JsonProperty("MaximumTitleLength")
    private Integer maximumTitleLength;
    @JsonProperty("AreaOfBusiness")
    private Integer areaOfBusiness;
    @JsonProperty("DefaultRelistDuration")
    private Integer defaultRelistDuration;
    @JsonProperty("CanUseCounterOffers")
    private Boolean canUseCounterOffers;
}

