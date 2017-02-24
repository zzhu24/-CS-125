//UIUC CS125 FALL 2014 MP. File: RobotLink.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2015-04-23T13:50:12-0500.789891105
/**
* 
* @author zzhu24
*
*/

public class RobotLink {

	private RobotLink next; 	
	private final Robot robot;

	public Robot getRobot() {
		return robot;
	}
	/** Constructs this link.
	 * @param next ; the next item in the chain (null, if there are no more items).
	 * @param robot ; a single robot (never null).
	 */
	public RobotLink(RobotLink next,Robot robot) {
		this.robot = robot;
		this.next = next;
	}

	/**
	 * Returns the number of entries in the linked list.
	 * @return number of entries.
	 */
	public int count() {
		if (next == null)
			return 1; // BASE CASE; no more recursion required!

		// Recursive case:
		return 1 + next.count();
	}
	/**
	 * Counts the number of flying robots in the linked list.
	 * Hint: robot.isFlying is useful here.
	 */
	public int countFlyingRobots() {
	int count=0;
	if(robot.isFlying()==true)
	count++; 
	if(next==null)
	{return count;}
	if(next!=null)
	count+=next.countFlyingRobots();		
	return count;}
	/**
	 * Counts the number of flying robots upto and excluding a sad robot.
	 * (i.e. do not count the sad robot if it is flying).
	 * If there are no sad robots this function will return the same value as countFlyingRobots().
	 * Hint: robot.isHappy() is useful.
	 */
	public int countFlyingRobotsBeforeSadRobot() {
	int count2=0;
	if(robot.isHappy()==false)
	return count2;
	if(robot.isFlying()==true)
	count2++;
	if(next==null)
	{return count2;}
	if(next!=null)		
	count2=count2 + next.countFlyingRobotsBeforeSadRobot();	
	return count2;}
	/** Creates a new LinkedList entry at the end of this linked list.
	 * Recursively finds the last entry then adds a new link to the end.
	 * @param robot - the robot value of the new last link
	 */
	public void append(Robot robot) {
	if(next==null)
	next=new RobotLink(null,robot);
	else
	next.append(robot);}
	/**
	 * Returns the first flying unhappy robot, or null
	 * if there are not robots that are flying and unhappy.
	 * @return
	 */
	public Robot getFirstFlyingUnhappyRobot() {
	if(next==null)
	return null;
	if(robot.isFlying()&&!robot.isHappy())
	return this.getRobot();
	return next.getFirstFlyingUnhappyRobot();}
	/**
	 * Returns the last flying unhappy robotn the linked list, or null
	 * if there are not robots that are flying and unhappy.
	 * @return
	 */
	public Robot getLastFlyingUnhappyRobot() {
	if(next==null)
	{return this.getRobot();}
	Robot checkNext = next.getLastFlyingUnhappyRobot();
	if(checkNext==null)
	{if(robot.isFlying()==true && robot.isHappy()==false)
	return this.getRobot();
	return null;}
	if(checkNext.isFlying()&&!checkNext.isHappy())
	{return checkNext;}
	if(this.getRobot().isFlying()&&!checkNext.isHappy())
	{return this.getRobot();}
	return null;}
	/**
	 * Returns a reference to the happy most distant explorer.
	 * Returns null if there are no happy robots
	 * @return reference to the most distant happy robot
	 */
	public Robot findHappyRobotFurthestFromHome() {
	if(next==null)
	{return this.getRobot();}
	Robot checkNext2 = next.findHappyRobotFurthestFromHome();
	if(checkNext2 == null)
	{if (robot.isHappy()==true)
	return this.getRobot();
	return null;}
	if(checkNext2.isHappy()==true)
	{if(checkNext2.getDistanceFromHome()>=this.getRobot().getDistanceFromHome())
	return checkNext2;}
	if(this.getRobot().isHappy()==true)
	return this.getRobot();
	return null;}
	/**
	 * Returns true if linked list contains the robot.
	 * Hint: Use robot.equals(other).
	 * @param robot
	 * @return
	 */
	public boolean contains(Robot other) {
	if (next==null)
	{if (this.getRobot().equals(other)==true)
	return true;
	return false;}
	if (this.getRobot().equals(other)==true)
	return true;
	return next.contains(other);}

	
}
