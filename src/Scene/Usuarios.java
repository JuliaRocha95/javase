package Scene;


import Controller.UsuariosController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Usuarios extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loaderUsuario = new FXMLLoader(this.getClass().getResource("layoutUsuarios.fxml"));


        UsuariosController usuariosController = new UsuariosController();
        loaderUsuario.setController(usuariosController);

        Parent root = loaderUsuario.load();

        stage.setTitle("Cadastrar Usuário");
        stage.setScene(new Scene(root));
        stage.show();
    }
}