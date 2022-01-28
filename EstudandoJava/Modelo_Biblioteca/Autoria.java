package Modelo_Biblioteca;

public class Autoria {
    private boolean eEditor;

    public Autoria(boolean eEditor) {
        this.eEditor = eEditor;
    }

    public boolean iseEditor() {
        return eEditor;
    }

    public void seteEditor(boolean eEditor) {
        this.eEditor = eEditor;
    }
}
