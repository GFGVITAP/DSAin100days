// Java representation of finding shortest 
// distance between node i and j 
import java.util.*;

class GFG
{
	
// prints the path between node i and node j 
static void ShortestPath(int i, int j, int k, int m, 
									int n) 
{ 
	// path1 stores path of node i to lca and 
	// path2 stores path of node j to lca 
	Vector<Integer> path1=new Vector<Integer>(), 
					path2=new Vector<Integer>(); 
	int x = m - 1; 

	// push node i in path1 
	path1.add(i); 

	// keep pushing parent of node labelled 
	// as i to path1 until lca is reached 
	while (x != k) 
	{ 
		path1.add(i / 2); 
		i = i / 2; 
		x--; 
	} 
	int y = n - 1; 

	// push node j to path2 
	path2.add(j); 

	// keep pushing parent of node j till 
	// lca is reached 
	while (y != k) 
	{ 
		path2.add(j / 2); 
		j = j / 2; 
		y--; 
	} 

	// printing path from node i to lca 
	for (int l = 0; l < path1.size(); l++) 
		System.out.print( path1.get(l) + " "); 

	// printing path from lca to node j 
	for (int l = path2.size() - 2; l >= 0; l--) 
		System.out.print( path2.get(l) + " "); 
	System.out.println();
} 

// returns the shortest distance between 
// nodes labelled as i and j 
static int ShortestDistance(int i, int j) 
{ 
	// vector to store binary form of i and j 
	Vector<Integer> v1=new Vector<Integer>(), 
					v2=new Vector<Integer>(); 

	// finding binary form of i and j 
	int p1 = i; 
	int p2 = j; 
	while (i != 0)
	{ 
		v1.add(i % 2); 
		i = i / 2; 
	} 
	while (j != 0)
	{ 
		v2.add(j % 2); 
		j = j / 2; 
	} 

	// as binary form will be in reverse order 
	// reverse the vectors 
	Collections.reverse(v1); 
	Collections.reverse(v2); 

	// finding the k that is lca (i, j) 
	int m = v1.size(), n = v2.size(), k = 0; 
	if (m < n) 
	{ 
		while (k < m && v1.get(k) == v2.get(k)) 
			k++; 
	} 
	else
	{ 
		while (k < n && v1.get(k) == v2.get(k)) 
			k++; 
	} 

	ShortestPath(p1, p2, k - 1, m, n); 
	return m + n - 2 * k; 
} 

public static void main(String args[])
{ 
	System.out.println( ShortestDistance(1, 2) ); 
	System.out.println(ShortestDistance(4, 3) ); 
}
}
