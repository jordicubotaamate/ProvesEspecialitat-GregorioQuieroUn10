package com.egm.ftnometeor.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.egm.ftnometeor.FTnoMeteor;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 272;
        config.height = 408;
		new LwjglApplication(new FTnoMeteor(), config);
	}
}
