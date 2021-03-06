package training.springinaction_chapter2.tacos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {

    @NotNull
    @Size(min=5, message="Name must contain at least 5 characters")
    private String name;
    @Size(min=1, message="You have to choose at least 1 ingredient")
    private List<String> ingredients;
}
