import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ConversorDeDivisas {
    public static void main(String[] args) {
        // Definir tasas de cambio (a modo de ejemplo)
        double tasaDolar = 20.0;
        double tasaEuro = 23.5;
        double tasaLibraEsterlina = 27.8;
        double tasaYenJapones = 0.18;
        double tasaWonSurcoreano = 0.017;

        // Crear un arreglo de cadenas para las opciones de divisa y dirección de conversión
        String[] opcionesDivisa = {"MXN a Dólares", "MXN a Euros", "MXN a Libras Esterlinas", "MXN a Yen Japonés", "MXN a Won Surcoreano", "Dólares a MXN", "Euros a MXN", "Libras Esterlinas a MXN", "Yen Japonés a MXN", "Won Surcoreano a MXN"};

        // Crear un panel con un JComboBox para que el usuario seleccione la conversión
        JPanel panel = new JPanel();
        JComboBox<String> conversionBox = new JComboBox<>(opcionesDivisa);
        panel.add(conversionBox);

        // Mostrar un diálogo con el JComboBox
        int opcion = JOptionPane.showConfirmDialog(null, panel, "Seleccione la conversión", JOptionPane.OK_CANCEL_OPTION);

        // Obtener la cantidad a convertir
        String input = JOptionPane.showInputDialog("Introduce la cantidad:");
        double cantidad = Double.parseDouble(input);

        // Realizar la conversión según la selección del usuario
        if (opcion == JOptionPane.OK_OPTION) {
            String seleccion = (String) conversionBox.getSelectedItem();
            double resultado = 0.0;

            if (seleccion.equals("MXN a Dólares")) {
                resultado = cantidad / tasaDolar;
            } else if (seleccion.equals("MXN a Euros")) {
                resultado = cantidad / tasaEuro;
            } else if (seleccion.equals("MXN a Libras Esterlinas")) {
                resultado = cantidad / tasaLibraEsterlina;
            } else if (seleccion.equals("MXN a Yen Japonés")) {
                resultado = cantidad / tasaYenJapones;
            } else if (seleccion.equals("MXN a Won Surcoreano")) {
                resultado = cantidad / tasaWonSurcoreano;
            } else if (seleccion.equals("Dólares a MXN")) {
                resultado = cantidad * tasaDolar;
            } else if (seleccion.equals("Euros a MXN")) {
                resultado = cantidad * tasaEuro;
            } else if (seleccion.equals("Libras Esterlinas a MXN")) {
                resultado = cantidad * tasaLibraEsterlina;
            } else if (seleccion.equals("Yen Japonés a MXN")) {
                resultado = cantidad * tasaYenJapones;
            } else if (seleccion.equals("Won Surcoreano a MXN")) {
                resultado = cantidad * tasaWonSurcoreano;
            }

            // Mostrar el resultado en una ventana de diálogo
            String mensaje = String.format("%.2f %s equivale a %.2f %s", cantidad, seleccion.substring(4), resultado, seleccion.substring(0, 3));
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
