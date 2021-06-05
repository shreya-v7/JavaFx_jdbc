import javafx.application.Application; 
import javafx.collections.FXCollections; 
import javafx.collections.ObservableList; 
import javafx.scene.layout.HBox;
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.control.PasswordField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.Scene; 
import javafx.scene.control.Button;  
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField;  
import javafx.scene.control.ToggleButton; 
import javafx.stage.Stage; 
import javafx.scene.control.Label;

/**
FOR WINDOWS
To run in cmd, download sdk for javafx via  <https://gluonhq.com/products/javafx/> , unzip put the file in program files -> java
set path in cmd 
compile using:
javac --module-path "javafx file path" --add-modules javafx.controls,javafx.fxml hello.java
run using:
Java --module-path "javafx file path" --add-modules javafx.controls,javafx.fxml hello
**/

class portException extends Exception
{ 
 portException(String s)
 {
 super(s);
 }
}
public class Q3 extends Application { 
   @Override 

   public void start(Stage stage) {   
		
	
      //heading 
      Text headLabel = new Text("Server Configuration"); 

      //main
      Text mainLabel = new Text("Server is running"); 
      	 
      //Label for host 
      Text hostLabel = new Text("MySQL host :"); 
      
      //Text field for host 
      TextField hostText = new TextField();   
    	 
      //Label for port 
      Text portLabel = new Text("MySQL Port:"); 
      
      //Text field for port 
      TextField portText = new TextField();   
    	 
      //Label for database
      Text databaseLabel = new Text("MySQL Database :"); 
      
      //Text field for database 
      TextField databaseText = new TextField();  
    	 
      //Label for username
      Text usernameLabel = new Text("MySQL UserName :"); 
      
      //Text field for username
      TextField usernameText = new TextField();  
    	 
      //Label for password
      Text passwordLabel = new Text("MySQL Password :"); 
      
      //Text field for password
      PasswordField passwordText = new PasswordField(); 
       
      //Label for connect 
      Button buttonConnect = new Button("Connect");
  
      //Label for reset 
      Button buttonReset = new Button("Reset"); 
    	 
      
      //Creating a Grid Pane 
      GridPane gridPane = new GridPane();    
      
      //Setting size for the pane 
      gridPane.setMinSize(400, 400); 
       
      //Setting the padding    
      gridPane.setPadding(new Insets(10, 10, 10, 10));  
      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(5); 
      gridPane.setHgap(5);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER); 
       
      //Arranging all the nodes in the grid 
      gridPane.add(headLabel, 1, 0);        
      gridPane.add(mainLabel, 1, 1); 
      
      gridPane.add(hostLabel, 0, 4); 
      gridPane.add(hostText, 1, 4); 
      gridPane.add(portLabel, 0, 5); 
      gridPane.add(portText, 1, 5);        
      gridPane.add(databaseLabel, 0, 6); 
      gridPane.add(databaseText, 1, 6);        
      gridPane.add(usernameLabel, 0, 7); 
      gridPane.add(usernameText, 1, 7);      
      gridPane.add(passwordLabel, 0, 8); 
      gridPane.add(passwordText, 1, 8);    
       
      
      HBox hbox = new HBox(5);
      hbox.getChildren().addAll(buttonConnect,buttonReset);
      gridPane.add(hbox, 1, 10);


       System.out.println(hostText.getText());
	System.out.println(portText.getText());
 	System.out.println(databaseText.getText());
 	System.out.println(usernameText.getText());
 	System.out.println(passwordText.getText());

      //Creating a scene object 
      Scene scene = new Scene(gridPane); 

      headLabel.setFont(Font.font("Arial", FontWeight.NORMAL,25));

      buttonConnect.setOnAction(e -> {
		
		int mysqlport = Integer.parseInt(portText.getText());
		try {
 		        
			if (mysqlport > 99999){
	 	throw new portException("Invalid port number!");
	 }

 		} catch (portException ex) {
 			System.out.println("Port Exception Occured:" + ex);
 		}

         //Retrieving data
         String mysqlhost = hostText.getText();
         String mysqldb = databaseText.getText();
         String mysqlun = usernameText.getText();
         String pwd = passwordText.getText();
	 
         if(pwd.equals("abc123") && mysqlhost.equals("localhost") && mysqlport==3306 && mysqldb.equals("vit") && mysqlun.equals("shreya")) {
           	gridPane.add(new Label("VALID USER"), 1, 9);
         } else {
            gridPane.add(new Label("INVALID USER"), 1, 9);
         }
      });

      buttonReset.setOnAction(e->{
 	hostText.clear();
 	portText.clear();
 	databaseText.clear();
 	usernameText.clear();
 	passwordText.clear();
      });
	
      //Setting title to the Stage 
      stage.setTitle("Server Configuration"); 
         
      //Adding scene to the stage 
      stage.setScene(scene);  
      
      //Displaying the contents of the stage 
      stage.show(); 

   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
}
