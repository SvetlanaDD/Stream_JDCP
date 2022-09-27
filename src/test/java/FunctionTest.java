import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@DisplayName("Тестирование: Function")
class FunctionTest {


    @ParameterizedTest
    @MethodSource("getArguments1")
    void countUnderageFun(Collection<Person> persons) {
        Assertions.assertEquals(2,Function.countUnderageFun(persons));
    }

    @ParameterizedTest
    @MethodSource("getArguments2")
    void listRecruitsFun(Collection<Person> persons, List<Person> recruits) {
        Assertions.assertEquals(recruits,Function.listRecruitsFun(persons));
    }

    @ParameterizedTest
    @MethodSource("getArguments3")
    void collectWokersFun(Collection<Person> persons, List<Person> wokers) {
        Assertions.assertEquals(wokers,Function.collectWokersFun(persons));
    }

    private static Arguments getArguments1() {

        Collection<Person> persons = new ArrayList<>();
        persons.add(new Person ("Alex", "Evans", 20, Sex.MAN, Education.HIGHER));
        persons.add(new Person ("Tom", "Rasl", 26, Sex.MAN, Education.HIGHER));
        persons.add(new Person ("Laura", "Troy", 16, Sex.WOMAN, Education.SECONDARY));
        persons.add(new Person ("Eduard", "List", 6, Sex.MAN, Education.ELEMENTARY));
        persons.add(new Person ("Denis", "Dud", 50, Sex.MAN, Education.HIGHER));

        return Arguments.of(persons);
    }

    private static Arguments getArguments2() {

        Collection<Person> persons = new ArrayList<>();
        persons.add(new Person ("Alex", "Evans", 20, Sex.MAN, Education.HIGHER));
        persons.add(new Person ("Tom", "Rasl", 26, Sex.MAN, Education.HIGHER));
        persons.add(new Person ("Laura", "Troy", 16, Sex.WOMAN, Education.SECONDARY));
        persons.add(new Person ("Denis", "Dud", 50, Sex.MAN, Education.HIGHER));

        List<Person> recruits = new ArrayList<>();
        recruits.add(new Person ("Alex", "Evans", 20, Sex.MAN, Education.HIGHER));
        recruits.add(new Person ("Tom", "Rasl", 26, Sex.MAN, Education.HIGHER));
        return Arguments.of(persons, recruits);
    }

    private static Arguments getArguments3() {

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
        return Arguments.of(persons, wokers);
    }
}