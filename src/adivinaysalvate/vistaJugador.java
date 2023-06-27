package adivinaysalvate;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.*;

public class vistaJugador extends JFrame implements ActionListener {

    public ImageIcon imm[];
    public String mensaje[] = new String[11];
    public int rang;
    public int error;
    public String restau[];
    private JButton boton[] = new JButton[27];
    private JButton boton1, boton2, botonIniciar;
    private JButton botonPista;
    public JTextPane textp;
    private int nivelActual = 0;
    private int pistasUtilizadas = 3;
    private JLabel nivelLabel, pistaLabel, developerLabel;
    private JTextArea descripcionTextArea, introTextArea;

    String textoIntro = "El objetivo del juego es adivinar la palabra oculta relacionada con la programación antes de que se complete el dibujo del ahorcado.\n\n"
            + "Cada vez que ingreses una letra incorrecta, se irá dibujando una parte del ahorcado."
            + "Puedes utilizar las pistas para obtener ayuda en caso de que te quedes atascado, pero ten en cuenta que solo tienes 3 pistas disponibles.\n\n"
            + "¡Buena suerte y que te diviertas!";

    public vistaJugador() {
        setLayout(null);
        imm = new ImageIcon[6];

        Font font1 = new Font("Century Gothic", Font.BOLD, 20);

        boton1 = new JButton();
        boton1.setBounds(540, 160, 360, 460);
        boton1.setBorderPainted(false);
        boton1.setContentAreaFilled(false);
        add(boton1);

        textp = new JTextPane();
        textp.setBounds(90, 50, 300, 60);
        this.textp.setOpaque(true);
        textp.setText("B I E N V E N I D @");
        textp.setBackground(Color.GREEN);
        textp.setFont(font1);
        this.add(textp);

        introTextArea = new JTextArea(textoIntro);
        introTextArea.setBounds(30, 123, 420, 140);
        introTextArea.setLineWrap(true);
        introTextArea.setWrapStyleWord(true);
        introTextArea.setEditable(false);
        introTextArea.setVisible(true);
        add(introTextArea);

        nivelLabel = new JLabel("");
        nivelLabel.setBounds(90, 20, 200, 30);
        nivelLabel.setFont(font1);
        add(nivelLabel);
        
//        developerLabel = new JLabel("Desarrollado por Alexander Herrera");
//        developerLabel.setBounds(65, 625, 400, 30);
//        developerLabel.setFont(font1);
//        add(developerLabel);

        pistaLabel = new JLabel("Pistas restantes: " + pistasUtilizadas);
        pistaLabel.setBounds(115, 193, 250, 70);
        pistaLabel.setVisible(false);
        add(pistaLabel);

        descripcionTextArea = new JTextArea();
        descripcionTextArea.setBounds(540, 30, 360, 120);
        descripcionTextArea.setFont(font1);
        descripcionTextArea.setLineWrap(true);
        descripcionTextArea.setWrapStyleWord(true);
        descripcionTextArea.setEditable(false);
        add(descripcionTextArea);

        botonIniciar = new JButton("Iniciar juego");
        botonIniciar.setBounds(115, 270, 250, 70);
        add(botonIniciar);
        botonIniciar.setFont(font1);
        botonIniciar.setBackground(Color.green);
        botonIniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nivelActual = 0;
                pistasUtilizadas = 3;
                iniciar();
            }
        });

        botonPista = new JButton("Pista");
        botonPista.setBounds(115, 150, 250, 70);
        add(botonPista);
        botonPista.setFont(font1);
        botonPista.setBackground(Color.YELLOW);
        botonPista.addActionListener(this);
        botonPista.setVisible(false);

        boton[1] = new JButton("A");
        boton[1].setBounds(30, 380, 50, 50);
        add(boton[1]);
        boton[1].setBackground(Color.BLACK);
        boton[1].setForeground(Color.white);

        boton[2] = new JButton("B");
        boton[2].setBounds(90, 380, 50, 50);
        add(boton[2]);
        boton[2].setBackground(Color.BLACK);
        boton[2].setForeground(Color.white);

        boton[3] = new JButton("C");
        boton[3].setBounds(150, 380, 50, 50);
        add(boton[3]);
        boton[3].setBackground(Color.BLACK);
        boton[3].setForeground(Color.white);

        boton[4] = new JButton("D");
        boton[4].setBounds(210, 380, 50, 50);
        add(boton[4]);
        boton[4].setBackground(Color.BLACK);
        boton[4].setForeground(Color.white);

        boton[5] = new JButton("E");
        boton[5].setBounds(270, 380, 50, 50);
        add(boton[5]);
        boton[5].setBackground(Color.BLACK);
        boton[5].setForeground(Color.white);

        boton[6] = new JButton("F");
        boton[6].setBounds(330, 380, 50, 50);
        add(boton[6]);
        boton[6].setBackground(Color.BLACK);
        boton[6].setForeground(Color.white);

        boton[7] = new JButton("G");
        boton[7].setBounds(390, 380, 50, 50);
        add(boton[7]);
        boton[7].setBackground(Color.BLACK);
        boton[7].setForeground(Color.white);

        boton[8] = new JButton("H");
        boton[8].setBounds(30, 440, 50, 50);
        add(boton[8]);
        boton[8].setBackground(Color.BLACK);
        boton[8].setForeground(Color.white);

        boton[9] = new JButton("I");
        boton[9].setBounds(90, 440, 50, 50);
        add(boton[9]);
        boton[9].setBackground(Color.BLACK);
        boton[9].setForeground(Color.white);

        boton[10] = new JButton("J");
        boton[10].setBounds(150, 440, 50, 50);
        add(boton[10]);
        boton[10].setBackground(Color.BLACK);
        boton[10].setForeground(Color.white);

        boton[11] = new JButton("K");
        boton[11].setBounds(210, 440, 50, 50);
        add(boton[11]);
        boton[11].setBackground(Color.BLACK);
        boton[11].setForeground(Color.white);

        boton[12] = new JButton("L");
        boton[12].setBounds(270, 440, 50, 50);
        add(boton[12]);
        boton[12].setBackground(Color.BLACK);
        boton[12].setForeground(Color.white);

        boton[13] = new JButton("M");
        boton[13].setBounds(330, 440, 50, 50);
        add(boton[13]);
        boton[13].setBackground(Color.BLACK);
        boton[13].setForeground(Color.white);

        boton[14] = new JButton("N");
        boton[14].setBounds(390, 440, 50, 50);
        add(boton[14]);
        boton[14].setBackground(Color.BLACK);
        boton[14].setForeground(Color.white);

        boton[15] = new JButton("O");
        boton[15].setBounds(30, 500, 50, 50);
        add(boton[15]);
        boton[15].setBackground(Color.BLACK);
        boton[15].setForeground(Color.white);

        boton[16] = new JButton("P");
        boton[16].setBounds(90, 500, 50, 50);
        add(boton[16]);
        boton[16].setBackground(Color.BLACK);
        boton[16].setForeground(Color.white);

        boton[17] = new JButton("Q");
        boton[17].setBounds(150, 500, 50, 50);
        add(boton[17]);
        boton[17].setBackground(Color.BLACK);
        boton[17].setForeground(Color.white);

        boton[18] = new JButton("R");
        boton[18].setBounds(210, 500, 50, 50);
        add(boton[18]);
        boton[18].setBackground(Color.BLACK);
        boton[18].setForeground(Color.white);

        boton[19] = new JButton("S");
        boton[19].setBounds(270, 500, 50, 50);
        add(boton[19]);
        boton[19].setBackground(Color.BLACK);
        boton[19].setForeground(Color.white);

        boton[20] = new JButton("T");
        boton[20].setBounds(330, 500, 50, 50);
        add(boton[20]);
        boton[20].setBackground(Color.BLACK);
        boton[20].setForeground(Color.white);

        boton[21] = new JButton("U");
        boton[21].setBounds(390, 500, 50, 50);
        add(boton[21]);
        boton[21].setBackground(Color.BLACK);
        boton[21].setForeground(Color.white);

        boton[22] = new JButton("V");
        boton[22].setBounds(90, 560, 50, 50);
        add(boton[22]);
        boton[22].setBackground(Color.BLACK);
        boton[22].setForeground(Color.white);

        boton[23] = new JButton("W");
        boton[23].setBounds(150, 560, 50, 50);
        add(boton[23]);
        boton[23].setBackground(Color.BLACK);
        boton[23].setForeground(Color.white);

        boton[24] = new JButton("X");
        boton[24].setBounds(210, 560, 50, 50);
        add(boton[24]);
        boton[24].setBackground(Color.BLACK);
        boton[24].setForeground(Color.white);

        boton[25] = new JButton("Y");
        boton[25].setBounds(270, 560, 50, 50);
        add(boton[25]);
        boton[25].setBackground(Color.BLACK);
        boton[25].setForeground(Color.white);

        boton[26] = new JButton("Z");
        boton[26].setBounds(330, 560, 50, 50);
        add(boton[26]);
        boton[26].setBackground(Color.BLACK);
        boton[26].setForeground(Color.white);

        mensaje[0] = "Variable".toUpperCase();
        mensaje[1] = "Ciclo".toUpperCase();
        mensaje[2] = "Funcion".toUpperCase();
        mensaje[3] = "Condicion".toUpperCase();
        mensaje[4] = "Clase".toUpperCase();
        mensaje[5] = "Bucle".toUpperCase();
        mensaje[6] = "Metodo".toUpperCase();
        mensaje[7] = "Compilador".toUpperCase();
        mensaje[8] = "Depuracion".toUpperCase();
        mensaje[9] = "Algoritmo".toUpperCase();
        mensaje[10] = "Recursion".toUpperCase();

        for (int i = 1; i < 27; i++) {
            boton[i].setEnabled(false);
        }

        imm[0] = new ImageIcon(getClass().getResource("1.png"));
        imm[1] = new ImageIcon(getClass().getResource("2.png"));
        imm[2] = new ImageIcon(getClass().getResource("3.png"));
        imm[3] = new ImageIcon(getClass().getResource("4.png"));
        imm[4] = new ImageIcon(getClass().getResource("5.png"));
        imm[5] = new ImageIcon(getClass().getResource("6.png"));

        boton1.setIcon(imm[0]);
        cargar();
    }

    public void iniciar() {
        setSize(1000, 700);
        setLocationRelativeTo(null);
        botonPista.setVisible(true);
        botonIniciar.setText("Reiniciar juego");
        botonIniciar.setBackground(Color.red);
        botonIniciar.setBounds(115, 270, 250, 70);
        pistaLabel.setText("Pistas restantes: " + pistasUtilizadas);
        pistaLabel.setVisible(true);
        introTextArea.setVisible(false);

        boton1.setIcon(imm[0]);
        error = 0;
        textp.setText("");

        for (int i = 1; i < 27; i++) {
            boton[i].setEnabled(true);
        }
        rang = (int) 0 + (int) (Math.random() * ((mensaje.length - 1) + 1));
        String pal[] = mensaje[rang].split(" ");
        restau = new String[mensaje[rang].length() + 1];
        int j = 0;
        for (String pall : pal) {
            for (int i = 0; i < pall.length(); i++) {
                textp.setText(textp.getText() + "_ ");
                restau[j++] = "_";
            }
            textp.setText(textp.getText() + "\n");
            restau[j++] = " ";
        }
        nivelActual++;
        nivelLabel.setText("Nivel: " + nivelActual);

        if (mensaje[rang].equals("Variable".toUpperCase())) {
            descripcionTextArea.setText("Un espacio de memoria que almacena valores.");
        } else if (mensaje[rang].equals("Ciclo".toUpperCase())) {
            descripcionTextArea.setText("Una estructura que se repite hasta que se cumple una condición.");
        } else if (mensaje[rang].equals("Funcion".toUpperCase())) {
            descripcionTextArea.setText("Un bloque de código reutilizable que realiza una tarea específica.");
        } else if (mensaje[rang].equals("Condicion".toUpperCase())) {
            descripcionTextArea.setText("Una expresión que se evalúa como verdadera o falsa.");
        } else if (mensaje[rang].equals("Clase".toUpperCase())) {
            descripcionTextArea.setText("Una plantilla que define propiedades y comportamientos de un objeto.");
        } else if (mensaje[rang].equals("Bucle".toUpperCase())) {
            descripcionTextArea.setText("Una estructura que repite un bloque de código varias veces.");
        } else if (mensaje[rang].equals("Metodo".toUpperCase())) {
            descripcionTextArea.setText("Un bloque de código que realiza una tarea específica en una clase.");
        } else if (mensaje[rang].equals("Compilador".toUpperCase())) {
            descripcionTextArea.setText("Un programa que traduce código fuente a un lenguaje de máquina ejecutable.");
        } else if (mensaje[rang].equals("Depuracion".toUpperCase())) {
            descripcionTextArea.setText("El proceso de encontrar y corregir errores en un programa.");
        } else if (mensaje[rang].equals("Algoritmo".toUpperCase())) {
            descripcionTextArea.setText("Un conjunto de pasos ordenados para resolver un problema.");
        } else if (mensaje[rang].equals("Recursion".toUpperCase())) {
            descripcionTextArea.setText("Una técnica donde una función se llama a sí misma.");
        }
    }

    public void checkletters(ActionEvent e) {
        JButton bt = (JButton) e.getSource();
        char c[];
        for (int i = 1; i < 27; i++) {
            if (bt == boton[i]) {
                c = Character.toChars(64 + i);
                boolean flag = false;
                for (int j = 0; j < mensaje[rang].length(); j++) {
                    if (c[0] == mensaje[rang].charAt(j)) {
                        restau[j] = c[0] + "";
                        flag = true;
                    }
                }
                if (flag) {
                    textp.setText("");
                    for (String re : restau) {
                        if (" ".equals(re)) {
                            textp.setText(textp.getText() + "\n");
                        } else {
                            textp.setText(textp.getText() + re + " ");
                        }
                    }
                    boolean usted_gano = true;
                    for (String re : restau) {
                        if (re.equals("_")) {
                            usted_gano = false;
                            break;
                        }
                    }
                    if (usted_gano) {
                        if (nivelActual < 10) {
                            JOptionPane.showMessageDialog(this, "¡Felicitaciones! Has completado la palabra correctamente. Haz clic en \"OK\" para pasar al siguiente nivel.");
                            iniciar();
                            return;
                        } else {
                            for (int j = 1; j < 27; j++) {
                                boton[j].setEnabled(false);
                            }
                            setSize(480, 700);
                            botonPista.setVisible(false);
                            botonIniciar.setText("Iniciar juego");
                            botonIniciar.setBackground(Color.green);
                            nivelLabel.setText("");
                            textp.setText("B I E N V E N I D O");
                            setLocationRelativeTo(null);
                            pistaLabel.setVisible(false);
                            introTextArea.setVisible(true);
                            JOptionPane.showMessageDialog(this, "¡Felicidades! Has completado todos los niveles del juego exitosamente. ¡Eres un experto en programación!");
                        }
                    }
                } else {
                    boton1.setIcon(imm[++error]);
                    if (error == 5) {
                        JOptionPane.showMessageDialog(this, "¡Oh no! Has fallado la palabra. La palabra correcta era: " + mensaje[rang] + ". Sigue intentando, ¡tú puedes!");
                        nivelActual = 0;
                        pistasUtilizadas = 3;
                        iniciar();
                        return;
                    }
                }
                bt.setEnabled(false);
                break;
            }
        }
        // Verificar si se presionó el botón de pista
        if (e.getSource() == botonPista) {
            String pista = obtenerPistaPalabraEnJuego();
            // Mostrar la pista en un cuadro de diálogo
            JOptionPane.showMessageDialog(this, pista);
        }
    }

    public void cargar() {
        for (int i = 1; i < 27; i++) {
            boton[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    checkletters(e);
                }
            });
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton2) {
            iniciar();
        } else if (e.getSource() == botonPista) {
            mostrarPista();
        }
    }

    public void mostrarPista() {
        String pista = obtenerPistaPalabraEnJuego();
        pistaLabel.setText("Pistas restantes: " + pistasUtilizadas);
        if (pista != "") {
            JOptionPane.showMessageDialog(this, pista, "Pista", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String obtenerPistaPalabraEnJuego() {
        String pista = ""; // Variable para almacenar la pista correspondiente

        // Obtener la palabra en juego
        String palabraEnJuego = mensaje[rang];
        if (pistasUtilizadas <= 0) {
            JOptionPane.showMessageDialog(this, "Ya has utilizado todas las pistas disponibles.");
            return "";
        }
        pistasUtilizadas--;

        // Buscar la pista correspondiente a la palabra en juego
        if (palabraEnJuego.equals("Variable".toUpperCase())) {
            pista = "Cambia su contenido durante la ejecución del programa.";
        } else if (palabraEnJuego.equals("Ciclo".toUpperCase())) {
            pista = "Permite realizar tareas de forma repetitiva.";
        } else if (palabraEnJuego.equals("Funcion".toUpperCase())) {
            pista = "Puede recibir argumentos y devolver un valor.";
        } else if (palabraEnJuego.equals("Condicion".toUpperCase())) {
            pista = "Determina qué partes del código se ejecutarán.";
        } else if (palabraEnJuego.equals("Clase".toUpperCase())) {
            pista = "Sirve como base para crear múltiples instancias.";
        } else if (palabraEnJuego.equals("Bucle".toUpperCase())) {
            pista = "Utilizado para procesar listas o realizar operaciones iterativas.";
        } else if (palabraEnJuego.equals("Metodo".toUpperCase())) {
            pista = "Puede ser llamado y reutilizado en diferentes partes del programa.";
        } else if (palabraEnJuego.equals("Compilador".toUpperCase())) {
            pista = "Detecta errores y genera archivos ejecutables.";
        } else if (palabraEnJuego.equals("Depuracion".toUpperCase())) {
            pista = "Puede implicar el uso de herramientas como breakpoints y mensajes de registro.";
        } else if (palabraEnJuego.equals("Algoritmo".toUpperCase())) {
            pista = "Define la lógica y el flujo de un programa.";
        } else if (palabraEnJuego.equals("Recursion".toUpperCase())) {
            pista = "Puede utilizarse para resolver problemas mediante la subdivisión en casos más pequeños.";
        }

        return pista;
    }

    public static void main(String[] args) {
        vistaJugador vj = new vistaJugador();
        vj.setBounds(0, 0, 480, 700);
        vj.setVisible(true);
        vj.setTitle("Adivina y Salvate");
        vj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vj.getContentPane().setBackground(Color.WHITE);
        vj.setResizable(false);
        vj.setLocationRelativeTo(null);
    }
}
