package com.ya;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import io.qameta.allure.junit4.DisplayName;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class AccountTest {
   private final String name;
   private final boolean expected;
   public AccountTest(String name, boolean expected) {
      this.name = name;
      this.expected = expected;
   }
   @Parameterized.Parameters // добавили аннотацию
   public static Object[][] checkNameToEmbossDifferentValue() {
      return new Object[][] {
              { "name surname", true},
              { "namesurname", false},
              { " namesurname", false},
              { "namesurname ", false},
              { "na", false},
              { "nnnnnnnnnnnnnnnnnnnn", false},
              { "namesu  rname", false},
      };
   }
   @Test
   @DisplayName("Check the name with different parameters")
   public void checkNameToEmbossReturnsCorrectValues() {
      Account account = new Account(name);
      boolean actual = account.checkNameToEmboss();
      assertEquals(expected,actual);
   }
}
