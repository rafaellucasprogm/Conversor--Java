
import javax.swing.JOptionPane;

public class CaixaDeDialogo {

	public static void main(String[] args) {

		String inputValor = null;

		Conversor(inputValor);

	}

	public static String menuPrincipal() {

		String[] opcoes = { "Conversor de Moedas", "Conversor de Temperatura" };

		String escolhaDeConversor = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

		return escolhaDeConversor;
	}

	public static String MostraListaDeMoedas() {

		String[] opcoesMoedas = {

				"de Reais a Dólar", "de Reais a Euro", "de Reais a Libras Esterlinas", "de Reais a Peso argentino",
				"de Reais a Peso Chileno", "de Dólar a Reais", "de Euro a Reais", "de Libras Esterlinas a Reais",
				"de Peso argentino a  Reais", "de Peso Chileno a Reais" };

		String pergunta = "Escolha a moeda para a qual você dejesa girar seu dinheiro";

		String listaOpcoesDeMoedas = (String) JOptionPane.showInputDialog(null, pergunta, "Moedas",
				JOptionPane.QUESTION_MESSAGE, null, opcoesMoedas, opcoesMoedas[0]);

		return listaOpcoesDeMoedas;

	}

	public static String MostraListaDeTemperatura() {

		String[] opcoesTemperatura = {

				"de graus celsius para fahrenheit", "de fahrenheit para graus celsius",

		};

		String pergunta = "Escolha a unidade de medida de conversão";

		String listaOpcoesTemperatura = (String) JOptionPane.showInputDialog(null, pergunta, "Temperatura",
				JOptionPane.QUESTION_MESSAGE, null, opcoesTemperatura, opcoesTemperatura[0]);

		return listaOpcoesTemperatura;
	}

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static int ConversorDeMoedas(String inputValor, String escolhaDeConversor) {

		inputValor = JOptionPane.showInputDialog(escolhaDeConversor, null);

		if (!isNumeric(inputValor)) {
			int aviso = JOptionPane.showConfirmDialog(null, "Caracter inválido, escolha um número", "Aviso",
					JOptionPane.YES_NO_OPTION);

			if (aviso == 1)
				return 0;

		} else {

			double inputNumero = Double.parseDouble(inputValor);
			String MoedaEscolhida = MostraListaDeMoedas();

			FuncoesConversores converte = new FuncoesConversores(inputNumero, MoedaEscolhida, null);
			String valorConvertido = converte.ConverteMoeda();

			JOptionPane.showMessageDialog(null, valorConvertido);

			int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Aviso",
					JOptionPane.YES_NO_OPTION);

			if (continuar == 1) {

				JOptionPane.showMessageDialog(null, "Programa finalizado");
				return 0;
			}

		}

		return 1;
	}

	public static int ConversorDeTemperatura(String inputValor, String escolhaDeConversor) {

		inputValor = JOptionPane.showInputDialog(escolhaDeConversor, null);

		if (!isNumeric(inputValor)) {
			int aviso = JOptionPane.showConfirmDialog(null, "Caracter inválido, escolha um número", "Aviso",
					JOptionPane.YES_NO_OPTION);

			if (aviso == 1)
				return 0;

		} else {

			double inputNumero = Double.parseDouble(inputValor);
			String temperaturaEscolhida = MostraListaDeTemperatura();

			FuncoesConversores converte = new FuncoesConversores(inputNumero, null, temperaturaEscolhida);
			String valorConvertido = converte.ConverteTemperatura();

			JOptionPane.showMessageDialog(null, valorConvertido);

			int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Aviso",
					JOptionPane.YES_NO_OPTION);

			if (continuar == 1) {

				JOptionPane.showMessageDialog(null, "Programa finalizado");
				return 0;
			}
		}

		return 1;
	}

	public static void Conversor(String inputValor) {

		while (true) {

			String escolhaDeConversor = menuPrincipal();

			if (escolhaDeConversor == null)
				break;

			if (escolhaDeConversor == "Conversor de Temperatura") {

				int temperatura = ConversorDeTemperatura(inputValor, escolhaDeConversor);
				if (temperatura == 0) {
					break;
				}
			}

			if (escolhaDeConversor == "Conversor de Moedas") {

				int moeda = ConversorDeMoedas(inputValor, escolhaDeConversor);
				if (moeda == 0) {
					break;
				}
			}

		}

	}
}
