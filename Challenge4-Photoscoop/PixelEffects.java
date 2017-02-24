//UIUC CS125 FALL 2014 MP. File: PixelEffects.java, CS125 Project: Challenge4-Photoscoop, Version: 2015-02-22T23:50:31-0600.728483840

/* A class to implement the various pixel effects.
 *
 * Todo: Put your netid (i.e. username) in the line below
 * 
 * @author zzhu24
 */
public class PixelEffects {

	/** Copies the source image to a new 2D integer image */
	public static int[][] copy(int[][] source) {
	int tgtW = source.length;
	int tgtH = source[0].length;
	int[][] tgtPicture = new int[tgtW][tgtH];
	// Create a NEW 2D integer array and copy the colors across
	// See red eye code below
	for (int tgtX = 0; tgtX <= (tgtW - 1); tgtX++)
	{for (int tgtY = 0; tgtY <= (tgtH - 1); tgtY++)
	{tgtPicture[tgtX][tgtY] = source[tgtX][tgtY];
	}}
	return tgtPicture; }
	// Fix Me
	
	/**
	 * Resize the array image to the new width and height
	 * You are going to need to figure out how to map between a pixel
	 * in the destination image to a pixel in the source image
	 * @param source
	 * @param newWidth
	 * @param newHeight
	 * @return
	 */
	
	public static int[][] resize(int[][] source, int newWidth, int newHeight) {
	int resizeW = source.length;
	int resizeH = source[0].length;
	int[][] output = new int[newWidth][newHeight];
	
	for(int i = 0; i <= (newWidth - 1); i++)
	{for (int j = 0; j <= (newHeight - 1); j++)
	{int srcX = (int) ((i/(double) newWidth ) * resizeW);
	int srcY = (int) ((j/(double) newHeight ) * resizeH);
	output[i][j] = source [srcX][srcY];}}
	return output;}
	// Fix Me
	// Hints: Use two nested for loops between 0... newWidth-1 and 0.. newHeight-1 inclusive.
	// Hint: You can just use relative proportion to calculate the x (or y coordinate)  in the original image.
	// For example if you're setting a pixel halfway across the image, you should be reading half way across the original image too.

	/**
	 * Half the size of the image. This method should be just one line! Just
	 * delegate the work to resize()!
	 */
	public static int[][] half(int[][] source) {
	return resize(source, (source.length)/2, (source[0].length)/2); }
	// Fix Me
	
	
	/**
	 * Create a new image array that is the same dimesions of the reference
	 * array. The array may be larger or smaller than the source. Hint -
	 * this methods should be just one line - delegate the work to resize()!
	 * 
	 * @param source
	 *            the source image
	 * @param reference
	 * @return the resized image
	 */
	
	public static int[][] resize(int[][] source, int[][] reference) {
	return resize(source, reference.length, reference[0].length); }
	// Fix Me
	

	/** Flip the image vertically */
	public static int[][] flip(int[][] source) {
	int[][] output = new int[source.length][source[0].length];
	for (int i = 0; i <=(output.length - 1); i++)
	{for (int j = 0; j <=(output[0].length -1 ); j++)
	{output[i][j] = source[i][output[0].length-1-j];}}
	return output;}
	//Fix Me
	

	/** Reverse the image horizontally */
	public static int[][] mirror(int[][] source) {
	int[][] output = new int[source.length][source[0].length];
	for (int i = 0; i <=(output.length - 1); i++)
	{for (int j = 0; j <=(output[0].length -1 ); j++)
	{output[i][j] = source[output.length-1-i][j];}}
	return output;}
	// Fix Me
	
	/** Rotate the image */
	public static int[][] rotateLeft(int[][] source) {
	int[][] output = new int[source[0].length][source.length];
	for (int i = 0; i <=(output.length - 1); i++)
	{for (int j = 0; j <=(output[0].length -1 ); j++)
	{output[i][j] = source[output[0].length-1-j][i];}}
	return output;}

	/** Merge the red,blue,green components from two images */
	public static int[][] merge(int[][] sourceA, int[][] sourceB) {
	int[][]	merge = new int[sourceA.length][sourceA[0].length];
	int width = sourceA.length,
	height = sourceA[0].length;
	int[][] backgroundImage = PixelEffects.resize(sourceB, sourceA);
	for (int i = 0; i <= (width - 1); i++)
	{for (int j = 0; j <= (height - 1); j++)
	{int rgb1 = sourceA[i][j];
	int red1 = RGBUtilities.toRed(rgb1);
	int green1 = RGBUtilities.toGreen(rgb1);
	int blue1 = RGBUtilities.toBlue(rgb1);
	int rgb2 = backgroundImage[i][j];
	int red2 = RGBUtilities.toRed(rgb2);
	int green2 = RGBUtilities.toGreen(rgb2);
	int blue2 = RGBUtilities.toBlue(rgb2);
	merge[i][j] = RGBUtilities.toRGB((red1 + red2)/2, (green1 + green2)/2, (blue1 + blue2)/2);}}
	// The output should be the same size as the input. Scale (x,y) values
	// when reading the background
	// (e.g. so the far right pixel of the source is merged with the
	// far-right pixel of the background).
	return merge;}

	/**
	 * Replace the green areas of the foreground image with parts of the back
	 * image
	 */
	public static int[][] chromaKey(int[][] foreImage, int[][] backImage) {
	int[][] chromaKey = PixelEffects.resize(foreImage, backImage);
	int width = chromaKey.length,
	height = chromaKey[0].length;
	for (int i = 0; i <= (width - 1); i++)
	{for (int j = 0; j <= (height - 1); j++)
	{int rgb = chromaKey[i][j];
	int red = RGBUtilities.toRed(rgb);
	int green = RGBUtilities.toGreen(rgb);
	int blue = RGBUtilities.toBlue(rgb);
	if (((green > 60 && (green - red) > 50 || (green-blue) > 50) || green > Math.max(red, blue) || green > (red + blue)) && (green + red)<350)
	{chromaKey[i][j] = backImage[i][j];}}}
	// If the image has a different size than the background use the
	// resize() method
	// create an image the same as the background size.
	return chromaKey;
	}

	/** Removes "red eye" caused by a camera flash. sourceB is not used */
	public static int[][] redeye(int[][] source, int[][] sourceB) {
    int width = source.length, height = source[0].length;
	int[][] result = new int[width][height];
	for (int i = 0; i < width; i++)
	for (int j = 0; j < height; j++) {
	int rgb = source[i][j];
	int red = RGBUtilities.toRed(rgb);
	int green = RGBUtilities.toGreen(rgb);
	int blue = RGBUtilities.toBlue(rgb);
	if (red > 4 * Math.max(green, blue) && red > 64)
	red = green = blue = 0;
	result[i][j] = RGBUtilities.toRGB(red, green, blue);}
	return result;}
	
    /* Up to you! do something fun to the image */
	public static int[][] funky(int[][] source, int[][] sourceB) {
	int[][] funky = PixelEffects.resize(source, sourceB);
	int width = funky.length,
	height = funky[0].length;
	for (int i = 0; i <= (width - 1); i++)
	{for (int j = 0; j <= (height - 1); j++)
	{int rgb = funky[i][j];
	int red = RGBUtilities.toRed(rgb);
	int green = RGBUtilities.toGreen(rgb);
	int blue = RGBUtilities.toBlue(rgb);
	funky[i][j] = RGBUtilities.toRGB(red, green, blue);}}
	return funky;}
	// You need to invent your own image effect
	// Minimum boring requirements to pass autograder:
	// Does not ask for any user input and returns a new 2D array
	// To do: remove this return null
    }
	