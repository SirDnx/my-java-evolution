import com.mjv.ContaCorrente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContaCorrenteDepositoTeste {

    @DisplayName("Testando o método depositar da conta corrente")
    @Test
    void testGet() {

        Double expectativa = 200d;
        ContaCorrente c = new ContaCorrente();
        c.depositar(200d);
        Double resultado = c.getSaldo();
        Assertions.assertEquals(expectativa, resultado);
    }

}
