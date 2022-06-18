package com.ya;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {
    private final String name;
    private final boolean expected;

    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] checkNameToEmbossDifferentValue() {
        return new Object[][]{
                {"name surname", true},
                {"namesurname", false},
                {" name surname", false},
                {"name surname ", false},
                {"na", false},
                {"nnnnnnnnnnnnnnnnnnnn", false},
                {"name  surname", false},
                {null, false},
                {"namenamename surnam", true},
                {"N A", true},
                {"   ", false}
        };
    }

    @Test
    @DisplayName("Check the name with different parameters")
    @Description("Check how checkNameToEmboss works with 1.correct string,2. string without space," +
            "3. string with space before name, 4. String with space after surname, " +
            "5. String with too small name, 6. string with too long name, 7.string with double space," +
            "8. \'Null\' instead of string, 9. string with max available length," +
            "10. string with min available length, 11. string with three spaces"
    )
    public void checkNameToEmbossReturnsCorrectValues() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }
}
