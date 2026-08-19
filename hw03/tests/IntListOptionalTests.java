import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Arrays;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IntListOptionalTests {
    // TBD
    @Test
    @Order(1)
    public void testSum() {
        IntList p = new IntList(1,new IntList(2,new IntList(3,null)));
        assertThat(p.sum()).isEqualTo(6);

        IntList L = new IntList(4,new IntList(2,new IntList(7,new IntList(3,null))));
        assertThat(L.sum()).isEqualTo(16);
    }

    @Test
    @Order(2)
    public void testAddLast() {
        IntList p = new IntList(1,new IntList(2,new IntList(3,null)));
        IntList np = new IntList(1,new IntList(2,new IntList(3,new IntList(4,null))));
        p.addLast(4);
        for (int i = 0; i < p.size(); i++){
            assertThat(p.first).isEqualTo(np.first);
            p = p.rest;
            np = np.rest;
        }
    }

    @Test
    @Order(3)
    public void testAddFirst() {
        IntList p = new IntList(2,new IntList(3,new IntList(4,null)));
        IntList np = new IntList(1,new IntList(2,new IntList(3,new IntList(4,null))));
        p.addFirst(1);
        for (int i = 0; i < p.size(); i++){
            assertThat(p.first).isEqualTo(np.first);
            p = p.rest;
            np = np.rest;
        }
    }
}
