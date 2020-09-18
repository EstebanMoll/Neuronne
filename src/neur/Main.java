package neur;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector<Double> w = new Vector<Double>();
		w.add(0.5);
		w.add(0.0);
		w.add(0.0);
		
		
		Vector<Integer> X = new Vector<Integer>();
		X.add(1);
		X.add(2);
		X.add(0);
		
		
		Vector<Integer> Y = new Vector<Integer>();
		Y.add(1);
		Y.add(0);
		Y.add(3);
		
		
		Vector<Integer> Z = new Vector<Integer>();
		Z.add(1);
		Z.add(3);
		Z.add(0);
		
		Vector<Integer> J = new Vector<Integer>();
		J.add(1);
		J.add(1);
		J.add(1);
		
		
		Vector<Vector<Integer>> x = new Vector<Vector<Integer>>();
		x.add(X);
		x.add(Y);
		x.add(Z);
		x.add(J);
		
		Vector<Integer> y = new Vector<Integer>();
		y.add(1);
		y.add(0);
		y.add(0);
		y.add(1);

		Perceptron p = new Perceptron(w,x,y,0.1);
		
		p.Percept();
		
	}

}
