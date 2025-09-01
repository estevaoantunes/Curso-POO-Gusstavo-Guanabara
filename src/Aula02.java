//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Aula02 {
    public static void main(String[] args) {

    Caneta c1 = new Caneta();
    c1.cor = "Azul";
    c1.ponta = 0.5f;
    c1.carga = 80;
    c1.Tampar();
    c1.Rabiscar();
    c1.Status();

    Caneta c2 = new Caneta();
    c2.modelo = "Hostnet";
    c2.cor = "Vermelho";
    c2.ponta = 10.0f;
    c2.carga = 50;
    c2.Status();
    c2.Destampar();
    c2.Rabiscar();
    }
}