//UIUC CS125 FALL 2014 MP. File: RecursiveKnight.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2015-04-23T13:50:12-0500.789891105
/**
* 
* @author zzhu24
*
*/

public class RecursiveKnight {

	/**
	 * This method recursively determines which 
	 * board positions the knight can reach in the
	 * next few moves.
	 * 
	 * Base cases: Return immediately if 
	 * 1) x or y are invalid
	 * i.e. visited[x][y] would cause IndexOutOfBounds exceptions.
	 * 
	 * or, 2) visited[x][y] is true and step is a positive integer
	 * i.e. The current coordinates do not represent a valid square that we can hop to.
	 * 
	 * or, 3) steps[x][y] already has a positive integer, which is less than the parameter value. 
	 * i.e. There is a shorter path to this point than the one we are considering.
	 *
	 *Recursive case:
	 *Update steps[x][y]
	 *Recursively call explore() using the eight possible knight moves
	 * {1,2},{-1,-2},{2,1} etc (Work it out!)
	 * 
	 * The recursive call will use a different step value
	 * because it will be evaluating the next move.
	 * 
	 * The 'visited' array is unchanged by this method:.
	 * Assume visited and steps are already initialized to a square array and are the same size.
	 */
	public static void explore(boolean[][] visited, int x, int y, int[][] steps, int step) {
	//Todo: Implement RecursiveKnight.explore
	if(x>visited.length-1||y>visited[0].length-1||x<0||y<0)
	return;
	if(visited[x][y]&&step>0)
	return;
	if(steps[x][y]<step&&steps[x][y]>0)
	return;
	steps[x][y]=step;
	explore(visited,x+1,y+1,steps,step+1);
	explore(visited,x+1,y+2,steps,step+1);
	explore(visited,x+1,y-1,steps,step+1);
	explore(visited,x+1,y-2,steps,step+1);
	explore(visited,x-1,y+1,steps,step+1);
	explore(visited,x-1,y+2,steps,step+1);
	explore(visited,x-1,y-1,steps,step+1);
	explore(visited,x-1,y-2,steps,step+1);
	explore(visited,x+2,y+1,steps,step+1);
	explore(visited,x+2,y+2,steps,step+1);
	explore(visited,x+2,y-1,steps,step+1);
	explore(visited,x+2,y-2,steps,step+1);
	explore(visited,x-2,y+1,steps,step+1);
	explore(visited,x-2,y+2,steps,step+1);
	explore(visited,x-2,y-1,steps,step+1);
	explore(visited,x-2,y-2,steps,step+1);
	// you can remove this line!
}	}
