package jogomonstro;

public class Monstrinho {

    int saude;
    int energia;
    int forca;
    int moedas;

    //Construtor da classe Monstrinho
    //Os atributos do Monstrinho iniciam com valor 5
    public Monstrinho() {
        this.saude = 5;
        this.energia = 5;
        this.forca = 5;
        this.moedas = 5;

    }
    
        /* public void passarTurno() {
        System.out.println("Seu monstrinho est� ficando velho!");
        //A classe GeradorDeNumeros � utilizada para gerar um n�mero aleat�rio
        //entre 0 e 2 para ser reduzido dos atributos do Monstrinho
        this.saude -= GeradorDeNumeros.gerar();
        this.energia -= GeradorDeNumeros.gerar();
        this.forca -= GeradorDeNumeros.gerar();
        if(GeradorDeNumeros.gerar() > 0){
            System.out.println("Houve uma crise economica");
            this.moedas -= GeradorDeNumeros.gerar();
        }
        
        
    }*/

    public void aplicarAcao(Acao acao) {
        //Ao aplicar uma A��o no monstrinho, seus atributos aumentam
        //de acordo com os atributos da a��o empregada
        this.saude += acao.getSaude();
        this.forca += acao.getForca();
        this.energia += acao.getEnergia();
        this.moedas += acao.getMoedas();
    }

    public boolean estaVivo() {
        //Este m�todo retorna verdadeiro quando todos os atributos do
        //Monstrinho forem maiores que zero. Caso um dos atributos seja
        //menor ou igual a zero este m�todo retorna falso.
        return (this.saude > 0 && this.energia > 0 && this.forca > 0);
    }

    public void status() {
        //Este m�todo imprime os valores dos atributos do Monstrinho
        System.out.println("Dados do monstrinho:");
        System.out.println("Saúde -> " + this.saude);
        System.out.println("Energia -> " + this.energia);
        System.out.println("Força -> " + this.forca);
        System.out.println("Moedas -> " + this.moedas);
    }

}
