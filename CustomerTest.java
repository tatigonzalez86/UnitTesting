import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@author Tatiana


class CustomerTest {

    private String Tatiana;

    @Test
    public <Cust>
    void getFirstName() {
        banking.Customer one = new banking.Customer( "tatiana");
        assertEquals(Tatiana, one.getFirstName());
    }
}
