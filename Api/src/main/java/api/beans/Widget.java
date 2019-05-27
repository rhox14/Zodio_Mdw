
package api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for Widget
 * <p>
 * A very simple, generic data type.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "description"
})
public class Widget {

    /**
     * The name of the widget.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the widget.")
    private String name;
    /**
     * The description of the widget.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the widget.")
    private String description;

    /**
     * The name of the widget.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the widget.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The description of the widget.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * The description of the widget.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

}
