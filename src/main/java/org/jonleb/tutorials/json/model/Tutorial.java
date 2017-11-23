package org.jonleb.tutorials.json.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jonathan on 30/10/17.
 */
// @JsonIgnoreProperties(ignoreUnknown = true)
public class Tutorial {

    public int id = 0;
    public String name = "Json Mapper Tutorial";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
