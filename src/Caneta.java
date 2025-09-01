public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public void Status()
    {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada ? " + this.tampada);

    }

    public void Rabiscar()
    {
        if(this.tampada == true)
        {
            System.out.println("ERRO! Não posso rabiscar. ");

        }
        else
        {
            System.out.println("Estou Rabiscando");
        }
    }

    public void Tampar()
    {
        this.tampada = true;

    }

    public void Destampar()
    {
        this.tampada = false;
    }



}
