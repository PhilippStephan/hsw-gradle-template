package hsw.gradle.application;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IBANTest {
    @Test void IBANDE() {
        String myIBAN = "DE68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertTrue(classUnderTest.check(myIBAN));
    }

    @Test void IBANIT() {
        String myIBAN = "IT68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertFalse(classUnderTest.check(myIBAN));
    }

    @Test void IBANWrong() {
        String myIBAN = "ZZ68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertFalse(classUnderTest.check(myIBAN));
    }

    @Test void test_getKontoNummer(){
        String myIBAN = "DE68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        String kontonummer = "12345678";
        assertEquals(kontonummer, classUnderTest.getKontoNummer());
    }

    @Test void test_getBLZ(){
        String myIBAN = "DE68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        String blz = "2105017";
        assertEquals(blz, classUnderTest.getBLZ());
    }
}