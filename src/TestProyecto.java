
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author felip
 */
public class TestProyecto extends JFrame {
    
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem opcion1;
    private JMenuItem opcion2;
    private JMenuItem opcion3;
    private JMenuItem opcion11;
    private JMenuItem opcion12;
    private JMenuItem opcion13;
    private JMenuItem opcion14;
    private JMenuItem opcion15;
    private JMenuItem opcion16;
    private JMenuItem opcion17;
    private JMenuItem opcion18;
    private JMenuItem opcion19;
    private JMenuItem opcion20;
    private JMenuItem opcion21;
    private JMenuItem opcion22;
    private JMenuItem opcion23;
    private JMenuItem opcion24;
    private JMenuItem opcion25;
    private JMenuItem opciont1;
    private JMenuItem opciont2;
    private JMenuItem opciont3;
    private JMenuItem opciont4;
    private JMenuItem opciont5;
    private JMenuItem opciont6;
    private boolean ventanaMonedasAbierta = false;
    private boolean ventanaTemperaturasAbierta = false;

    /**
     * @param args the command line arguments
     */
    public TestProyecto() {

        setSize(300, 200);
        setTitle("App Conversor");
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        mostrarmenuPrincipal();
        panel.add(menuBar);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mostrarmenuPrincipal() {

        menuBar = new JMenuBar();
        menu = new JMenu("¿Qué tipo de conversión desea elegir? :  ");
        opcion1 = new JMenuItem("1.- Conversion de monedas");
        opcion2 = new JMenuItem("2.- Conversión de temperaturas");
        opcion3 = new JMenuItem("3.- Salir");

        menu.add(opcion1);
        menu.add(opcion2);
        menu.add(opcion3);

        menuBar.add(menu);

        opcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!ventanaMonedasAbierta) {
                    JFrame ventanaMonedas = new JFrame();
                    ventanaMonedas.setSize(300, 200);
                    ventanaMonedas.setTitle("Conversor de Monedas");
                    ventanaMonedas.setVisible(true);
                    ventanaMonedas.setLocationRelativeTo(null);

                    JPanel panel = new JPanel();
                    mostrarMenu();
                    panel.add(menuBar);
                    add(panel);
                    ventanaMonedas.add(panel);

                    ventanaMonedas.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                            ventanaMonedasAbierta = false;
                            setVisible(true);

                        }
                    });

                    ventanaMonedasAbierta = true;
                }

            }
        });
        opcion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!ventanaTemperaturasAbierta) {
                    JFrame ventanaTemperaturas = new JFrame();
                    ventanaTemperaturas.setSize(300, 200);
                    ventanaTemperaturas.setTitle("Conversor de Temperaturas");
                    ventanaTemperaturas.setVisible(true);
                    ventanaTemperaturas.setLocationRelativeTo(null);

                    JPanel panel = new JPanel();
                    mostrarTemperaturas();
                    panel.add(menuBar);
                    add(panel);
                    ventanaTemperaturas.add(panel);

                    ventanaTemperaturas.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                            ventanaTemperaturasAbierta = false;
                            setVisible(true);
//                            setVisible(true); // Muestra la ventana principal nuevamente
//                            ventanaTemperaturas.dispose(); // Cierra la ventana secundaria
                        }
                    });
                    ventanaTemperaturasAbierta = true;
                }

            }
        });
        opcion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc3EXIT();

            }
        });

    }

    public void mostrarMenu() {

        menuBar = new JMenuBar();
        menu = new JMenu("Eliga una conversión :   ");
        opcion11 = new JMenuItem("1.- México -> EU");
        opcion12 = new JMenuItem("2.- México -> China");
        opcion13 = new JMenuItem("3.- México -> España");
        opcion14 = new JMenuItem("4.- México -> Dolar canadiense");
        opcion15 = new JMenuItem("5.- México -> Yen Japones");
        opcion16 = new JMenuItem("6.- México -> Franco Suizo");
        opcion17 = new JMenuItem("7.- México -> Rublo Ruso");
        opcion18 = new JMenuItem("8.- México -> Dolar Singapurense");
        opcion19 = new JMenuItem("9.- México -> Peso Filipino ");
        opcion20 = new JMenuItem("10.- México -> Real Brasileño ");
        opcion21 = new JMenuItem("11.- EU -> Mexico");
        opcion22 = new JMenuItem("12.- China -> Mexico");
        opcion23 = new JMenuItem("13.-España ->Mexico");
        opcion24 = new JMenuItem("14.-Dolar canadiense -> Mexico");
        opcion25 = new JMenuItem("15.-Yen Japones -> Mexico");

        menu.add(opcion11);
        menu.add(opcion12);
        menu.add(opcion13);
        menu.add(opcion14);
        menu.add(opcion15);
        menu.add(opcion16);
        menu.add(opcion17);
        menu.add(opcion18);
        menu.add(opcion19);
        menu.add(opcion20);
        menu.add(opcion21);
        menu.add(opcion22);
        menu.add(opcion23);
        menu.add(opcion24);
        menu.add(opcion25);

        menuBar.add(menu);

        opcion11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc11();

            }
        });
        opcion12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc12();

            }
        });
        opcion13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc13();

            }
        });
        opcion14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc14();

            }
        });
        opcion15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc15();

            }
        });
        opcion16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc16();

            }
        });
        opcion17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc17();

            }
        });
        opcion18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc18();

            }
        });
        opcion19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc19();

            }
        });
        opcion20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc20();

            }
        });
        opcion21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc21();

            }
        });
        opcion22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc22();

            }
        });
        opcion23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc23();

            }
        });
        opcion24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc24();

            }
        });
        opcion25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MetodosProyecto conver1 = new MetodosProyecto();
                conver1.opc25();

            }
        });

    }

    public void mostrarTemperaturas() {
        menuBar = new JMenuBar();
        menu = new JMenu("Eliga una conversión :   ");
        opciont1 = new JMenuItem("1.- Celsius -> Fahrenheit");
        opciont2 = new JMenuItem("2.- Fahrenheit -> Celsius");
        opciont3 = new JMenuItem("3.- Celsius -> Kelvin");
        opciont4 = new JMenuItem("4.- Kelvin -> Celsius");
        opciont5 = new JMenuItem("5.- Fahrenheit -> Kelvin");
        opciont6 = new JMenuItem("6.- Kelvin -> Fahrenheit");

        menu.add(opciont1);
        menu.add(opciont2);
        menu.add(opciont3);
        menu.add(opciont4);
        menu.add(opciont5);
        menu.add(opciont6);

        menuBar.add(menu);

        opciont1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MetodosProyecto metodos = new MetodosProyecto();
                metodos.opct1();
            }
        });
        opciont2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MetodosProyecto metodos = new MetodosProyecto();
                metodos.opct2();
            }
        });
        opciont3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MetodosProyecto metodos = new MetodosProyecto();
                metodos.opct3();
            }
        });
        opciont4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MetodosProyecto metodos = new MetodosProyecto();
                metodos.opct4();
            }
        });
        opciont5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MetodosProyecto metodos = new MetodosProyecto();
                metodos.opct5();
            }
        });
        opciont6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MetodosProyecto metodos = new MetodosProyecto();
                metodos.opct6();
            }
        });

    }

    public static void main(String[] args) {

        TestProyecto s = new TestProyecto();

        s.setVisible(true);

    }
}
