import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Function {
    public static long countUnderageFun(Collection<Person> persons) {
        return persons.stream()
                .filter(person -> person.getAge() < 18)
                .count();
    }

    public static List<String> listRecruitsFun(Collection<Person> persons) {
        return persons.stream()
                .filter(person -> person.getAge() >= 18)
                .filter(person -> person.getAge() <= 27)
                .map(Person::getFamily)
                .collect(Collectors.toList());
    }

    public static List<Person> collectWokersFun(Collection<Person> persons) {
        return persons.stream()
                .filter(person -> person.getAge() > 18 && person.getEducation() == Education.HIGHER)
                .filter(person -> (person.getSex() == Sex.WOMAN && person.getAge() <= 65) ||
                        (person.getSex() == Sex.MAN && person.getAge() <= 60))
                .sorted(Comparator.comparing(Person::getFamily))
                .collect(Collectors.toList());
    }
}
