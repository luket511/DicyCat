package com.dicycat.kroy.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dicycat.kroy.Kroy;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Kroy.width;
		config.height = Kroy.height;
		config.resizable = true;	//Mic:changed to true
		
		new LwjglApplication(new Kroy(), config);
	}
}