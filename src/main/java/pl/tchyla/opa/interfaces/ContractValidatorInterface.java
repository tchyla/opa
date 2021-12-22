/*package pl.tchyla.opa.interfaces;

import pl.tchyla.opa.services.ContractValidatorService;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = ContractValidatorService.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public interface ContractValidatorInterface extends Annotation {
    String contract1();
    String contract2();
    String message() default "{contractValidator.error.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}*/
