package src.projectGraph;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javafx.application.*;
import gui.GraphGraphic;
import gui.Logo;
import gui.TextGUI;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextAreaBuilder;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;


public class MainClass extends Application 
{

	public static void main(String[] args) 
	{
		launch();
	}

	public void start(Stage primaryStage) throws IOException {

		//Sources et Supersource

		Sommet s = new Sommet("S", 10, 40);
		Sommet a = new Sommet("A", 20, 60);
		Sommet b = new Sommet("B", 20, 40);
		Sommet c = new Sommet("C", 20, 20);

		//Sommet li = new Sommet("Li");

		// Puits et Superpuits 

		Sommet d = new Sommet("D", 30, 70);
		Sommet e = new Sommet("E", 30, 50);
		Sommet f = new Sommet("F", 30, 30);
		Sommet g = new Sommet("G", 30, 10);
		Sommet h = new Sommet("H", 40, 80);
		Sommet i = new Sommet("I", 40, 60);
		Sommet j = new Sommet("J", 40, 40);
		Sommet k = new Sommet("K", 40, 20);
		Sommet l = new Sommet("L", 40, 0);
		Sommet p = new Sommet("P", 50, 40);


		// Cannalisations Sources / Puits

		Canalisation ad = new Canalisation ("AD", 20.0, 0.00, a, d);
		Canalisation ae = new Canalisation ("AE", 25.0, 0.00, a, e);
		Canalisation be = new Canalisation ("BE", 15.0, 0.00, b, e);
		Canalisation bf = new Canalisation ("BF", 25.0, 0.00, b, f);
		Canalisation cf = new Canalisation ("CF", 20.0, 0.00, c, f);
		Canalisation cg = new Canalisation ("CG", 20.0, 0.00, c, g);
		Canalisation dh = new Canalisation ("DH", 10.0, 0.00, d, h);
		Canalisation di = new Canalisation ("DI", 15.0, 0.00, d, i);
		Canalisation ei = new Canalisation ("EI", 15.0, 0.00, e, i);
		Canalisation ej = new Canalisation ("EJ", 10.0, 0.00, e, j);
		Canalisation fj = new Canalisation ("FJ", 15.0, 0.00, f, j);
		Canalisation fk = new Canalisation ("FK", 10.0, 0.00, f, k);
		Canalisation gk = new Canalisation ("GK", 15.0, 0.00, g, k);
		Canalisation gl = new Canalisation ("GL", 10.0, 0.00, g, l);


		Canalisation da = new Canalisation ("AD", 0.00, 25.00, d, a);
		Canalisation ea = new Canalisation ("AE", 0.00, 25.00, e, a);
		Canalisation eb = new Canalisation ("BE", 0.00, 15.00, e, b);
		Canalisation fb = new Canalisation ("BF", 0.00, 25.00, f, b);
		Canalisation fc = new Canalisation ("CF", 0.00, 20.00, f, c);
		Canalisation gc = new Canalisation ("CG", 0.00, 20.00, g, c);
		Canalisation hd = new Canalisation ("DH", 0.00, 10.00, h, d);
		Canalisation id = new Canalisation ("DI", 0.00, 15.00, i, d);
		Canalisation ie = new Canalisation ("EI", 0.00, 15.00, i, e);
		Canalisation je = new Canalisation ("EJ", 0.00, 10.00, j, e);
		Canalisation jf = new Canalisation ("FJ", 0.00, 15.00, j, f);
		Canalisation kf = new Canalisation ("FK", 0.00, 10.00, k, f);
		Canalisation kg = new Canalisation ("GK", 0.00, 15.00, k, g);
		Canalisation lg = new Canalisation ("GL", 0.00, 10.00, l, g);


		// Cannalisations Supersource / Sources

		Canalisation sa = new Canalisation ("SA", 65.0, 0.00, s, a);
		Canalisation sb = new Canalisation ("SB", 45.0, 0.00, s, b);
		Canalisation sc = new Canalisation ("SC", 40.0, 0.00, s, c);

		// Cannalisations Puits / Superpuits


		Canalisation hp = new Canalisation ("HP", 6.0, 0.00, h, p);
		Canalisation ip = new Canalisation ("IP", 5.5, 0.00, i, p);
		Canalisation jp = new Canalisation ("JP", 4.0, 0.00, j, p);
		Canalisation kp = new Canalisation ("KP", 4.2, 0.00, k, p);
		Canalisation lp = new Canalisation ("LP", 3.0, 0.00, l, p);



		//*************************LISTES CANNALISATIONS*********************************************************
		ArrayList<Canalisation> sources = new ArrayList <Canalisation>();
		ArrayList<Canalisation> can = new ArrayList <Canalisation>();

		ArrayList<Sommet> sommets = new ArrayList<Sommet>();

		//***************************AJOUT DES SOURCES**********************************************************
		sommets.add(s);
		sommets.add(a);
		sommets.add(b);
		sommets.add(c);
		sommets.add(d);
		sommets.add(e);
		sommets.add(f);
		sommets.add(g);
		sommets.add(h);
		sommets.add(i);
		sommets.add(j);
		sommets.add(k);
		sommets.add(l);

		//***************************AJOUT DES SOURCES**********************************************************
		sources.add(sa);
		sources.add(sb);
		sources.add(sc);

		//******************************AJOUT DES CANA SENS POSITF**********************************************
		can.add(ad);
		can.add(ae);
		can.add(be);
		can.add(bf);
		can.add(cf);
		can.add(cg);
		can.add(dh);
		can.add(di);
		can.add(ei);
		can.add(ej);
		can.add(fj);
		can.add(fk);
		can.add(gk);
		can.add(gl);

		//******************************AJOUT DES CANA SENS NEGATIF**********************************************
		can.add(da);
		can.add(ea);
		can.add(eb);
		can.add(fb);
		can.add(fc);
		can.add(gc);
		can.add(hd);
		can.add(id);
		can.add(ie);
		can.add(je);
		can.add(jf);
		can.add(kf);
		can.add(kg);
		can.add(lg);


		//*******************************AJOUT DES PUITS********************************************************
		can.add(hp);
		can.add(ip);
		can.add(jp);
		can.add(kp);
		can.add(lp);


		FruitsEtLegumesDAO fruitsEtLegumesDAO = new FruitsEtLegumesDAO();

		List<FruitsEtLegumes> fruitsEtLegumesList = fruitsEtLegumesDAO.retrieveAllfruitsEtLegumesList();

		//****************************TEST**************************************************************************		

		Pane root = new Pane();
		TextArea ta = new TextArea();
		ta.setLayoutY(40);
		ta.setVisible(true);
		ta.setWrapText(true);
		ta.setEditable(false);
		ta.setId("log");

		Scene scene = new Scene(root, 800, 600);

		Button start = new Button();
		start.setText("Cliquer ici");
		start.setId("start");

		Circle log = new Circle();
		log.setCenterX(250);
		log.setCenterY(300);
		log.setRadius(200);
		log.setFill(Color.WHITE);
		Image logo = new Image(MainClass.class.getResourceAsStream("logo.jpg"));
		log.setFill(new ImagePattern(logo));

		GraphGraphic graph = new GraphGraphic(can, sources, sommets);
		graph.setId("graph");

		start.setOnAction(new EventHandler<ActionEvent>() {

			@Override // clic et depart du programme
			public void handle(ActionEvent event) {
				root.getChildren().add(graph);
				Graph.flotMax(can, sources);

				System.out.println("\n Résultat : \n");
				
				Graph.flotFin(sources);

				for (Canalisation cana : sources)
					System.out.println(cana);

				for (Canalisation cana : can)
					System.out.println(cana);

				System.out.println("");

				List<Canalisation> lastCapacity =new ArrayList <Canalisation>();
				lastCapacity.add(hp);lastCapacity.add(ip);lastCapacity.add(jp);lastCapacity.add(kp);lastCapacity.add(lp);

				List<FruitsEtLegumesByPuits> vegeValable= new ArrayList<FruitsEtLegumesByPuits>();
				vegeValable=FruitsEtLegumesByPuits.compareNeedAndCapacity(fruitsEtLegumesList, lastCapacity);

				for (FruitsEtLegumesByPuits fruitsEtLegumesByPuits : vegeValable) {
					System.out.println(fruitsEtLegumesByPuits.displayFruitsEtLegumesByCanalisation());
				}
			}
		});

		root.setId("background");
		root.getChildren().add(start);

		root.getChildren().add(ta);
		root.getChildren().add(log);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Farm Irrigation");
		scene.getStylesheets().add(getClass().getResource("bgr.css").toExternalForm());
		primaryStage.show();

		System.setOut(new PrintStream(System.out) {
			@Override
			public void write(byte[] buf, int off, int len) {
				super.write(buf, off, len);

				String msg = new String(buf, off, len);

				ta.setText(ta.getText() + msg);
			}
		});

	}

}
