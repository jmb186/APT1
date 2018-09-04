
public class CirclesCountry {
	public int leastBorders(int[] x,int[] y,int[] r,
							int x1, int y1, int x2, int y2) {
		int numBorders = 0;
		for(int k=0;k<x.length;k++) {
			int dist1;
			dist1 = (int) (Math.pow(x[k]-x1,2) + Math.pow(y[k]-y1, 2));
			int dist2;
			dist2 = (int) (Math.pow(x[k]-x2,2) + Math.pow(y[k]-y2, 2));
			int r2=r[k]*r[k];			
			if((dist1 < r2 || dist2 < r2)&& ! (dist1 < r2 && dist2 < r2)) {
				numBorders += 1;
			}
		}
		return numBorders;
	}
}
