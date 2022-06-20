import java.text.DecimalFormat;

public class FuncoesConversores {
	
	private String parametroTemperatura;
	private String moeda;
	private double valor;
	private double valorConvertido;
	private String menssagem;

	public FuncoesConversores(double valor, String moeda, String parametroTemperatura) {

		this.valor = valor;
		this.moeda = moeda;
		this.parametroTemperatura = parametroTemperatura;
	}
	
	public String ConverteMoeda() {

		switch (moeda) {

		case "de Reais a Dólar":
			valorConvertido = this.valor / 5.05;
			menssagem = "O valor da conversão é de R$ " + new DecimalFormat(".##").format(valorConvertido);
			break;

		case "de Reais a Euro":
			valorConvertido = this.valor / 5.31;
			menssagem = "O valor da conversão é de R$ " + new DecimalFormat(".##").format(valorConvertido);
			break;

		case "de Reais a Libras Esterlinas":
			valorConvertido = this.valor / 6.23;
			menssagem = "O valor da conversão é de R$ " + new DecimalFormat(".##").format(valorConvertido);
			break;

		case "de Reais a Peso argentino":
			valorConvertido = this.valor / 0.041;
			menssagem = "O valor da conversão é de R$ " + new DecimalFormat(".##").format(valorConvertido);
			break;

		case "de Reais a Peso Chileno":
			valorConvertido = this.valor / 0.0058;
			menssagem = "O valor da conversão é de R$ " + new DecimalFormat(".##").format(valorConvertido);
			break;

		case "de Dólar a Reais":
			valorConvertido = this.valor * 5.05;
			menssagem = "O valor da conversão é de US $ " + new DecimalFormat(".##").format(valorConvertido);
			break;

		case "de Euro a Reais":
			valorConvertido = this.valor * 5.31;
			menssagem = "O valor da conversão é de € " + new DecimalFormat(".##").format(valorConvertido);
			break;
		case "de Libras Esterlinas a Reais":
			valorConvertido = this.valor * 6.23;
			menssagem = "O valor da conversão é de £ " + new DecimalFormat(".##").format(valorConvertido);
			break;

		case "de Peso argentino a  Reais":
			valorConvertido = this.valor * 0.041;
			menssagem = "O valor da conversão é de $ " + new DecimalFormat(".##").format(valorConvertido);
			break;

		case "de Peso Chileno a Reais":
			menssagem = "O valor da conversão é de CLP$ " + new DecimalFormat(".##").format(valorConvertido);
			valorConvertido = this.valor * 0.0058;
			break;

		}

		return menssagem;

	}
	
	public String ConverteTemperatura() {
		
		switch (parametroTemperatura) {
			
		case "de graus celsius para fahrenheit":
			valorConvertido = (this.valor * 1.8) + 32;
			menssagem = "A temperatura em fahrenheit é: " + new DecimalFormat(".##").format(valorConvertido);
			break;

		case "de fahrenheit para graus celsius":
			valorConvertido = ((this.valor - 32) * 5) / 9;
			menssagem = "A temperatura em graus celsius é: " + new DecimalFormat(".##").format(valorConvertido);
			break;
		}
		
		return menssagem;
	}
}
