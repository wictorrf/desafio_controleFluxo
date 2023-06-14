public class ParametrosInvalidosException extends Exception {
    private int parametroUm;
    private int parametroDois;

    public ParametrosInvalidosException(int parametroUm, int parametroDois){
        super("O segundo parâmetro deve ser maior que o primeiro");
        this.parametroUm = parametroUm;
        this.parametroDois = parametroDois;
    }
}
