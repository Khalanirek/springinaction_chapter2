package training.springinaction_chapter2.tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class Order {
    @NotBlank(message="Name is mandatory.")
    private String name;
    @NotBlank(message="City is mandatory.")
    private String city;
    @NotBlank(message="Street is mandatory.")
    private String street;
    @NotBlank(message="State is mandatory.")
    private String state;
    @NotBlank(message="Zip is mandatory.")
    private String zip;
    @CreditCardNumber(message="It is not valid card number.")
    private String ccNumber;
    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message = "Value must be in format MM/RR.")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "No valid code CVV.")
    private String ccCVV;
}
