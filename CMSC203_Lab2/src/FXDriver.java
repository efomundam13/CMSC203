
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;

public class FXDriver extends Application {
	public static void main(String[] args) {
		launch(args);  
    }             
	
    public void start(Stage stage) throws IOException {
        	FXMainPane root = new FXMainPane();
        	root.start(stage);
            stage.setTitle("Hello World GUI");
            stage.show();
     }
}
