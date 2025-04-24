import java.util.*;	
	

public class SimpleSongBuilder extends guitartabBaseListener 
{

	private LinkedList<int>[] numbers = new LinkedList<int>[] ;
	int stringCount = 0;
	int fretCount = 1;
	boolean isFound = false;
	String note;


	public void prettyPrint()
	{
           // Print the contents of a tidal file to stdout. The Micro.sh script can route it to a file
	       //System.out.println("prettyPrint(): Not Implemented");
		   
	}

	@Override
	void enterString(guitartabParser.StringContext ctx){


	isFound = false;
	fretCount = 1;


	}

	@Override
	void enterBpm(guitartabParser.BpmContext ctx){

		this.bpm = Integer.parseInt(ctx.getText());

	}

	@Override
	void enterNote(guitartabParser.NoteContext ctx){
		note = ctx.getText();
	}
