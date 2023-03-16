package Tema6Prog.AlgoritmiaVoraz;

public abstract class AlgoritmoVoraz {

    public void voraz(){
        inicializa();
        while(!fin()) {
            seleccionaYEliminaCandidato();
            if(esPrometedor()){
                anotaEnSolucion();
            }
        }
    }

    protected abstract void anotaEnSolucion();

    protected abstract boolean esPrometedor();

    protected abstract void seleccionaYEliminaCandidato();
    protected abstract void inicializa();

    protected abstract boolean fin();


}
