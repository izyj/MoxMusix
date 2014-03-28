package Classes;

import java.io.Serializable;

/**
 *
 * @author iisiramen
 */
public class Indice implements Serializable {


    private String definition;

    public Indice(String definition) {
        this.definition = definition;
    }



    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

   

    

}
