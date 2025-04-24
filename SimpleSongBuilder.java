import java.util.*;	
	
	// Song class
	class Song
	{
		private LinkedList<Chord> chords = new LinkedList<>;
		private int bpm;
		
		public Song()
		{
			bpm = 120;
		}
		
		public Song(int bpm)
		{
			this.bpm = bpm;
		}
		
		public int getBpm()
		{
			return bpm;
		}
		
		public void setBpm(int bpm)
		{
			this.bpm = bpm;
		}
	}
	
	// Chord class
	class Chord
	{
		private int notes[6];
		private int strums;
		
		public Chord()
		{
			strums = 1;
		}
		
		public Chord(int strums)
		{
			this.strums = strums;
		}
		
		public int getStrums()
		{
			return strums;
		}
		
		public void setStrums(int strums)
		{
			this.strums = strums;
		}
	}
	
	// Channel class
	class Channel
	{
		private LinkedList<int> notes = new LinkedList<>;
		
		public Channel(){}
	}

public class SimpleSongBuilder extends guitartabBaseListener 
{
	public void prettyPrint()
	{
           // Print all symbol tables in the order they were created
	       System.out.println("prettyPrint(): Not Implemented");
	}
}
