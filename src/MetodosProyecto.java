
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.CANCEL_OPTION;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author felip
 */
public class MetodosProyecto {

    public void opc11() {
        TestProyecto menu = new TestProyecto();
        JFrame ventana11 = new JFrame();
        String input = JOptionPane.showInputDialog(ventana11, "Ingrese una cantidad: ", "Conversión: Moneda MXN -> USD", JOptionPane.PLAIN_MESSAGE);

        try {

            if (input != null | !input.isEmpty()) {

                double mxn = Double.parseDouble(input);
                double usd = mxn * 0.059311419;

                JOptionPane.showMessageDialog(null, +mxn + " pesos mexicanos equivalen a: " + usd + " dolares americanos.", "Resultado: Moneda MXN -> USD", JOptionPane.INFORMATION_MESSAGE);
                int seleccionar = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicación? ", "Resultado:  Moneda MXN -> USD ", JOptionPane.YES_NO_CANCEL_OPTION);

                if (seleccionar == YES_OPTION) {

                    menu.mostrarMenu();

                }
                if (seleccionar == NO_OPTION) {

                    JFrame exit = new JFrame();
                    exit.setSize(300, 200);

                    JLabel saliendo = new JLabel("Saliendo del programa...");
                    exit.add(saliendo);

                    exit.setLocationRelativeTo(null);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            System.exit(0);

                        }
                    });

                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(saliendo);
                    exit.setVisible(true);
                    time.setRepeats(false);
                    time.start();

                }

                if (seleccionar == CANCEL_OPTION) {

                    menu.mostrarMenu();

                }

            }

        } catch (NumberFormatException | NullPointerException e) {

            JOptionPane.showMessageDialog(null, "Ingrese otra cantidad válida", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void opc12() {

        TestProyecto menu = new TestProyecto();
        JFrame ventana11 = new JFrame();
        String input = JOptionPane.showInputDialog(ventana11, "Ingrese una cantidad: ", "Conversión: Moneda MXN -> CNY", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double mxn = Double.parseDouble(input);
                double cny = mxn * 0.42519;

                JOptionPane.showMessageDialog(null, +mxn + " pesos mexicanos equivalen a: " + cny + " yuan renminbi chinos.", "Resultado: Moneda MXN -> CNY", JOptionPane.INFORMATION_MESSAGE);
                int seleccionar = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicación? ", "Resultado ", JOptionPane.YES_NO_CANCEL_OPTION);

                if (seleccionar == YES_OPTION) {

                    menu.mostrarMenu();

                }
                if (seleccionar == NO_OPTION) {

                    JFrame exit = new JFrame();
                    exit.setSize(300, 200);

                    JLabel saliendo = new JLabel("Saliendo del programa...");
                    exit.add(saliendo);

                    exit.setLocationRelativeTo(null);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            System.exit(0);

                        }
                    });

                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(saliendo);
                    exit.setVisible(true);
                    time.setRepeats(false);
                    time.start();

                }

                if (seleccionar == CANCEL_OPTION) {

                    menu.mostrarMenu();

                }

            }

        } catch (NumberFormatException | NullPointerException e) {

            JOptionPane.showMessageDialog(null, "Ingrese otra cantidad válida", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void opc13() {

        TestProyecto menu = new TestProyecto();
        JFrame ventana11 = new JFrame();
        String input = JOptionPane.showInputDialog(ventana11, "Ingrese una cantidad: ", "Conversión: Moneda MXN -> EUR", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double mxn = Double.parseDouble(input);
                double eur = mxn * 0.05398;

                JOptionPane.showMessageDialog(null, +mxn + " pesos mexicanos equivalen a: " + eur + " euros.", "Resultado: Moneda MXN -> EUR", JOptionPane.INFORMATION_MESSAGE);
                int seleccionar = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicación? ", "Resultado ", JOptionPane.YES_NO_CANCEL_OPTION);

                if (seleccionar == YES_OPTION) {

                    menu.mostrarMenu();

                }
                if (seleccionar == NO_OPTION) {

                    JFrame exit = new JFrame();
                    exit.setSize(300, 200);

                    JLabel saliendo = new JLabel("Saliendo del programa...");
                    exit.add(saliendo);

                    exit.setLocationRelativeTo(null);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            System.exit(0);

                        }
                    });

                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(saliendo);
                    exit.setVisible(true);
                    time.setRepeats(false);
                    time.start();

                }

                if (seleccionar == CANCEL_OPTION) {

                    menu.mostrarMenu();

                }

            }

        } catch (NumberFormatException | NullPointerException e) {

            JOptionPane.showMessageDialog(null, "Ingrese otra cantidad válida", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void opc14() {

        TestProyecto menu = new TestProyecto();
        JFrame ventana11 = new JFrame();
        String input = JOptionPane.showInputDialog(ventana11, "Ingrese una cantidad: ", "Conversión: Moneda MXN -> CAD", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double mxn = Double.parseDouble(input);
                double cad = mxn * 0.07839;

                JOptionPane.showMessageDialog(null, +mxn + " pesos mexicanos equivalen a: " + cad + " dolares canadienses.", "Resultado: Moneda MXN -> CAD", JOptionPane.INFORMATION_MESSAGE);
                int seleccionar = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicación? ", "Resultado ", JOptionPane.YES_NO_CANCEL_OPTION);

                if (seleccionar == YES_OPTION) {

                    menu.mostrarMenu();

                }
                if (seleccionar == NO_OPTION) {

                    JFrame exit = new JFrame();
                    exit.setSize(300, 200);

                    JLabel saliendo = new JLabel("Saliendo del programa...");
                    exit.add(saliendo);

                    exit.setLocationRelativeTo(null);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            System.exit(0);

                        }
                    });

                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(saliendo);
                    exit.setVisible(true);
                    time.setRepeats(false);
                    time.start();

                }

                if (seleccionar == CANCEL_OPTION) {

                    menu.mostrarMenu();

                }

            }

        } catch (NumberFormatException | NullPointerException e) {

            JOptionPane.showMessageDialog(null, "Ingrese otra cantidad válida", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void opc15() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingresa una cantidad: ", "Conversión Moneda: MXN -> JPY", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double mxn = Double.parseDouble(input);
                double jpy = mxn * 8.4582;

                JOptionPane.showMessageDialog(null, mxn + " pesos mexicanos, equivalen a " + jpy + " yen japones.", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicacion?", "Aviso", JOptionPane.YES_NO_CANCEL_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarMenu();
                }
                if (aviso == NO_OPTION) {

                    JFrame exit = new JFrame();
                    exit.setSize(300, 200);
                    exit.setVisible(true);

                    JLabel label = new JLabel("Saliendo del programa...");
                    exit.add(label);

                    exit.setLocationRelativeTo(null);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(label);
                    time.setRepeats(false);
                    time.start();

                }

                if (aviso == CANCEL_OPTION) {

                    menu.mostrarMenu();
                }
            }

        } catch (NumberFormatException | NullPointerException ex) {

            JOptionPane.showMessageDialog(frame, "Introduzca una cantidad valida", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void opc16() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingresa una cantidad: ", "Conversión Moneda: MXN -> CHF", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double mxn = Double.parseDouble(input);
                double chf = mxn * 0.05214;

                JOptionPane.showMessageDialog(null, mxn + " pesos mexicanos, equivalen a " + chf + " francos suizos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicacion?", "Aviso", JOptionPane.YES_NO_CANCEL_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarMenu();
                }
                if (aviso == NO_OPTION) {

                    JFrame exit = new JFrame();
                    exit.setSize(300, 200);
                    exit.setVisible(true);

                    JLabel label = new JLabel("Saliendo del programa...");
                    exit.add(label);

                    exit.setLocationRelativeTo(null);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(label);
                    time.setRepeats(false);
                    time.start();

                }

                if (aviso == CANCEL_OPTION) {

                    menu.mostrarMenu();
                }
            }

        } catch (NumberFormatException | NullPointerException ex) {

            JOptionPane.showMessageDialog(frame, "Introduzca una cantidad valida", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void opc17() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingresa una cantidad: ", "Conversión Moneda: MXN -> RUB", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double mxn = Double.parseDouble(input);
                double rub = mxn * 5.457;

                JOptionPane.showMessageDialog(null, mxn + " pesos mexicanos, equivalen a " + rub + " rublos rusos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicacion?", "Aviso", JOptionPane.YES_NO_CANCEL_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarMenu();
                }
                if (aviso == NO_OPTION) {

                    JFrame exit = new JFrame();
                    exit.setSize(300, 200);
                    exit.setVisible(true);

                    JLabel label = new JLabel("Saliendo del programa...");
                    exit.add(label);

                    exit.setLocationRelativeTo(null);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(label);
                    time.setRepeats(false);
                    time.start();

                }

                if (aviso == CANCEL_OPTION) {

                    menu.mostrarMenu();
                }
            }

        } catch (NumberFormatException | NullPointerException ex) {

            JOptionPane.showMessageDialog(frame, "Introduzca una cantidad valida", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void opc18() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingresa una cantidad: ", "Conversión Moneda: MXN -> SGD", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double mxn = Double.parseDouble(input);
                double sgd = mxn * 0.079756;

                JOptionPane.showMessageDialog(null, mxn + " pesos mexicanos, equivalen a " + sgd + " dolares singapurenses.", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicacion?", "Aviso", JOptionPane.YES_NO_CANCEL_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarMenu();
                }
                if (aviso == NO_OPTION) {

                    JFrame exit = new JFrame();
                    exit.setSize(300, 200);
                    exit.setVisible(true);

                    JLabel label = new JLabel("Saliendo del programa...");
                    exit.add(label);

                    exit.setLocationRelativeTo(null);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(label);
                    time.setRepeats(false);
                    time.start();

                }

                if (aviso == CANCEL_OPTION) {

                    menu.mostrarMenu();
                }
            }

        } catch (NumberFormatException | NullPointerException ex) {

            JOptionPane.showMessageDialog(frame, "Introduzca una cantidad valida", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void opc19() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingresa una cantidad: ", "Conversión Moneda: MXN -> PHP", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double mxn = Double.parseDouble(input);
                double php = mxn * 3.29035;

                JOptionPane.showMessageDialog(null, mxn + " pesos mexicanos, equivalen a " + php + " pesos filipinos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicacion?", "Aviso", JOptionPane.YES_NO_CANCEL_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarMenu();
                }
                if (aviso == NO_OPTION) {

                    JFrame exit = new JFrame();
                    exit.setSize(300, 200);
                    exit.setVisible(true);

                    JLabel label = new JLabel("Saliendo del programa...");
                    exit.add(label);

                    exit.setLocationRelativeTo(null);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(label);
                    time.setRepeats(false);
                    time.start();

                }

                if (aviso == CANCEL_OPTION) {

                    menu.mostrarMenu();
                }
            }

        } catch (NumberFormatException | NullPointerException ex) {

            JOptionPane.showMessageDialog(frame, "Introduzca una cantidad valida", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void opc20() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingresa una cantidad: ", "Conversión Moneda: MXN -> BRL", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double mxn = Double.parseDouble(input);
                double brl = mxn * 0.2834;

                JOptionPane.showMessageDialog(null, mxn + " pesos mexicanos, equivalen a " + brl + " pesos brasileños.", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicacion?", "Aviso", JOptionPane.YES_NO_CANCEL_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarMenu();
                }
                if (aviso == NO_OPTION) {

                    JFrame exit = new JFrame();
                    exit.setSize(300, 200);
                    exit.setVisible(true);

                    JLabel label = new JLabel("Saliendo del programa...");
                    exit.add(label);

                    exit.setLocationRelativeTo(null);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(label);
                    time.setRepeats(false);
                    time.start();

                }

                if (aviso == CANCEL_OPTION) {

                    menu.mostrarMenu();
                }
            }

        } catch (NumberFormatException | NullPointerException ex) {

            JOptionPane.showMessageDialog(frame, "Introduzca una cantidad valida", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void opc21() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingresa una cantidad: ", "Conversión Moneda: USD -> MXN", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double usd = Double.parseDouble(input);
                double mxn = usd * 16.7044;

                JOptionPane.showMessageDialog(null, usd + " dolares, equivalen a " + mxn + " pesos mexicanos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicacion?", "Aviso", JOptionPane.YES_NO_CANCEL_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarMenu();
                }
                if (aviso == NO_OPTION) {

                    JFrame exit = new JFrame();
                    exit.setSize(300, 200);
                    exit.setVisible(true);

                    JLabel label = new JLabel("Saliendo del programa...");
                    exit.add(label);

                    exit.setLocationRelativeTo(null);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(label);
                    time.setRepeats(false);
                    time.start();

                }

                if (aviso == CANCEL_OPTION) {

                    menu.mostrarMenu();
                }
            }

        } catch (NumberFormatException  | NullPointerException ex) {

            JOptionPane.showMessageDialog(frame, "Introduzca una cantidad valida", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void opc22() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingresa una cantidad: ", "Conversión Moneda: CNY -> MXN", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double cny = Double.parseDouble(input);
                double mxn = cny * 2.34127;

                JOptionPane.showMessageDialog(null, cny + " Yuan renminbi chinos, equivalen a " + mxn + " pesos mexicanos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicacion?", "Aviso", JOptionPane.YES_NO_CANCEL_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarMenu();
                }
                if (aviso == NO_OPTION) {

                    JFrame exit = new JFrame();
                    exit.setSize(300, 200);
                    exit.setVisible(true);

                    JLabel label = new JLabel("Saliendo del programa...");
                    exit.add(label);

                    exit.setLocationRelativeTo(null);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(label);
                    time.setRepeats(false);
                    time.start();

                }

                if (aviso == CANCEL_OPTION) {

                    menu.mostrarMenu();
                }
            }

        } catch (NumberFormatException  | NullPointerException ex) {

            JOptionPane.showMessageDialog(frame, "Introduzca una cantidad valida", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void opc23() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingresa una cantidad: ", "Conversión Moneda: EUR -> MXN", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double eur = Double.parseDouble(input);
                double mxn = eur * 18.4330;

                JOptionPane.showMessageDialog(null, eur + " euros, equivalen a " + mxn + " pesos mexicanos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicacion?", "Aviso", JOptionPane.YES_NO_CANCEL_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarMenu();
                }
                if (aviso == NO_OPTION) {

                    JFrame exit = new JFrame();
                    exit.setSize(300, 200);
                    exit.setVisible(true);

                    JLabel label = new JLabel("Saliendo del programa...");
                    exit.add(label);

                    exit.setLocationRelativeTo(null);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(label);
                    time.setRepeats(false);
                    time.start();

                }

                if (aviso == CANCEL_OPTION) {

                    menu.mostrarMenu();
                }
            }

        } catch (NumberFormatException | NullPointerException ex) {

            JOptionPane.showMessageDialog(frame, "Introduzca una cantidad valida", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void opc24() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingresa una cantidad: ", "Conversión Moneda: CAD -> MXN", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double cad = Double.parseDouble(input);
                double mxn = cad * 12.708774;

                JOptionPane.showMessageDialog(null, cad + " dolares canadienses, equivalen a " + mxn + " pesos mexicanos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicacion?", "Aviso", JOptionPane.YES_NO_CANCEL_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarMenu();
                }
                if (aviso == NO_OPTION) {

                    JFrame exit = new JFrame();
                    exit.setSize(300, 200);
                    exit.setVisible(true);

                    JLabel label = new JLabel("Saliendo del programa...");
                    exit.add(label);

                    exit.setLocationRelativeTo(null);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(label);
                    time.setRepeats(false);
                    time.start();

                }

                if (aviso == CANCEL_OPTION) {

                    menu.mostrarMenu();
                }
            }

        } catch (NumberFormatException | NullPointerException ex) {

            JOptionPane.showMessageDialog(frame, "Introduzca una cantidad valida", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void opc25() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingresa una cantidad: ", "Conversión Moneda: JPY -> MXN", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double jpy = Double.parseDouble(input);
                double mxn = jpy * 0.117635;

                JOptionPane.showMessageDialog(null, jpy + " yen japones, equivalen a " + mxn + " pesos mexicanos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicacion?", "Aviso", JOptionPane.YES_NO_CANCEL_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarMenu();
                }
                if (aviso == NO_OPTION) {

                    JFrame exit = new JFrame();
                    exit.setSize(300, 200);
                    exit.setVisible(true);

                    JLabel label = new JLabel("Saliendo del programa...");
                    exit.add(label);

                    exit.setLocationRelativeTo(null);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(label);
                    time.setRepeats(false);
                    time.start();

                }

                if (aviso == CANCEL_OPTION) {

                    menu.mostrarMenu();
                }
            }

        } catch (NumberFormatException | NullPointerException  ex) {

            JOptionPane.showMessageDialog(frame, "Introduzca una cantidad valida", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void opct1() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingrese una cantidad: ", "Conversión: C° -> F° ", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double celsius = Double.parseDouble(input);
                double f = (celsius * 9 / 5) + 32;
                JOptionPane.showMessageDialog(null, celsius +"°" +" grados Celsius equivale a : " + f +"°"+ " grados Fahrenheit", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicación?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarTemperaturas();
                }
                if (aviso == NO_OPTION) {
                    JFrame exit = new JFrame();
                    exit.setVisible(true);
                    exit.setSize(300, 200);
                    exit.setLocationRelativeTo(null);

                    JLabel ventanaAviso = new JLabel("Saliendo del programa...");
                    exit.add(ventanaAviso);

                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(ventanaAviso);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });

                    time.setRepeats(false);
                    time.start();

                }

            }

        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    public void opct2() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingrese una cantidad: ", "Conversión: F° -> C° ", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double f = Double.parseDouble(input);
                double celsius = (f - 32) * 5 / 9;;
                JOptionPane.showMessageDialog(null, f +"°"+ " grados Fahrenheit equivale a : " + celsius +"°"+ " grados Celsius", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicación?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarTemperaturas();
                }
                if (aviso == NO_OPTION) {
                    JFrame exit = new JFrame();
                    exit.setVisible(true);
                    exit.setSize(300, 200);
                    exit.setLocationRelativeTo(null);

                    JLabel ventanaAviso = new JLabel("Saliendo del programa...");
                    exit.add(ventanaAviso);

                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(ventanaAviso);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });

                    time.setRepeats(false);
                    time.start();

                }

            }

        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    public void opct3() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingrese una cantidad: ", "Conversión: C° -> K° ", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double celsius = Double.parseDouble(input);
                double k = celsius + 273.15;
                JOptionPane.showMessageDialog(null, celsius +"°"+ " grados Celsius equivale a : " + k +"°"+ " grados Kelvin", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicación?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarTemperaturas();
                }
                if (aviso == NO_OPTION) {
                    JFrame exit = new JFrame();
                    exit.setVisible(true);
                    exit.setSize(300, 200);
                    exit.setLocationRelativeTo(null);

                    JLabel ventanaAviso = new JLabel("Saliendo del programa...");
                    exit.add(ventanaAviso);

                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(ventanaAviso);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });

                    time.setRepeats(false);
                    time.start();

                }

            }

        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    
      public void opct4() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingrese una cantidad: ", "Conversión: K° -> C° ", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double kelvin = Double.parseDouble(input);
                double celsius = kelvin - 273.15;
                JOptionPane.showMessageDialog(null, kelvin +"°"+ " grados Kelvin equivale a : " + celsius +"°"+ " grados Celsius", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicación?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarTemperaturas();
                }
                if (aviso == NO_OPTION) {
                    JFrame exit = new JFrame();
                    exit.setVisible(true);
                    exit.setSize(300, 200);
                    exit.setLocationRelativeTo(null);

                    JLabel ventanaAviso = new JLabel("Saliendo del programa...");
                    exit.add(ventanaAviso);

                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(ventanaAviso);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });

                    time.setRepeats(false);
                    time.start();

                }

            }

        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }
       public void opct5() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingrese una cantidad: ", "Conversión: F° -> K° ", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double Fahrenheit = Double.parseDouble(input);
                double kelvin =  (Fahrenheit - 32) * 5/9 + 273.15;
                JOptionPane.showMessageDialog(null, Fahrenheit +"°"+ " grados Fahrenheit equivale a : " + kelvin +"°"+ " grados Kelvin", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicación?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarTemperaturas();
                }
                if (aviso == NO_OPTION) {
                    JFrame exit = new JFrame();
                    exit.setVisible(true);
                    exit.setSize(300, 200);
                    exit.setLocationRelativeTo(null);

                    JLabel ventanaAviso = new JLabel("Saliendo del programa...");
                    exit.add(ventanaAviso);

                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(ventanaAviso);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });

                    time.setRepeats(false);
                    time.start();

                }

            }

        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }
        public void opct6() {
        TestProyecto menu = new TestProyecto();
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingrese una cantidad: ", "Conversión: K° -> F° ", JOptionPane.PLAIN_MESSAGE);
        try {
            if (input != null | !input.isEmpty()) {

                double kelvin = Double.parseDouble(input);
                double Fahrenheit =  (kelvin - 273.15) * 9/5 + 32;
                JOptionPane.showMessageDialog(null, kelvin +"°"+ " grados Kelvin equivale a : " + Fahrenheit +"°"+ " grados Fahrenheit", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                int aviso = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando la aplicación?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (aviso == YES_OPTION) {

                    menu.mostrarTemperaturas();
                }
                if (aviso == NO_OPTION) {
                    JFrame exit = new JFrame();
                    exit.setVisible(true);
                    exit.setSize(300, 200);
                    exit.setLocationRelativeTo(null);

                    JLabel ventanaAviso = new JLabel("Saliendo del programa...");
                    exit.add(ventanaAviso);

                    exit.setLayout(new FlowLayout(FlowLayout.CENTER));
                    exit.add(ventanaAviso);

                    Timer time = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });

                    time.setRepeats(false);
                    time.start();

                }

            }

        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void opc3EXIT() {

        JFrame salir = new JFrame();
        salir.setSize(300, 200);

        JLabel exit = new JLabel("Saliendo del programa");
        salir.add(exit);

        Timer time = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        salir.setLayout(new FlowLayout(FlowLayout.CENTER));
        salir.add(exit);
        time.setRepeats(false);
        time.start();
        salir.setVisible(true);
        salir.setLocationRelativeTo(null);

    }

}
