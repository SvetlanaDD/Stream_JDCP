import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@DisplayName("Тестирование: Function")
class FunctionTest {

@Test
    void countUnderageFun() {
        Collection<Person> persons = new ArrayList<>();
        persons.add(new Person ("Alex", "Evans", 20, Sex.MAN, Education.HIGHER));
        persons.add(new Person ("Tom", "Rasl", 26, Sex.MAN, Education.HIGHER));
        persons.add(new Person ("Laura", "Troy", 16, Sex.WOMAN, Education.SECONDARY));
        persons.add(new Person ("Eduard", "List", 6, Sex.MAN, Education.ELEMENTARY));
        persons.add(new Person ("Denis", "Dud", 50, Sex.MAN, Education.HIGHER));

        Assertions.assertEquals(2,Function.countUnderageFun(persons));
    }

    @Test
    void listRecruitsFun() {
        Collection<Person> persons = new ArrayList<>();
        persons.add(new Person ("Alex", "Evans", 20, Sex.MAN, Education.HIGHER));
        persons.add(new Person ("Tom", "Rasl", 26, Sex.MAN, Education.HIGHER));
        persons.add(new Person ("Laura", "Troy", 16, Sex.WOMAN, Education.SECONDARY));
        persons.add(new Person ("Denis", "Dud", 50, Sex.MAN, Education.HIGHER));

        List<String> recruits = List.of("Evans", "Rasl");

        Assertions.assertEquals(recruits,Function.listRecruitsFun(persons));
    }

    @Test
    void collectWokersFun() {
        Collection<Person> persons = new ArrayList<>();
        persons.add(new Person ("Alex", "Evans", 20, Sex.MAN, Education.HIGHER));
        persons.add(new Person ("Tom", "Rasl", 26, Sex.MAN, Education.HIGHER));
        persons.add(new Person ("Laura", "Troy", 16, Sex.WOMAN, Education.SECONDARY));
        persons.add(new Person ("Eduard", "List", 6, Sex.MAN, Education.ELEMENTARY));
        persons.add(new Person ("Denis", "Dud", 50, Sex.MAN, Education.HIGHER));

        List<Person> wokers = new ArrayList<>();
        wokers.add(new Person ("Denis", "Dud", 50, Sex.MAN, Education.HIGHER));
        wokers.add(new Person ("Alex", "Evans", 20, Sex.MAN, Education.HIGHER));
        wokers.add(new Person ("Tom", "Rasl", 26, Sex.MAN, Education.HIGHER));

        Assertions.assertEquals(wokers.toString(),Function.collectWokersFun(persons).toString());
    }

}