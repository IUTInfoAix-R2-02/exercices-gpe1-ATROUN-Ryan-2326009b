package fr.amu.iut.exercice5;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Fantome extends Personnage {

    private Rectangle basCorps;
    private Circle oeilGauche;
    private Circle retineGauche;
    private Circle oeilDroit;
    private Circle retineDroite;

    private final double positionInitialeRetineGauche = 7;
    private final double positionInitialeRetineDroite = 15;

    public Fantome() {
        super("droite", Color.BLUE, Color.BLUE);

        basCorps = new Rectangle(0, 10, 20, 10);
        basCorps.setFill(Color.BLUE);

        oeilGauche = new Circle(6, 6, 2, Color.WHITE);
        retineGauche = new Circle(positionInitialeRetineGauche, 6, 1, Color.BLACK);

        oeilDroit = new Circle(14, 6, 2, Color.WHITE);
        retineDroite = new Circle(positionInitialeRetineDroite, 6, 1, Color.BLACK);

        super.getChildren().addAll(basCorps, oeilGauche, retineGauche, oeilDroit, retineDroite);
    }

    @Override
    public void deplacerAGauche() {
        super.deplacerAGauche();
        double deltaX = -0.5;
        double nouvellePositionGauche = retineGauche.getCenterX() + deltaX;

        if (nouvellePositionGauche > oeilGauche.getCenterX() - oeilGauche.getRadius()) {
            retineGauche.setCenterX(oeilGauche.getCenterX() - oeilGauche.getRadius());
        } else {
            retineGauche.setCenterX(nouvellePositionGauche);
        }

        if (retineGauche.getCenterX() <= oeilGauche.getCenterX() - oeilGauche.getRadius()) {
            retineGauche.setCenterX(positionInitialeRetineGauche);
        }
    }

    @Override
    public void deplacerADroite(double largeurJeu) {
        super.deplacerADroite(largeurJeu);
        double deltaX = 0.5;
        double nouvellePositionDroite = retineDroite.getCenterX() + deltaX;

        if (nouvellePositionDroite < oeilDroit.getCenterX() + oeilDroit.getRadius()) {
            retineDroite.setCenterX(oeilDroit.getCenterX() + oeilDroit.getRadius());
        } else {
            retineDroite.setCenterX(nouvellePositionDroite);
        }

        if (retineDroite.getCenterX() >= oeilDroit.getCenterX() + oeilDroit.getRadius()) {
            retineDroite.setCenterX(positionInitialeRetineDroite);
        }
    }

    @Override
    public void deplacerEnBas(double hauteurJeu) {
        super.deplacerEnBas(hauteurJeu);
        // Pas de mouvement de rétine nécessaire pour le déplacement vertical
    }

    @Override
    public void deplacerEnHaut() {
        super.deplacerEnHaut();
        // Pas de mouvement de rétine nécessaire pour le déplacement vertical
    }
}
