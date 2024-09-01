package youssef.com.petclinic.businesslayer;


import org.apache.el.parser.ParseException;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
import youssef.com.petclinic.models.PetType;
import youssef.com.petclinic.services.PetTypeService;

import java.util.Collection;
import java.util.Locale;

@Component
public class PetTypeFormatter implements Formatter<PetType> {

    private final PetTypeService petTypeService;

    public PetTypeFormatter(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @Override
    public String print(PetType petType, Locale locale) {
        return petType.getName();
    }

    @Override
    public PetType parse(String text, Locale locale) {
        Collection<PetType> findPetTypes = petTypeService.findAll();

        for (PetType type : findPetTypes) {
            if (type.getName().equals(text)) {
                return type;
            }
        }

        return null;
    }
}
