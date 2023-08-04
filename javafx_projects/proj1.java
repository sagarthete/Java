
import javafx.application.Application;
 import javafx.application.Platform;
 import javafx.stage.Stage;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.layout.BorderPane;
 import javafx.scene.layout.HBox;
 import javafx.geometry.Pos;
 import javafx.scene.canvas.Canvas;
 import javafx.scene.canvas.GraphicsContext;
 import javafx.scene.paint.color;


		public class C2W_Shapemultithread extends Application {
		
			Run|Debug
			public static void main(String[] args) {
			
				launch(args);
			}
		}
		
		private Canvas c2w_canvas;
		private volatile boolean c2w_running;
		private c2w_Runner c2w_runner;
		private Button c2w_startButton;

		public void start(Stage stage){
		
			c2W_canvas = new Canvas(width:640, height:480);
			c2w_redraw();
			c2w_startButton = new Button(text:"Start!");
			c2w_startButton.setOnAction(e -> c2wc2w_doStartOrStop());
			HBox c2w_bottom = new HBox(c2w_startButton);
			c2w_bottom.setStyle(value:"-fx-padding: 6px; -fx-border-color :black; -fx-borderWidth: 3px 0 0 0");
			c2w_bottom.setAllignment(Pos.CENTER);	
			BorderPane c2w_root = new BorderPane(c2w_canvas);
			c2w_root.setBottom(c2w_bottom);
			Scene c2w_scene = new Scene(c2w_root);
			stage.setScene(c2w_scene);
			stage.setTitle(value:"Click start to make random art");
			stage.setResizable(value:false);
			stage.show();
		}
		private class c2w_Runner extends Thread {
		
			public void run(){
			
				while(c2w_running){
				
					Platform.runLater(() -> c2w_redraw());
					try{
					
						Thread.sleep(millis:2000);
					}catch(InterruptedException e){}

				}
			
			}
		}

 		private void c2w_redraw(){
		
			GraphicsContext c2w_g= c2w_canvas.getGraphicsContext2D();
			double c2w_width = c2w_canvas.getwidth();
			double c2w_height = c2w_canvas.getHieght();
			if(! c2w_running){
			
				c2w_g.setFill(Color.WHITE);
				c2w_g.fillRect(x:0, y:0, c2w_width, c2w_hieght);
				return;
			}
		}
		
		Color c2w_randomGray = Color.hsb(hue:1,saturation:0, Math.random());
		c2w_g.setFill(c2w_randomGray);
		c2w_g.fillRect(x:0, y:0, c2w_width, c2w_height);

		int c2w_artType = (int)(3*Math.random());

		switch(c2w_artType) {
		
			case 0: 
				c2w_g.setLineWidth(lw:2);
				for(int i=0; i<500 i++){
				
					int x1 = (int)(c2w_width *Math.Random());
					int y1 = (int)(c2w_height *Math.Random());
					int x2 = (int)(c2w_width *Math.Random());
					int x2 = (int)(c2w_height *Math.Random());
					Color randomHue = Color.hsb(360*Math.random(),saturation:1, brightness:1);
					c2w_g.setStroke(randomHue);
					c2w_g.strokeLine(x1,y1,x2,y2);

				}
				break;

			case 1:
				for(int i=0; i<200; i++){
				
					int c2w_centerX = (int)(c2w_width * Math.random());
					int c2w_centerY = (int)(c2w_height * Math.random());
					Color c2w_RandomHue = Color.hsb(360*Math.random(), saturation:1);
					c2w_g.setStroke(c2w_randomHue);
					c2w_g.strokeOval(c2w_centerX - 50, c2w_centerY - 50, w:100, h:100);
				}
				break;
			default:
				 c2w_g.setStroke(Color.BLACK);
				 c2w_g.setLineWidth(lw:4);

				 for(int i=0; i<25; i++){
				 
					 int centerX = (int)(c2w_width * Math.random());
					 int centerY = (int)(c2w_height * Math.random());
					 int size = 30 + (int)(170 * Math.random());

					 Color randomColor = Color.color(Math.random(), Math.random(), Math.random());

					 c2w_g.setFill(randomColor);
					 c2w_g.fillRect(centerX - size/2, centerY - size/2,size,size);
					 c2w_g.StrokeRect(centerX - size/2, centerY - size/2,size,size);
				 }
		}
		
		private void c2w_doStarOrStop(){
		
			if(c2w_running == false){
			
				c2w_startButton.setText(value:"Stop");
				c2w_runner = new c2w_Runner();
				c2w_running =true;
				c2w_runner.start();
			}else{
			
				c2w_startButton.setDisable(value);
				c2w_running
				c2w_redraw();
				c2w_runner.interrupt();


				try{
				
					c2w_runner.join(millis:1000);
				}catch(InterruptedEcxeption e){}

				c2w_runner = null;

				c2w_startButton.setText(value:"Start");
				c2w_startButton.setDisable(value:"false");

			}
		}
}
