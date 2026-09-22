
package com.t1a.sfmc.activity.beans.sfmc.model.rest.journey;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "backgroundColor",
    "icon",
    "category",
    "iconSmall",
    "original_icon",
    "original_iconSmall",
    "isConfigured"
})
@Generated("jsonschema2pojo")
public class MetaData__1 {

    @JsonProperty("backgroundColor")
    private String backgroundColor;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("category")
    private String category;
    @JsonProperty("iconSmall")
    private String iconSmall;
    @JsonProperty("original_icon")
    private String originalIcon;
    @JsonProperty("original_iconSmall")
    private String originalIconSmall;
    @JsonProperty("isConfigured")
    private Boolean isConfigured;

    @JsonProperty("backgroundColor")
    public String getBackgroundColor() {
        return backgroundColor;
    }

    @JsonProperty("backgroundColor")
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("iconSmall")
    public String getIconSmall() {
        return iconSmall;
    }

    @JsonProperty("iconSmall")
    public void setIconSmall(String iconSmall) {
        this.iconSmall = iconSmall;
    }

    @JsonProperty("original_icon")
    public String getOriginalIcon() {
        return originalIcon;
    }

    @JsonProperty("original_icon")
    public void setOriginalIcon(String originalIcon) {
        this.originalIcon = originalIcon;
    }

    @JsonProperty("original_iconSmall")
    public String getOriginalIconSmall() {
        return originalIconSmall;
    }

    @JsonProperty("original_iconSmall")
    public void setOriginalIconSmall(String originalIconSmall) {
        this.originalIconSmall = originalIconSmall;
    }

    @JsonProperty("isConfigured")
    public Boolean getIsConfigured() {
        return isConfigured;
    }

    @JsonProperty("isConfigured")
    public void setIsConfigured(Boolean isConfigured) {
        this.isConfigured = isConfigured;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MetaData__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("backgroundColor");
        sb.append('=');
        sb.append(((this.backgroundColor == null)?"<null>":this.backgroundColor));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null)?"<null>":this.icon));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("iconSmall");
        sb.append('=');
        sb.append(((this.iconSmall == null)?"<null>":this.iconSmall));
        sb.append(',');
        sb.append("originalIcon");
        sb.append('=');
        sb.append(((this.originalIcon == null)?"<null>":this.originalIcon));
        sb.append(',');
        sb.append("originalIconSmall");
        sb.append('=');
        sb.append(((this.originalIconSmall == null)?"<null>":this.originalIconSmall));
        sb.append(',');
        sb.append("isConfigured");
        sb.append('=');
        sb.append(((this.isConfigured == null)?"<null>":this.isConfigured));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
