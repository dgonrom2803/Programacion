package Tema9Prog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiListener implements ActionListener {
    MiComponenteAWT componente;

    public MiListener(MiComponenteAWT componente){
        this.componente = componente;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        componente.dispose();
    }
}
