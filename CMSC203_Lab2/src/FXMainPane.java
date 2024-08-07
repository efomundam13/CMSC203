
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	
		
	public void start(Stage stage) {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		
		HBox hb1 = new HBox();
		HBox hb2 = new HBox();
		
		DataManager DManager = new DataManager();
		
		TextField textField = new TextField();
		
		Label labelField = new Label("Feedback");
		
		
		Button bb1 = new Button("Hello");
		bb1.setOnAction(new EventHandler<ActionEvent>() {
	    	 public void handle(ActionEvent e) {        
	    		 textField.setText(DManager.getHello());    
	    		 }
	    	 });
		Button bb2 = new Button("Howdy");
		bb2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {        
				textField.setText(DManager.getHowdy());
				}
			});
		Button bb3 = new Button("Chinese");
		bb3.setOnAction(new EventHandler<ActionEvent>() {
	    	public void handle(ActionEvent e) {
	    		textField.setText(DManager.getChinese());
	    		}
	    	});
		Button bb4 = new Button("Clear");
		bb4.setOnAction(new EventHandler<ActionEvent>() {
	    	public void handle(ActionEvent e) {
	    		textField.setText("");
	    		}
	    	});
		Button bb5 = new Button("Exit");
	    bb5.setOnAction(new EventHandler<ActionEvent>() {
	    	public void handle(ActionEvent e) {
	    		Platform.exit();
	    		System.exit(0);
	    		}
	    	});
		
	
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		VBox vBox = new VBox();
		vBox.setAlignment(Pos.CENTER);
		Insets inset = new Insets(20, 20, 20, 20);
		vBox.setSpacing(10);
		
		VBox.setMargin(textField, inset);
		VBox.setMargin(bb1, inset);
		VBox.setMargin(bb2, inset);
		VBox.setMargin(bb3, inset);
		VBox.setMargin(bb4, inset);
		VBox.setMargin(bb5, inset);
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		
		hb1.setAlignment(Pos.CENTER);
		hb1.getChildren().addAll(labelField, textField, hb2);
		
		ObservableList<Node> listVal = vBox.getChildren();
		listVal.addAll(textField, bb1, bb2, bb3, bb4, bb5, hb1);
		
		Scene scenes = new Scene(vBox);
		stage.setScene(scenes);
		stage.show();

	//Task #4:
	//  create a private inner class to handle the button clicks
     }
	}  
	
