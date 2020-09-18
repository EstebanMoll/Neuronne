package neur;

import java.util.Vector;

public class Perceptron {
	
	Vector<Double> w = new Vector<Double>();
	Vector<Vector<Integer>> x = new Vector<Vector<Integer>>(); 
	Vector<Integer> y = new Vector<Integer>();
	
	//biais
	double alpha = 0.1f;
	
	Perceptron(){
	}
	
	Perceptron(Vector<Double> w1, Vector<Vector<Integer>> x1, Vector<Integer> y1, double a){
		
		this.w = (Vector<Double>) w1.clone();
		this.x = (Vector<Vector<Integer>>)x1.clone();
		this.y = (Vector<Integer>)y1.clone();
		this.alpha = a;
		
	}
	
	private int Threshold(int j) {
		
		double res = 0;
		
		for(int i = 0; i < this.w.size(); i++) {
			
			res += this.w.get(i) * this.x.get(j).get(i);

		}
		
		if (res >=0) {
			
			return 1;
			
		}
		else {
			
			return 0;
		}

	}
	
	private void ajust(int j, int hx) {
		
		for(int i = 0; i < this.w.size(); i++){
			
			double v = this.w.get(i) + this.alpha * (this.y.get(j) - hx) * this.x.get(j).get(i);
			v = (double)Math.round(v * 100000) / 100000 ;
			
			this.w.set(i, v);

		}
		System.out.println(this.w);
		
	}
	
	public void Percept() {
		
		boolean change = true;
		int j = 0;
		int h;
		
		while(change && j < 100) {
			change = false;
			for(int i = 0; i < this.x.size(); i++) {
				
				h = this.Threshold(i);
				
				if (h != this.y.get(i)){
					
					this.ajust(i, h);
					change = true;
					
				}
			}
			j++;
		}
		
		if(change == false) {
			
			System.out.println("Le vecteur final est w : " + w);
			
		}
		else {
			
			System.out.println("Il y a trop d'iteration");
			
		}
		
	}

}
