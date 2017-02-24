import java.awt.event.KeyEvent;

//UIUC CS125 FALL 2014 MP. File: RainGame.java, CS125 Project: PairProgramming, Version: 2015-02-23T21:44:23-0600.342136594
/**
 * @author cng10, ykang27, zzhu24
 * @received gzhen2, yzong2
 */
public class RainGame {

	public static void main(String[] args) {
		// To get points type your netids above (CORRECTLY-Please double check your partner correctly spells your netid correctly!!)
		// Your netid is the unique part of your @illinois email address
		// Do not put your name or your UIN. 
		// REMEMBER TO COMMIT this file...
	
		int x=0, y=0, dy=0, score = 0, level = 0,textspeed=4,count=1;
		String text = "";
		String leveltext;
		boolean a = false;
		boolean b = false;
		long startTime =System.currentTimeMillis();
		while (Zen.isRunning()) {
			if (!b){
				Zen.setColor(240, 35, 69);
				Zen.setFont("Times-20");
				Zen.drawText("Enter the level (between 1 to 10)" ,Zen.getZenWidth()/2,Zen.getZenHeight()/2);
				Zen.drawText("Press Enter to continue" ,Zen.getZenWidth()/2,Zen.getZenHeight()/2+20);
			}
			Zen.flipBuffer();
			leveltext = Zen.getEditText();
		if(Zen.isVirtualKeyPressed(KeyEvent.VK_ENTER)){
			Zen.flipBuffer();
			level=Integer.parseInt(leveltext);
			Zen.setEditText("");
			a=true;
			b=true;
			if (level == 1) textspeed=4; 
			else if (level !=1 ) textspeed=4+(2*(level-1));
			}
		if (a){
			if (text.length() == 0) {
				x = Zen.getZenWidth()/2;
				if (level>=4){x = (int) (Math.random()*(Zen.getZenWidth()-300+1))+200;}
				y = 0;
				dy = textspeed;
				text = "" + (int) (Math.random() * 999);
				long elapsed = System.currentTimeMillis() - startTime;
				startTime = System.currentTimeMillis();
				score += 3000/elapsed;
				count++;
			}
			Zen.setColor(107, 198, 243);
			Zen.fillRect(0, 0, Zen.getZenWidth(), Zen.getZenHeight());
			Zen.setColor(240, 35, 69);
			Zen.setFont("Times-30");
			Zen.drawText(text, x, y);
			Zen.drawText("Level: " +level + " (+" + textspeed + ")",0,40);
			Zen.drawText("Score: " + score,0,80);
			Zen.setFont("Times-20");
			Zen.drawText("Press Enter to Quit",0,Zen.getZenHeight()-10);
			y += dy;
			if (y==Zen.getZenHeight()){
				text = "" + (int) (Math.random() * 999);
				score-=1;
				y=0;
				}
			if (count % 10 == 0 && count > 1){
				count++;
				level +=1;
				textspeed+=2;
			}
			// Find out what keys the user has been pressing.
			String user = Zen.getEditText();
			Zen.setEditText("");
			for(int i=0;i < user.length();i++) {
				char c = user.charAt(i);
				if(c == text.charAt(0))
					text = text.substring(1,text.length()); // all except first character
			}
			Zen.sleep(90);// sleep for 90 milliseconds
		}
		}
	}
	
}