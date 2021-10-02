package application;


import java.io.File;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Main extends Application{
	
	
	//Two Stages and two scenes
	
	Stage stage1, stage2;
	Scene scene1, scene2;
	BorderPane layout;
	
	//Declaring buttons ojects varibales	
	Button preprocess = new Button("Preprocess Video");
	Button generate = new Button("Produce a Summary");
	Button watch = new Button("Watch the video sequence");
	Button summary = new Button("Watch the summary");
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
/*		stage1 = primaryStage;
		stage1.setTitle("Comments-based Video Summarization");	
		
		
		//Video Menu
		
		Menu videoMenu = new Menu("Video");
		CheckMenuItem segment = new CheckMenuItem("Segment...");
		CheckMenuItem extractKeyframes = new CheckMenuItem("ExtractKeyframes...");
		CheckMenuItem annoatateKeyframes = new CheckMenuItem("Annotate Keyframes...");
		CheckMenuItem cluster = new CheckMenuItem("Cluster Segments...");
		CheckMenuItem select = new CheckMenuItem("Select Reperesentative segments...");
		MenuItem restart = new MenuItem("Restart");
		MenuItem refresh = new MenuItem("Refresh");
		
		
		//Add items to videoMenu
		videoMenu.getItems().add(segment);
		videoMenu.getItems().add(extractKeyframes);
		videoMenu.getItems().add(annoatateKeyframes);
		videoMenu.getItems().add(cluster);
		videoMenu.getItems().add(select);
		videoMenu.getItems().add(new SeparatorMenuItem());
		videoMenu.getItems().add(refresh);
		videoMenu.getItems().add(new SeparatorMenuItem());
		videoMenu.getItems().add(restart);
		videoMenu.getItems().add(new MenuItem("Exit"));
		
		
		//Comments 
		Menu commentMenu = new Menu("_Comments");
		
		//Menu Items
		MenuItem selectComments = new MenuItem("Select Comments file...");
		MenuItem commentsPreprocessing = new MenuItem("Comments Preprocessing");
		MenuItem extractNgrams = new MenuItem("Extract N-grams");
		
		commentMenu.getItems().add(selectComments);
		commentMenu.getItems().add(new SeparatorMenuItem());
		commentMenu.getItems().add(commentsPreprocessing);
		commentMenu.getItems().add(new SeparatorMenuItem());
		commentMenu.getItems().add(extractNgrams);
		
		
		
		// summary Menu
		Menu summaryMenu = new Menu("Summary Size");
		ToggleGroup summaryToggle = new ToggleGroup();
		
		RadioMenuItem ten = new RadioMenuItem("Ten percent summary");
		RadioMenuItem fifteen = new RadioMenuItem("Fifteen percent summary");
		RadioMenuItem tweenty = new RadioMenuItem("Twenty percent summary");
		
		ten.setToggleGroup(summaryToggle);
		fifteen.setToggleGroup(summaryToggle);
		tweenty.setToggleGroup(summaryToggle);
		
		summaryMenu.getItems().addAll(ten, fifteen, tweenty);	
		
		//Setting Menu
		Menu settingMenu = new Menu("Settings");
		MenuItem minScrennItem = new MenuItem("Minimize the stage1");
		MenuItem maxScreenItem = new MenuItem("Maximize the stage1");
		
		//Add Items to settings menu
		settingMenu.getItems().addAll(minScrennItem,maxScreenItem);
				
		//Main menu bar
		MenuBar menuBar = new MenuBar();
		menuBar.getStyleClass().add("menubar-color");
		menuBar.getMenus().addAll(videoMenu, commentMenu, summaryMenu, settingMenu);
		
		layout = new BorderPane();
		
		//set to top side
		layout.setTop(menuBar);
		
		//Creating preprocess button
		Button preprocess = new Button("Preprocess Video");
		preprocess.setId("allbtn");
		preprocess.setMinSize(150, 35);
		preprocess.setMaxSize(300, 60);
		preprocess.setPrefSize(200, 40);
		
		//Creating preprocess button
		Button generate = new Button("Produce a Summary");
		generate.setId("allbtn");
		generate.setMinSize(150, 35);
		generate.setMaxSize(300, 60);
		generate.setPrefSize(200, 40);
		//Creting the watch button
		Button watch = new Button("Watch the video sequence");
		watch.setId("allbtn");
		watch.setMinSize(150, 35);
		watch.setMaxSize(300, 60);
		watch.setPrefSize(200, 40);
		
		//Creating summary button
		Button summary = new Button("Watch the summary");
		summary.setId("allbtn");
		summary.setMinSize(150, 35);
		summary.setMaxSize(300, 60);
		summary.setPrefSize(200, 40);
		
		GridPane grid = new GridPane();
		//grid.setGridLinesVisible(true);
		grid.prefWidthProperty().bind(Bindings.divide(primaryStage.widthProperty(), 2.0));
		grid.prefHeightProperty().bind(Bindings.divide(primaryStage.heightProperty(), 1.0));
		//grid.setMaxHeight(1000);
		grid.getStyleClass().add("grid");
		
		//grid.setPadding(new Insets(10));
	    //grid.setHgap(1);
        //grid.setVgap(1);
        
        Label labelTitle = new Label("Click watch button to wath the video or summary \n to watch the abstract");
        labelTitle.setId("label-btn");
        labelTitle.prefWidthProperty().bind(Bindings.divide(grid.widthProperty(), 1.0));
        labelTitle.setPrefHeight(50);
	    
        //Adding the button to grid
        GridPane.setConstraints(labelTitle, 0, 0, 2, 1);
        
        //Adding the button to grid
        GridPane.setConstraints(preprocess,0, 1);
        
        //Adding the button to grid
        GridPane.setConstraints(generate, 0, 2);       
        
        //Adding the button to grid
        GridPane.setConstraints(watch,0, 3);
        
        
        //Adding the button to grid
        GridPane.setConstraints(summary, 0, 4);
        
        grid.getChildren().addAll(labelTitle,preprocess, generate, watch, summary);
        
        // set to left the grid pane inside the border pane
        layout.setLeft(grid);
        

        
        Scene scene = new Scene(layout,800,500);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage1.setScene(scene);
		stage1.setMaximized(true);
		stage1.show();*/
		
		stage1 = createStageOne();
		stage2 = createStageTwo();
		stage1.show();
		
	}
	

	private Stage createStageOne() {
		stage1 = new Stage();
		stage1.setTitle("Comments-based Video Summarization");	
		
		
		//Video Menu
		
		Menu videoMenu = new Menu("Video");
		CheckMenuItem segment = new CheckMenuItem("Segment...");
		CheckMenuItem extractKeyframes = new CheckMenuItem("ExtractKeyframes...");
		CheckMenuItem annoatateKeyframes = new CheckMenuItem("Annotate Keyframes...");
		CheckMenuItem cluster = new CheckMenuItem("Cluster Segments...");
		CheckMenuItem select = new CheckMenuItem("Select Reperesentative segments...");
		MenuItem restart = new MenuItem("Restart");
		MenuItem refresh = new MenuItem("Refresh");
		
		
		//Add items to videoMenu
		videoMenu.getItems().add(segment);
		videoMenu.getItems().add(extractKeyframes);
		videoMenu.getItems().add(annoatateKeyframes);
		videoMenu.getItems().add(cluster);
		videoMenu.getItems().add(select);
		videoMenu.getItems().add(new SeparatorMenuItem());
		videoMenu.getItems().add(refresh);
		videoMenu.getItems().add(new SeparatorMenuItem());
		videoMenu.getItems().add(restart);
		videoMenu.getItems().add(new MenuItem("Exit"));
		
		
		//Comments 
		Menu commentMenu = new Menu("_Comments");
		
		//Menu Items
		MenuItem selectComments = new MenuItem("Select Comments file...");
		MenuItem commentsPreprocessing = new MenuItem("Comments Preprocessing");
		MenuItem extractNgrams = new MenuItem("Extract N-grams");
		
		commentMenu.getItems().add(selectComments);
		commentMenu.getItems().add(new SeparatorMenuItem());
		commentMenu.getItems().add(commentsPreprocessing);
		commentMenu.getItems().add(new SeparatorMenuItem());
		commentMenu.getItems().add(extractNgrams);
		
		
		
		// summary Menu
		Menu summaryMenu = new Menu("Summary Size");
		ToggleGroup summaryToggle = new ToggleGroup();
		
		RadioMenuItem ten = new RadioMenuItem("Ten percent summary");
		RadioMenuItem fifteen = new RadioMenuItem("Fifteen percent summary");
		RadioMenuItem tweenty = new RadioMenuItem("Twenty percent summary");
		
		ten.setToggleGroup(summaryToggle);
		fifteen.setToggleGroup(summaryToggle);
		tweenty.setToggleGroup(summaryToggle);
		
		summaryMenu.getItems().addAll(ten, fifteen, tweenty);	
		
		//Setting Menu
		Menu settingMenu = new Menu("Settings");
		MenuItem minScrennItem = new MenuItem("Minimize the stage1");
		MenuItem maxScreenItem = new MenuItem("Maximize the stage1");
		
		//Add Items to settings menu
		settingMenu.getItems().addAll(minScrennItem,maxScreenItem);
				
		//Main menu bar
		MenuBar menuBar = new MenuBar();
		menuBar.getStyleClass().add("menubar-color");
		menuBar.getMenus().addAll(videoMenu, commentMenu, summaryMenu, settingMenu);
		
		layout = new BorderPane();
		
		//set to top side
		layout.setTop(menuBar);
		
		
		
		preprocess.setId("allbtn");
		preprocess.setMinSize(150, 35);
		preprocess.setMaxSize(300, 60);
		preprocess.setPrefSize(200, 40);
		
		//Creating preprocess button
		
		generate.setId("allbtn");
		generate.setMinSize(150, 35);
		generate.setMaxSize(300, 60);
		generate.setPrefSize(200, 40);
		
		watch.setId("allbtn");
		watch.setMinSize(200, 35);
		watch.setMaxSize(300, 60);
		watch.setPrefSize(250, 40);
		
		//Create action when watch button is clicked
		watch.setOnAction(e->stage2.show());
		
		//Creating summary button
		
		summary.setId("allbtn");
		summary.setMinSize(150, 35);
		summary.setMaxSize(300, 60);
		summary.setPrefSize(200, 40);
		
		GridPane grid = new GridPane();
		//grid.setGridLinesVisible(true);
		grid.prefWidthProperty().bind(Bindings.divide(stage1.widthProperty(), 2.0));
		grid.prefHeightProperty().bind(Bindings.divide(stage1.heightProperty(), 1.0));
		//grid.setMaxHeight(1000);
		grid.getStyleClass().add("grid");
		
		//grid.setPadding(new Insets(10));
	    //grid.setHgap(1);
        //grid.setVgap(1);
        
        Label labelTitle = new Label("Click watch button to wath the video or summary \n to watch the abstract");
        labelTitle.setId("label-btn");
        labelTitle.prefWidthProperty().bind(Bindings.divide(grid.widthProperty(), 1.0));
        labelTitle.setPrefHeight(50);
	    
        //Adding the button to grid
        GridPane.setConstraints(labelTitle, 0, 0, 2, 1);
        
        //Adding the button to grid
        GridPane.setConstraints(preprocess,0, 1);
        
        //Adding the button to grid
        GridPane.setConstraints(generate, 0, 2);       
        
        //Adding the button to grid
        GridPane.setConstraints(watch,0, 3);
        
        
        //Adding the button to grid
        GridPane.setConstraints(summary, 0, 4);
        
        grid.getChildren().addAll(labelTitle,preprocess, generate, watch, summary);
        
        // set to left the grid pane inside the border pane
        layout.setLeft(grid);
        

        
        scene1 = new Scene(layout,800,500);
		scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage1.setScene(scene1);
		stage1.setMaximized(true);
		
		return stage1;
	}
	
	
	private Stage createStageTwo() {
		// TODO Auto-generated method stub
		stage2 = new Stage();
		stage2.setTitle("Original Video Sequence");
		stage2.initOwner(stage1);
		stage2.initModality(Modality.APPLICATION_MODAL);
		
		//Initialising path of the media file
		String path = "M:\\collegeProgram\\Pfe\\videos\\Top-5-best-auditions-animals-America's-Got-talent-2017.mp4";
		
		//Instantiating Media Class
		
		Media media = new Media(new File(path).toURI().toString());	
		
		
		// Instanstiating Media Class
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		
		//Instantiating MediaView class
		MediaView mediaView = new MediaView(mediaPlayer);
		
		//Auto playing the video when it is upload
		
		mediaPlayer.setAutoPlay(false);
		
			
		mediaPlayer.setOnReady(()->stage2.sizeToScene());
		
		
		
		//Creating a border pane, which will contain the media view
		BorderPane borderPane = new BorderPane();
		//borderPane.setBottom(hBox);
		
		//Creating play and pause button
		Button playButton = new Button(">");
		playButton.requestFocus();
		playButton.setOnAction(e->{
			mediaPlayer.play();
			mediaPlayer.setRate(1);
		});
		
		//pause button
		Button pauseButton = new Button("||");
		pauseButton.setOnAction(e->{
			mediaPlayer.pause();
		});
		
		//fast button
		Button fastButton = new Button(">>");
		fastButton.setOnAction(e->{
			mediaPlayer.setRate(2);
		});
		
		//Slow button
		//fast button
		Button slowButton = new Button("<<");
		slowButton.setOnAction(e->{
			mediaPlayer.setRate(0.5);
		});
		
		//reload button
		Button reloadButton = new Button("reload");
		reloadButton.setOnAction(e->{
			mediaPlayer.seek(mediaPlayer.getStartTime());
			mediaPlayer.play();
		});	
		
		
		//start button
		Button startButton = new Button("start");
		startButton.setOnMousePressed(e->{
			mediaPlayer.seek(mediaPlayer.getStartTime());
			mediaPlayer.stop();
		});		
		
		//last button
		Button lastButton = new Button("last");
		lastButton.setOnAction(e->{
			mediaPlayer.seek(mediaPlayer.getStopTime());
			mediaPlayer.stop();
		});
		
		//		

			
		
		
		
		
		
		
		
		

		//Creating Hbow that will contain play and pause button
		HBox hBox = new HBox(10);
		hBox.setId("hbox");
		hBox.getChildren().addAll(slowButton, playButton,pauseButton, fastButton, reloadButton, startButton, lastButton);
		hBox.setPadding(new Insets(20));
		
		borderPane.setBottom(hBox);
		
		mediaView.fitWidthProperty().bind(Bindings.divide(borderPane.widthProperty(), 1.0));
		mediaView.fitHeightProperty().bind(Bindings.divide(borderPane.heightProperty(), 1.0));
		borderPane.setCenter(mediaView);
		
		
		
		
		scene2 = new Scene(borderPane,800,600);
		scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		//scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		stage2.setScene(scene2);
	
		return stage2;
	}
	
	
}
