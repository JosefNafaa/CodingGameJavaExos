package smallInterval;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Principale {

	public static void main(String[] args) {
		List<Integer> tableau = new ArrayList<Integer>();
		tableau.add(1);
		tableau.add(5);
		tableau.add(7);
		tableau.add(9);
		
		List<Interval> interval = new ArrayList<Interval>();
        
		for(int i=0;i<tableau.size()-1;i++) {
			interval.add(new Interval(tableau.get(i), tableau.get(i+1), tableau.get(i+1)-tableau.get(i)));
		}
		Interval minDiff = interval
			      .stream()
			      .min(Comparator.comparing(Interval::getDiff))
			      .orElseThrow(NoSuchElementException::new);
		System.out.println(minDiff);
	}
	

}

class Interval {
	int rangeMin;
	int rangeMax;
	int diff;

	public Interval(int rangeMin, int rangeMax, int diff) {
		super();
		this.rangeMin = rangeMin;
		this.rangeMax = rangeMax;
		this.diff = diff;
	}

	public int getRangeMin() {
		return rangeMin;
	}

	public void setRangeMin(int rangeMin) {
		this.rangeMin = rangeMin;
	}

	public int getRangeMax() {
		return rangeMax;
	}

	public void setRangeMax(int rangeMax) {
		this.rangeMax = rangeMax;
	}

	public int getDiff() {
		return diff;
	}

	public void setDiff(int diff) {
		this.diff = diff;
	}

	@Override
	public String toString() {
		return "Interval [rangeMin=" + rangeMin + ", rangeMax=" + rangeMax + ", diff=" + diff + "]";
	}
	
	

}