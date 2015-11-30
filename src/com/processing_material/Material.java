/**
 * ##library.Material##
 * ##library.sentence##
 * ##library.url##
 *
 * Copyright ##copyright## ##author##
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 * 
 * @author      ##Jordan Hatcher##
 * @modified    ##25/11/2015##
 * @version     ##library.prettyVersion## (##library.version##)
 */

package com.processing_material;


import processing.core.*;
import java.util.LinkedHashMap;

/**
 * This is a template class and can be used to start a new processing library or tool.
 * Make sure you rename this class as well as the name of the example package 'template' 
 * to your own library or tool naming convention.
 * 
 * (the tag example followed by the name of an example included in folder 'examples' will
 * automatically include the example in the javadoc.)
 *
 * @example Hello 
 */

public class Material implements PConstants{
	
	// parent is a reference to the parent sketch
	PApplet parent;
	
	public final static String VERSION = "##library.Material##";
	
	public final int RED_50 = 0xFFFFEBEE;
	public final int RED_100 = 0xFFFFCDD2;
	public final int RED_200 = 0xFFEF9A9A;
	public final int RED_300 = 0xFFE57373;
	public final int RED_400 = 0xFFef5350;
	public final int RED_500 = 0xFFf44336;
	public final int RED_600 = 0xFFe53935;
	public final int RED_700 = 0xFFd32f2f;
	public final int RED_800 = 0xFFc62828;
	public final int RED_900 = 0xFFb71c1c;
	public final int RED_A100 = 0xFFff8a80;
	public final int RED_A200 = 0xFFff5252;
	public final int RED_A400 = 0xFFff1744;
	public final int RED_A700 = 0xFFd50000;

	public final int PINK_50 = 0xFFfce4ec;
	public final int PINK_100 = 0xFFf8bbd0;
	public final int PINK_200 = 0xFFf48fb1;
	public final int PINK_300 = 0xFFf06292;
	public final int PINK_400 = 0xFFec407a;
	public final int PINK_500 = 0xFFe91e63;
	public final int PINK_600 = 0xFFd81b60;
	public final int PINK_700 = 0xFFc2185b;
	public final int PINK_800 = 0xFFad1457;
	public final int PINK_900 = 0xFF880e4f;
	public final int PINK_A100 = 0xFFff80ab;
	public final int PINK_A200 = 0xFFff4081;
	public final int PINK_A400 = 0xFFf50057;
	public final int PINK_A700 = 0xFFc51162;

	public final int PURPLE_50 = 0xFFf3e5f5;
	public final int PURPLE_100 = 0xFFe1bee7;
	public final int PURPLE_200 = 0xFFce93d8;
	public final int PURPLE_300 = 0xFFba68c8;
	public final int PURPLE_400 = 0xFFab47bc;
	public final int PURPLE_500 = 0xFF9c27b0;
	public final int PURPLE_600 = 0xFF8e24aa;
	public final int PURPLE_700 = 0xFF7b1fa2;
	public final int PURPLE_800 = 0xFF6a1b9a;
	public final int PURPLE_900 = 0xFF4a148c;
	public final int PURPLE_A100 = 0xFFea80fc;
	public final int PURPLE_A200 = 0xFFe040fb;
	public final int PURPLE_A400 = 0xFFd500f9;
	public final int PURPLE_A700 = 0xFFaa00ff;

	public final int DEEP_PURPLE_50 = 0xFFede7f6;
	public final int DEEP_PURPLE_100 = 0xFFd1c4e9;
	public final int DEEP_PURPLE_200 = 0xFFb39ddb;
	public final int DEEP_PURPLE_300 = 0xFF9575cd;
	public final int DEEP_PURPLE_400 = 0xFF7e57c2;
	public final int DEEP_PURPLE_500 = 0xFF673ab7;
	public final int DEEP_PURPLE_600 = 0xFF5e35b1;
	public final int DEEP_PURPLE_700 = 0xFF512da8;
	public final int DEEP_PURPLE_800 = 0xFF4527a0;
	public final int DEEP_PURPLE_900 = 0xFF311b92;
	public final int DEEP_PURPLE_A100 = 0xFFb388ff;
	public final int DEEP_PURPLE_A200 = 0xFF7c4dff;
	public final int DEEP_PURPLE_A400 = 0xFF651fff;
	public final int DEEP_PURPLE_A700 = 0xFF6200ea;

	public final int INDIGO_50 = 0xFFe8eaf6;
	public final int INDIGO_100 = 0xFFc5cae9;
	public final int INDIGO_200 = 0xFF9fa8da;
	public final int INDIGO_300 = 0xFF7986cb;
	public final int INDIGO_400 = 0xFF5c6bc0;
	public final int INDIGO_500 = 0xFF3f51b5;
	public final int INDIGO_600 = 0xFF3949ab;
	public final int INDIGO_700 = 0xFF303f9f;
	public final int INDIGO_800 = 0xFF283593;
	public final int INDIGO_900 = 0xFF1a237e;
	public final int INDIGO_A100 = 0xFF8c9eff;
	public final int INDIGO_A200 = 0xFF536dfe;
	public final int INDIGO_A400 = 0xFF3d5afe;
	public final int INDIGO_A700 = 0xFF304ffe;

	public final int BLUE_50 = 0xFFe3f2fd;
	public final int BLUE_100 = 0xFFbbdefb;
	public final int BLUE_200 = 0xFF90caf9;
	public final int BLUE_300 = 0xFF64b5f6;
	public final int BLUE_400 = 0xFF42a5f5;
	public final int BLUE_500 = 0xFF2196f3;
	public final int BLUE_600 = 0xFF1e88e5;
	public final int BLUE_700 = 0xFF1976d2;
	public final int BLUE_800 = 0xFF1565c0;
	public final int BLUE_900 = 0xFF0d47a1;
	public final int BLUE_A100 = 0xFF82b1ff;
	public final int BLUE_A200 = 0xFF448aff;
	public final int BLUE_A400 = 0xFF2979ff;
	public final int BLUE_A700 = 0xFF2962ff;

	public final int LIGHT_BLUE_50 = 0xFFe1f5fe;
	public final int LIGHT_BLUE_100 = 0xFFb3e5fc;
	public final int LIGHT_BLUE_200 = 0xFF81d4fa;
	public final int LIGHT_BLUE_300 = 0xFF4fc3f7;
	public final int LIGHT_BLUE_400 = 0xFF29b6f6;
	public final int LIGHT_BLUE_500 = 0xFF03a9f4;
	public final int LIGHT_BLUE_600 = 0xFF039be5;
	public final int LIGHT_BLUE_700 = 0xFF0288d1;
	public final int LIGHT_BLUE_800 = 0xFF0277bd;
	public final int LIGHT_BLUE_900 = 0xFF01579b;
	public final int LIGHT_BLUE_A100 = 0xFF80d8ff;
	public final int LIGHT_BLUE_A200 = 0xFF40c4ff;
	public final int LIGHT_BLUE_A400 = 0xFF00b0ff;
	public final int LIGHT_BLUE_A700 = 0xFF0091ea;

	public final int CYAN_50 = 0xFFe0f7fa;
	public final int CYAN_100 = 0xFFb2ebf2;
	public final int CYAN_200 = 0xFF80deea;
	public final int CYAN_300 = 0xFF4dd0e1;
	public final int CYAN_400 = 0xFF26c6da;
	public final int CYAN_500 = 0xFF00bcd4;
	public final int CYAN_600 = 0xFF00acc1;
	public final int CYAN_700 = 0xFF0097a7;
	public final int CYAN_800 = 0xFF00838f;
	public final int CYAN_900 = 0xFF006064;
	public final int CYAN_A100 = 0xFF84ffff;
	public final int CYAN_A200 = 0xFF18ffff;
	public final int CYAN_A400 = 0xFF00e5ff;
	public final int CYAN_A700 = 0xFF00b8d4;
	
	public final int TEAL_50 = 0xFFe0f2f1;
	public final int TEAL_100 = 0xFFb2dfdb;
	public final int TEAL_200 = 0xFF80cbc4;
	public final int TEAL_300 = 0xFF4db6ac;
	public final int TEAL_400 = 0xFF26a69a;
	public final int TEAL_500 = 0xFF009688;
	public final int TEAL_600 = 0xFF00897b;
	public final int TEAL_700 = 0xFF00796b;
	public final int TEAL_800 = 0xFF00695c;
	public final int TEAL_900 = 0xFF004d40;
	public final int TEAL_A100 = 0xFFa7ffeb;
	public final int TEAL_A200 = 0xFF64ffda;
	public final int TEAL_A400 = 0xFF1de9b6;
	public final int TEAL_A700 = 0xFF00bfa5;
	
	public final int GREEN_50 = 0xFFe8f5e9;
	public final int GREEN_100 = 0xFFc8e6c9;
	public final int GREEN_200 = 0xFFa5d6a7;
	public final int GREEN_300 = 0xFF81c784;
	public final int GREEN_400 = 0xFF66bb6a;
	public final int GREEN_500 = 0xFF4caf50;
	public final int GREEN_600 = 0xFF43a047;
	public final int GREEN_700 = 0xFF388e3c;
	public final int GREEN_800 = 0xFF2e7d32;
	public final int GREEN_900 = 0xFF1b5e20;
	public final int GREEN_A100 = 0xFFb9f6ca;
	public final int GREEN_A200 = 0xFF69f0ae;
	public final int GREEN_A400 = 0xFF00e676;
	public final int GREEN_A700 = 0xFF00c853;

	public final int LIGHT_GREEN_50 = 0xFFf1f8e9;
	public final int LIGHT_GREEN_100 = 0xFFdcedc8;
	public final int LIGHT_GREEN_200 = 0xFFc5e1a5;
	public final int LIGHT_GREEN_300 = 0xFFaed581;
	public final int LIGHT_GREEN_400 = 0xFF9ccc65;
	public final int LIGHT_GREEN_500 = 0xFF8bc34a;
	public final int LIGHT_GREEN_600 = 0xFF7cb342;
	public final int LIGHT_GREEN_700 = 0xFF689f38;
	public final int LIGHT_GREEN_800 = 0xFF558b2f;
	public final int LIGHT_GREEN_900 = 0xFF33691e;
	public final int LIGHT_GREEN_A100 = 0xFFccff90;
	public final int LIGHT_GREEN_A200 = 0xFFb2ff59;
	public final int LIGHT_GREEN_A400 = 0xFF76ff03;
	public final int LIGHT_GREEN_A700 = 0xFF64dd17;
	
	public final int LIME_50 = 0xFFf9fbe7;
	public final int LIME_100 = 0xFFf0f4c3;
	public final int LIME_200 = 0xFFe6ee9c;
	public final int LIME_300 = 0xFFdce775;
	public final int LIME_400 = 0xFFd4e157;
	public final int LIME_500 = 0xFFcddc39;
	public final int LIME_600 = 0xFFc0ca33;
	public final int LIME_700 = 0xFFafb42b;
	public final int LIME_800 = 0xFF9e9d24;
	public final int LIME_900 = 0xFF827717;
	public final int LIME_A100 = 0xFFf4ff81;
	public final int LIME_A200 = 0xFFeeff41;
	public final int LIME_A400 = 0xFFc6ff00;
	public final int LIME_A700 = 0xFFaeea00;

	public final int YELLOW_50 = 0xFFfffde7;
	public final int YELLOW_100 = 0xFFfff9c4;
	public final int YELLOW_200 = 0xFFfff59d;
	public final int YELLOW_300 = 0xFFfff176;
	public final int YELLOW_400 = 0xFFffee58;
	public final int YELLOW_500 = 0xFFffeb3b;
	public final int YELLOW_600 = 0xFFfdd835;
	public final int YELLOW_700 = 0xFFfbc02d;
	public final int YELLOW_800 = 0xFFf9a825;
	public final int YELLOW_900 = 0xFFf57f17;
	public final int YELLOW_A100 = 0xFFffff8d;
	public final int YELLOW_A200 = 0xFFffff00;
	public final int YELLOW_A400 = 0xFFffea00;
	public final int YELLOW_A700 = 0xFFffd600;
	
	public final int AMBER_50 = 0xFFfff8e1;
	public final int AMBER_100 = 0xFFffecb3;
	public final int AMBER_200 = 0xFFffe082;
	public final int AMBER_300 = 0xFFffd54f;
	public final int AMBER_400 = 0xFFffca28;
	public final int AMBER_500 = 0xFFffc107;
	public final int AMBER_600 = 0xFFffb300;
	public final int AMBER_700 = 0xFFffa000;
	public final int AMBER_800 = 0xFFff8f00;
	public final int AMBER_900 = 0xFFff6f00;
	public final int AMBER_A100 = 0xFFffe57f;
	public final int AMBER_A200 = 0xFFffd740;
	public final int AMBER_A400 = 0xFFffc400;
	public final int AMBER_A700 = 0xFFffab00;
	
	public final int ORANGE_50 = 0xFFfff3e0;
	public final int ORANGE_100 = 0xFFffe0b2;
	public final int ORANGE_200 = 0xFFffcc80;
	public final int ORANGE_300 = 0xFFffb74d;
	public final int ORANGE_400 = 0xFFffa726;
	public final int ORANGE_500 = 0xFFff9800;
	public final int ORANGE_600 = 0xFFfb8c00;
	public final int ORANGE_700 = 0xFFf57c00;
	public final int ORANGE_800 = 0xFFef6c00;
	public final int ORANGE_900 = 0xFFe65100;
	public final int ORANGE_A100 = 0xFFffd180;
	public final int ORANGE_A200 = 0xFFffab40;
	public final int ORANGE_A400 = 0xFFff9100;
	public final int ORANGE_A700 = 0xFFff6d00;
	
	public final int DEEP_ORANGE_50 = 0xFFfbe9e7;
	public final int DEEP_ORANGE_100 = 0xFFffccbc;
	public final int DEEP_ORANGE_200 = 0xFFffab91;
	public final int DEEP_ORANGE_300 = 0xFFff8a65;
	public final int DEEP_ORANGE_400 = 0xFFff7043;
	public final int DEEP_ORANGE_500 = 0xFFff5722;
	public final int DEEP_ORANGE_600 = 0xFFf4511e;
	public final int DEEP_ORANGE_700 = 0xFFe64a19;
	public final int DEEP_ORANGE_800 = 0xFFd84315;
	public final int DEEP_ORANGE_900 = 0xFFbf360c;
	public final int DEEP_ORANGE_A100 = 0xFFff9e80;
	public final int DEEP_ORANGE_A200 = 0xFFff6e40;
	public final int DEEP_ORANGE_A400 = 0xFFff3d00;
	public final int DEEP_ORANGE_A700 = 0xFFdd2c00;
	
	public final int BROWN_50 = 0xFFefebe9;
	public final int BROWN_100 = 0xFFd7ccc8;
	public final int BROWN_200 = 0xFFbcaaa4;
	public final int BROWN_300 = 0xFFa1887f;
	public final int BROWN_400 = 0xFF8d6e63;
	public final int BROWN_500 = 0xFF795548;
	public final int BROWN_600 = 0xFF6d4c41;
	public final int BROWN_700 = 0xFF5d4037;
	public final int BROWN_800 = 0xFF4e342e;
	public final int BROWN_900 = 0xFF3e2723;
	
	public final int GREY_50 = 0xFFfafafa;
	public final int GREY_100 = 0xFFf5f5f5;
	public final int GREY_200 = 0xFFeeeeee;
	public final int GREY_300 = 0xFFe0e0e0;
	public final int GREY_400 = 0xFFbdbdbd;
	public final int GREY_500 = 0xFF9e9e9e;
	public final int GREY_600 = 0xFF757575;
	public final int GREY_700 = 0xFF616161;
	public final int GREY_800 = 0xFF424242;
	public final int GREY_900 = 0xFF212121;
	
	public final int BLUE_GREY_50 = 0xFFeceff1;
	public final int BLUE_GREY_100 = 0xFFcfd8dc;
	public final int BLUE_GREY_200 = 0xFFb0bec5;
	public final int BLUE_GREY_300 = 0xFF90a4ae;
	public final int BLUE_GREY_400 = 0xFF78909c;
	public final int BLUE_GREY_500 = 0xFF607d8b;
	public final int BLUE_GREY_600 = 0xFF546e7a;
	public final int BLUE_GREY_700 = 0xFF455a64;
	public final int BLUE_GREY_800 = 0xFF37474f;
	public final int BLUE_GREY_900 = 0xFF263238;
	
	public final int BLACK = 0xFF000000;
	public final int WHITE = 0xFFFFFFFF;
	
	private LinkedHashMap<String, PGraphics> cache;
	
	/**
	 * @param parent
	 */
	public Material(PApplet parent) {
		this.parent = parent;
		cache = new LinkedHashMap<String, PGraphics>();
	}

	public void materialRect(float x, float y, float width, float height) {
		int fillColor = parent.g.fillColor;	
		int pgWidth = (int)width + 20;
		int pgHeight = (int)height + 20;
		PGraphics pg;

		String key = "1:" + Integer.toString((int)width) + ":" + Integer.toString((int)height);
		
		if(cache.containsKey(key)) {
			pg = cache.get(key);
		}else{
			pg = parent.createGraphics(pgWidth, pgHeight);
			pg.beginDraw();
			pg.noStroke();
			pg.fill(0, 100);
			pg.rect(10, 5, width, height);
			pg.filter(BLUR, 4);
			pg.endDraw();
			cache.put(key, pg);
		}

		parent.image(pg, x-10, y);
		parent.fill(fillColor);
		parent.rect(x, y, width, height);		
	}
	
	public void materialRect(int x, int y, int width, int height) {
		float fX = (float)x;
		float fY = (float)y;
		float fWidth = (float)width;
		float fHeight = (float)height;
		materialRect(fX, fY, fWidth, fHeight);
	}
	
	public void materialEllipse(float x, float y, float width, float height) {
		int fillColor = parent.g.fillColor;	
		int pgWidth = (int)width + 20;
		int pgHeight = (int)height + 20;
		PGraphics pg;

		String key = "1:" + Integer.toString((int)width) + ":" + Integer.toString((int)height);

		if(cache.containsKey(key)) {
			pg = cache.get(key);
		}else{
			pg = parent.createGraphics(pgWidth, pgHeight);
			pg.beginDraw();
			pg.smooth();
			pg.clear();
			pg.fill(0, 70);
			pg.ellipse(pgWidth/2, pgHeight/2, width, height);
			pg.filter(BLUR, 4);
			pg.endDraw();
			cache.put(key, pg);
		}
		
		parent.image(pg, x-(pgWidth/2), y-(pgHeight/2) + 5);
		parent.fill(fillColor);
	  	parent.ellipse(x, y, width, height);
	}
	
	public void materialEllipse(int x, int y, int width, int height) {
		float fX = (float)x;
		float fY = (float)y;
		float fWidth = (float)width;
		float fHeight = (float)height;
		materialEllipse(fX, fY, fWidth, fHeight);
	}

	/**
	 * return the version of the library.
	 * 
	 * @return String
	 */
	public static String version() {
		return VERSION;
	}
}

