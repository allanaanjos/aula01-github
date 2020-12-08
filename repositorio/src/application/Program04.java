package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program04 {

	public static void main(String[] args) throws ParseException {
	   
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1  =  new Comment("have a nice trip! "); 
		
		Comment c2 = new Comment("wow that�s awesome");
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "traveling to new zealand", "i�m going to visite this wordeful country!", 12);
		
		p1.addComment(c1);
		p1.addComment(c2); 
		
		Comment c3 = new Comment("good night!");
		Comment c4 = new Comment("vai filha da puta");
		
		Post p2 =  new Post(sdf.parse("28/07/2018 17:09:08"), "toma no cu, filho da puta", "vai sua vagabunda!!", 33); 
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1); 
		System.out.println(p2);
		
		
		

	}

}
