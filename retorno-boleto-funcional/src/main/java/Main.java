
import com.david.retorno.boleto.ProcessarBoletos;
import java.io.File;
import java.net.URL;
import java.nio.file.Path;

/**
 *
 * @author David
 */
public class Main {

    public static void main(String[] args) {

        URL url = Main.class.getClassLoader().getResource("bradesco-1.csv");
        Path scriptPath = new File(url.getPath()).toPath();
        String nomeArquivo = scriptPath.toString();

        ProcessarBoletos processador = new ProcessarBoletos(ProcessarBoletos::lerBradesco);

        processador.processar(nomeArquivo);
    }
}
