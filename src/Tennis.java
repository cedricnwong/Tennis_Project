import java.util.Arrays;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class Tennis extends Application{
		//variables here

		public static void main (String [] args)
		{
			launch(args);
		}

		@Override public void start(Stage primaryStage) throws Exception
		{
			//sets the dimensions of the scene and the sudoku board
			int SceneW = 1000;
			int SceneH = 1000;
			int frameW = (int) (0.8*SceneW);
			int frameH = (int) (0.8*SceneH);
			double squareLength = 800/9;
		
			Rectangle tennisCourt = new Rectangle();
			tennisCourt.setX(100);
			tennisCourt.setY(100);
			tennisCourt.setWidth(frameW);
			tennisCourt.setHeight(frameH);
			tennisCourt.setFill(Color.WHITE);
			tennisCourt.setStroke(Color.BLACK);
			tennisCourt.setStrokeWidth(5);

			Group root = new Group();
			Scene scene = new Scene(root, SceneW, SceneH);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Sudoku");
			primaryStage.show();
		}
}
	

