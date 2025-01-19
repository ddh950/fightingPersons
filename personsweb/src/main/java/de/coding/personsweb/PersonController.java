package de.coding.personsweb;

import de.coding.personsweb.model.Person;
import de.coding.personsweb.model.Ability;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    private static final Ability[] abilities = {
            new Ability("boxing", "boxing to the head"),
            new Ability("low kick", "kicks low"),
            new Ability("high kick", "kicks to the head")
    };

    private static Person[] persons = new Person[]{
            new Person("Fighter1", abilities),
            new Person("Fighter2", abilities),
            null,
            null,
            null
    };

    @GetMapping("/persons")
    public String getPersons(
            Model model
    ) {
        model.addAttribute("person", persons);
        return "persons";
    }

    @GetMapping("/persons/{id}")
    public String getPerson(
            Model model,
            @PathVariable String id
    ) {
        Person person = null;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null && persons[i].getId().equals(id)) {
                person = persons[i];
                break;
            }
        }

        model.addAttribute("person", person);
        return "person";
    }

    @GetMapping("/persons/create")
    public String createSuperhero() {
        return "createPerson";
    }

    @PostMapping("/persons/create")
    public String submitPerson(
            Model model,
            String personName,
            String ability1Name,
            String ability1Description,
            String ability2Name,
            String ability2Description,
            String ability3Name,
            String ability3Description
    ) {

        Person createdPerson = new Person(personName, new Ability[]{
                new Ability(ability1Name, ability1Description),
                new Ability(ability2Name, ability2Description),
                new Ability(ability3Name, ability3Description)
        });

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null) {
                persons[i] = createdPersons;
                break;
            }
        }

        return getPersons(model);
    }

}
