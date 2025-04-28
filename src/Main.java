//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Obtendo a primeira instância da fila de impressão
        Fila fila1 = Fila.getInstancia();

        // Obtendo a segunda instância da fila de impressão
        Fila fila2 = Fila.getInstancia();

        // Imprimindo os endereços das instâncias para verificar se são iguais
        System.out.println("Endereço da instância 1: " + fila1);
        System.out.println("Endereço da instância 2: " + fila2);

        // Chamando métodos para simular o comportamento da fila
        fila1.imprimeDocumento();
        fila2.removeDocumento();
        fila1.removeTodosDocumentos();

        // Verificando se as instâncias são de fato iguais
        if (fila1 == fila2) {
            System.out.println("As instâncias são iguais, o padrão Singleton está funcionando.");
        } else {
            System.out.println("As instâncias são diferentes, há um erro no padrão Singleton.");
        }
    }
}