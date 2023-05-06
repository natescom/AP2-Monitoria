import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    private double valueA = 0;
    private double valueB = 0;
    private char operacao = 'n';
    private String labelvalue = "";

    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn0;
    public Button btnMais;
    public Button btnMenos;
    public Button btnMulti;
    public Button btnDivisao;
    public Button btnIgual;
    public Label lblResultado;

    private void atribuirValores(double value){
        if(operacao == 'n'){
            valueA = value;
            labelvalue += valueA + " ";
        }else{
            valueB = value;
            labelvalue += valueB;
        }
    }

    public void pressionarBotao(ActionEvent event){
        if(event.getSource().equals(btn1)){
            atribuirValores(1);
        }
        if(event.getSource().equals(btn2)){
            atribuirValores(2);
        }
        if(event.getSource().equals(btn3)){
            atribuirValores(3);
        }
        if(event.getSource().equals(btn4)){
            atribuirValores(4);
        }
        if(event.getSource().equals(btn5)){
            atribuirValores(5);
        }
        if(event.getSource().equals(btn6)){
            atribuirValores(6);
        }
        if(event.getSource().equals(btn7)){
            atribuirValores(7);
        }
        if(event.getSource().equals(btn8)){
            atribuirValores(8);
        }
        if(event.getSource().equals(btn9)){
            atribuirValores(9);
        }
        if(event.getSource().equals(btn0)){
            atribuirValores(0);
        }
        if(event.getSource().equals(btnMais)){
            operacao = '+';
            labelvalue += operacao + " ";
        }
        if(event.getSource().equals(btnMenos)){
            operacao = '-';
            labelvalue += operacao + " ";
        }
        if(event.getSource().equals(btnMulti)){
            operacao = '*';
            labelvalue += operacao + " ";
        }
        if(event.getSource().equals(btnDivisao)){
            operacao = '/';
            labelvalue += operacao + " ";
        }
        if(event.getSource().equals(btnIgual)){
            double resultado;
            switch (operacao){
                case '+':
                resultado = valueA + valueB;
                break;
                case '-':
                resultado = valueA - valueB;
                break;
                case '*':
                resultado = valueA * valueB;
                break;
                case '/':
                resultado = valueA / valueB;
                break;
                default:
                resultado = 0;
            }
            Platform.runLater(() -> {
                lblResultado.setText(resultado+"");
            });
            operacao = 'n';
            valueA = 0;
            valueB = 0;
            labelvalue = "";
            return;
        }
    
        Platform.runLater(() -> {
            lblResultado.setText(labelvalue);
        });
    }
}
