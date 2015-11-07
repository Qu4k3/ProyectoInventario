package InterfaceProyecto;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class InterfaceProyecto {

    private final static String ListarPanel = "Listar";
    private final static String CrearPanel = "Crear";
    private final static String ModificarPanel = "Modificar";
    private final static String BorrarPanel = "Borrar";

    static JRadioButton Femenino, Masculino;

    public static void main(String[] args) {

        createAndShowGUI();

    }

    private static void addComponentsToPane(Container pane) {

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel cardListarPanel = new JPanel();
        JPanel cardCrearPanel = new JPanel();
        JPanel cardModificarPanel = new JPanel();
        JPanel cardBorrarPanel = new JPanel();

        tabbedPane.addTab(ListarPanel, cardListarPanel);
        tabbedPane.addTab(CrearPanel, cardCrearPanel);
        tabbedPane.addTab(ModificarPanel, cardModificarPanel);
        tabbedPane.addTab(BorrarPanel, cardBorrarPanel);

        JPanel GridBag = new JPanel();
        GridBag.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JPanel gridBagSuperior = new JPanel();
        gridBagSuperior.setLayout(new GridBagLayout());

        JLabel label1 = new JLabel("Nombre");
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1; //resizing behaviour
        c.fill = GridBagConstraints.HORIZONTAL; //resizing behaviour
        gridBagSuperior.add(label1, c);

        JTextField text1 = new JTextField("", 10);
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1; //resizing behaviour
        c.fill = GridBagConstraints.HORIZONTAL; //resizing behaviour
        gridBagSuperior.add(text1, c);

        JLabel label2 = new JLabel("Código");
        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 1; //resizing behaviour
        c.fill = GridBagConstraints.HORIZONTAL; //resizing behaviour
        gridBagSuperior.add(label2, c);

        JTextField text2 = new JTextField("", 10);
        c.gridx = 3;
        c.gridy = 0;
        c.gridwidth = 1; //resizing behaviour
        c.fill = GridBagConstraints.HORIZONTAL; //resizing behaviour
        gridBagSuperior.add(text2, c);

        gridBagSuperior.add(label1);
        gridBagSuperior.add(text1);

        gridBagSuperior.add(label2);
        gridBagSuperior.add(text2);

        GridBag.add(gridBagSuperior);

        JPanel FlowSexo = new JPanel();
        FlowSexo.setLayout(new FlowLayout());

        JLabel label3 = new JLabel("Sexo");
        Femenino = new JRadioButton("Femenino");
        Masculino = new JRadioButton("Masculino");
        Femenino.setSelected(true);
        ButtonGroup group = new ButtonGroup();
        group.add(Femenino);
        group.add(Masculino);

        FlowSexo.add(label3);
        FlowSexo.add(Femenino);
        FlowSexo.add(Masculino);

        GridBag.add(FlowSexo, FlowLayout.CENTER);

        JPanel GridBagInferior = new JPanel();

        JLabel label4 = new JLabel("Stock");
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1; //resizing behaviour
        c.fill = GridBagConstraints.HORIZONTAL; //resizing behaviour
        GridBagInferior.add(label4, c);

        JTextField text4 = new JTextField("", 10);
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1; //resizing behaviour
        c.fill = GridBagConstraints.HORIZONTAL; //resizing behaviour
        GridBagInferior.add(text4, c);

        
        cardCrearPanel.add(GridBag, BorderLayout.CENTER);
        pane.add(tabbedPane, BorderLayout.PAGE_START);

    }

    private static void createAndShowGUI() {

        JFrame frame = new JFrame("Inventario Deportivo");
        addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
