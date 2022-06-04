	/*
	* To change this license header, choose License Headers in Project Properties.
 	* To change this template file, choose Tools | Templates
 	* and open the template in the editor.
 	*/

	package calculadoraimc_ciclo3;
	
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.text.DecimalFormat;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;
	import java.util.Scanner;

	/**
	*
	* @author doomingoselias
	*/

	public class Main {
    	public static void main(String[] args)
	{
        private JTextField double edita_peso_usuario;
        private JTextField double edita_altura_usuario;
	private JButton botCalculo;
    	private JLabel lblPeso_usuario;
    	private JLabel lblAltura_usuario;
    	private JLabel lblResultado_usuario;

 	public Main(){
        setConfig();
    	}


       private void setConfig() {
       this.setTitle("Calculadora de IMC");
       this.setSize(350, 250);
       this.setLayout(new GridLayout(0, 3));
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setLocationRelativeTo(null);
       this.getContentPane().setBackground(new Color(37, 180, 235));


       editaPeso_usuario=new JTextField();
       editaAltura_usuario=new JTextField();
       botCalculo=new JButton("Calcular");
       lblPeso_usuario=new JLabel("Peso em KG:");
       lblAltura_usuario=new JLabel("Altura em CM:");
       lblResultado_usuario=new JLabel("Resultado ");


       botCalc.addActionListener(new EventoCalculaIMC());

       this.add(lblPeso_usuario);
       this.add(lblAltura_usuario);
       this.add(editaPeso_usuario);
       this.add(editaAltura_usuario);
       this.add(lblResultado_usuario);
       this.add(botCalculo);
       }


       class EventoCalculaIMC implements ActionListener{
           @Override
       public void actionPerformed(ActionEvent) {
            try {

                double peso_usuario=Double.parseDouble(editaPeso_usuario.getText());
                double altura_usuario=Double.parseDouble(editaAltura_usuario.getText());

        double imc=peso/Math.pow(altura,2) * 10000;

        DecimalFormat df=new DecimalFormat("#0.00");

        String resultado="Seu Índice de Massa Corporal é: "+df.format(imc);
	}

        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a sua altura");
        Altura_usuario = leia.nextDouble();
        System.out.println("Informe o seu peso");
        Peso_usuario = leia.nextDouble();
        double imc;
        imc = Peso_usuario / (Altura_usuario*Altura_usuario);

        //tabela IMC: https://pt.wikipedia.org/wiki/%C3%8Dndice_de_massa_corporal

	//De acordo o padrão internacional IMC os resultados apresentados seguirão os seguintes casos
	//Abaixo de 17 Muito abaixo do peso
	//Entre 17 e 18,49 Abaixo do peso
	//Entre 18,50 e 24,99 Peso normal
	//Entre 25 e 29,99 Acima do peso
	//Entre 30 e 34,99 Obesidade I
	//Entre 35 e 39,99 Obesidade II (severa)
	//Acima de 40 Obesidade III (mórbida)

        //Comparando a veracidade dos valores para apresentar o resultado
        if (imc < 17) {
            System.out.println("Muito abaixo do peso");
        } else if ((imc = 17) && (imc <= 18.49)) {
            System.out.println("Abaixo do peso");
        } else if ((imc >= 18.49) && (imc <= 24.99)) {
            System.out.println("Peso normal");
        } else if ((imc > 24.99) && (imc <= 29.99)) {
            System.out.println("Acima do peso");
        }else if ((imc > 29.99) && (imc <= 34.99)) {
            System.out.println("Obesidade grau I");
        }else if ((imc >= 35 && imc <= 39.9)) {
            System.out.println("Obesidade II (severa)");
	}else ((imc > 40 && imc <= 39.9)) {
	    System.out.println("Obesidade III (mórbida)");
	}
	}
	}
	}
	public class AplicaCalculaIMC{
        public static void main(String[] args) {
	new Main().setVisible(true);
	}
	}