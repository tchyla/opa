/*package pl.tchyla.opa.services;

import pl.tchyla.opa.interfaces.ContractValidatorInterface;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContractValidatorService implements ConstraintValidator<ContractValidatorInterface, String> {

    private String contr1;
    private String contr2;

    @Override
    public void initialize(ContractValidatorInterface constraintAnnotation){
        this.contr1 = constraintAnnotation.contract1();
        this.contr2 = constraintAnnotation.contract2();
    }

    @Override
    public boolean isValid(String contract1, String contract2, ConstraintValidatorContext context){
        return contract1.equalsIgnoreCase(contr1) && contract2.equalsIgnoreCase(contr2);
    }
}*/
