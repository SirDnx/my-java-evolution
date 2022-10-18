import com.mjv.Cliente;
import com.mjv.Conta;
import com.validations.SaldoInsuficienteException;
import com.validations.ValorInvalidoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContaDepositoTeste {

    @DisplayName("Testando a atualização do saldo da conta através de depósito")
    @Test
    void testGet() throws ValorInvalidoException{
        double expectativa = 500d;
        Cliente cliente0 = new Cliente("José","12457936403","1145403");
        Conta jose = new Conta(cliente0);
        jose.depositar(500);
        double resultado = jose.getSaldo();
        Assertions.assertEquals(expectativa, resultado);
    }

}

class ContaSaqueTeste{
    @DisplayName("Testando a atualização do saldo da conta através de saque")
    @Test
    void testGet() throws SaldoInsuficienteException, ValorInvalidoException {
        double expectativa = 200d;
        Cliente cliente1 = new Cliente("Marcos", "12335612802", "9966621" );
        Conta marcos = new Conta(cliente1);
        marcos.depositar(500d);
        marcos.sacar(300);
    }
}

