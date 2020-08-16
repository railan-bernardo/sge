import java.util.Scanner;

public class Login {

    //função para validar os tipos de caracter permitidos
    public  static boolean validateCharacter(String password){
        Boolean validate = true;

        if(password.length() < 8){
            validate = false;
        }

        if (!password.matches("(?=.*[@#}{,.^?~=+\\-_\\/*\\-+.\\|])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}")){
            validate = false;
        }


        return  validate;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String lastName = scanner.nextLine();

        System.out.println("Digite seu sobre Nome: ");
        String firstName = scanner.nextLine();

        char user = 0;

        user = lastName.charAt(0);

        System.out.println("Seu usuário é: "+ user + "_" + firstName);

        String user_name = user +"_"+ firstName;

        System.out.println("Digite uma senha: ");
        String pass = scanner.nextLine();

        //validando se a senha digitada segue os padrões
        if(validateCharacter(pass)){
            System.out.println("Seu cadastro foi realizado com Sucesso! \n " +
                    "========================================================= \n " +
                    "                     Fazer Login \n" +
                    " ========================================================\n");
        }else{
                System.out.println("Informe uma senha com letras maiúscula e minúscula " +
                        "com números e caracter especial com o tamanho minimo de 8 caracter!");
                System.exit(0);
            }

        System.out.println("Digite seu username: ");
        String login = scanner.nextLine();

        //validando se o nome de usuário digitado é igual ao nome de usuário gerado
        if (login.equals(user_name)){
            System.out.println("Digite sua senha: ");
        }else{
            System.out.println("Seu usuário de login não conferi!");
           System.exit(0);

        }


        String passLogin = scanner.nextLine();

        //validando se a senha digitada é igual a senha cadastrada
        if(passLogin.equals(pass)){
            System.out.println("Seja Bem Vindo "+ lastName + " "+firstName);
        }else{
            System.out.println("Senha  não conferi!");
        }

    }

}
