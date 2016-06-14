package ru.game.pattern.model;

import ru.game.pattern.controller.GameController;
import ru.game.pattern.controller.Property;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Uskov Dmitry on 27.05.2016.
 */

/**
 * Объект, отвечающий за фон игры.
 * Если мы захотим, чтобы изображение на фоне было динамическое, изменения вносить здесь
 */
public class GameBackground extends GameObject {

    private WindowInfo windowInfo;

    private BufferedImage image = null;

    private BufferedImage imageTree = null;

    private String BACKGROUND_IMAGE_PATH = Property.RESOURSES_PATH + "plane_lite_80.png";

    private String BACKGROUND_IMAGE_PATH_THREE = Property.RESOURSES_PATH + "plane_lite_81.png";


    public GameBackground(WindowInfo windowInfo) throws IOException {
        this.windowInfo = windowInfo;
        image = ImageIO.read(new File(BACKGROUND_IMAGE_PATH));
        imageTree = ImageIO.read(new File(BACKGROUND_IMAGE_PATH_THREE));
    }

    @Override
    public void drawSpecialAfterAll(Graphics2D g) {
        g.drawImage(imageTree, 0, 0, null);
        g.setColor(Color.WHITE);
        g.drawRect(windowInfo.getBorderLeft(), windowInfo.getBorderTop(),
                    windowInfo.getWidth() - windowInfo.getBorderLeft() - windowInfo.getBorderRight(),
                    windowInfo.getHeight() - windowInfo.getBorderTop() - windowInfo.getBorderBottom());
    }

    @Override
    public KeyListener getKeyListener() {
        return null;
    }

    @Override
    public MouseListener getMouseListener() {
        return null;
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawImage(image, 0, 0, null);
    }

    @Override
    public void update(GameController gameController) {

    }

    @Override
    public Type getType() {
        return Type.other;
    }

}
