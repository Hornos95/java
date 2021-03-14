import javafx.application.Application;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;

public class Main extends Application {


    private static double centerX, centerY, centerZ, radius, x1, y1, z1, x2, y2, z2;
    private static double[] center = new double[3];
    private static double[][] line = new double[3][3];

    public double[] scanFile(String url){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        url = scanner.nextLine();
        try (BufferedReader in = new BufferedReader(new FileReader(url)))
        {
            center = in.lines().mapToDouble(Double::parseDouble).toArray();
        }
        catch (IOException | NumberFormatException e)
        {
            e.printStackTrace();
        }
        if (center != null)
        {
            double max = Double.MIN_VALUE;
            for (int i = 0; i < center.length; i++)
            {
                if (max < center[i])
                {
                    max = center[i];
                }
            }

        }
        return center;
    }

    public static void main(String[] args) {
        centerX=center[1];
        centerY=center[2];
        centerZ=center[3];

        if ((x1 - centerX) * (x1 - centerX) + (y1 - centerY) * (y1 - centerY) + (z1 - centerZ) * (z1 - centerZ) <= radius * radius
                || (x2 - centerX) * (x2 - centerX) + (y2 - centerY) * (y2 - centerY) + (z2 - centerZ) * (z2 - centerZ) <= radius * radius) {
            System.out.println("Есть точки пересечения");
        } else {
            System.out.println("Коллизий не найдено");

        }


    launch(args) ;
    }
    @Override
    public void start(Stage stage) throws Exception {
        Camera camera=new PerspectiveCamera(true);
        camera.setFarClip(50000.0);
        camera.setTranslateZ(-1000);
        Sphere sphere=new Sphere();
        sphere.setRadius(radius);
        sphere.setTranslateX(centerX);
        sphere.setTranslateY(centerY);
        sphere.setTranslateZ(centerZ);
        Line line = new Line();
        line.setStartX(x1);
        line.setStartY(y1);
        line.setEndX(x2);
        line.setEndY(y2);
        Group group =new Group(sphere,line);
        Scene scene=new Scene(group,800,600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();
    }


}
