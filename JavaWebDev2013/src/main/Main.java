package main;

import functions.DecreaseByOne;
import functions.Double;
import functions.Function;
import functions.FunctionsCollection;
import functions.GetAnswerToLife;
import functions.GigiLikesShaorma;
import functions.IncreaseByOne;
import functions.Perfect;
import functions.RandomNumber;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test Function
		Function decreaseByOne = new DecreaseByOne();
		Function doublenr = new Double();
		Function getAnswerToLife = new GetAnswerToLife();
		Function gigiLikesShaorma = new GigiLikesShaorma();
		Function increaseByOne = new IncreaseByOne();
		Function perfect = new Perfect();
		Function randomNumber = new RandomNumber();
		
		// Test Collection
		FunctionsCollection coll = new FunctionsCollection();
		
		coll.add(decreaseByOne);
		System.out.println(coll.getCollectionResult(1));
		
		coll.add(perfect);
		System.out.println(coll.getCollectionResult(10));
		
		coll.add(randomNumber);
		System.out.println(coll.getCollectionResult(100));
		
		coll.add(gigiLikesShaorma);
		System.out.println(coll.getCollectionResult(10));
		
		coll.add(doublenr);
		System.out.println(coll.getCollectionResult(9));
		
		coll.add(getAnswerToLife);
		System.out.println(coll.getCollectionResult(14));
		
		coll.add(increaseByOne);
		System.out.println(coll.getCollectionResult(10));	
	}

}
