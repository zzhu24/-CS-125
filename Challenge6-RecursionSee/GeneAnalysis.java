//UIUC CS125 FALL 2014 MP. File: GeneAnalysis.java, CS125 Project: Challenge6-RecursionSee, Version: 2015-03-30T09:35:13-0500.461573126
/**
 * @author zzhu24
 *
 */
public class GeneAnalysis
{
	/** Wrapper method. Returns the length of the longest 
	 * common subsequence
	 */
	public static int score(String gene1, String gene2)
	{char[] geneChar1 = gene1.toCharArray();
	char[] geneChar2 = gene2.toCharArray();
	return count(geneChar1,geneChar2,geneChar1.length-1,geneChar2.length-1);
		// Hint: Use toCharArray() to convert each string to a char array.
		 // call your recursive implementation here with
		// the genes as char arrays, starting at the end of each gene.
	}
	
	public static int count(char[] geneChar1, char[] geneChar2, int a, int b)
	{if ((a >= 0) && (b >= 0))
	{if (geneChar1[a] == geneChar2[b])
	return 1 + count (geneChar1, geneChar2, a-1, b-1);
	else
	{int count1 = count(geneChar1,geneChar2,a-1,b);
	int count2 = count(geneChar1,geneChar2,a,b-1);
	if (count1 >= count2) return count1;
	else return count2;}}
	return 0;}

	/** Implements longest common subsequence recursive search
The recursive case is defined as
					S(i-1, j)
S(i,j) = max {		S(i,j-1)
					S(i-1,j-1)
					S(i-1,j-1) +1 if gene1[i] = gene2[j]

NB  0<=i < gene1.length
    0<=j < gene2.length

You need to figure out the base case.
	 * */
//	define a private recursive Class method 'score' that 
//	returns an integer the score.
//	The method should take four parameters- 
//	two char arrays and two integers (gene1,gene2,i,j)
//	i and j are the indices into gene1 and gene2 respectively.

}
// Use local variables to store a recursive result so that you  do not need to calculate it again.

// Do not use a loops.
