import java.util.*;	
	



public class SimpleSongBuilder extends guitartabBaseListener 
{

	//LinkedList<Integer>[] numbers = new LinkedList<Integer>[6] ;
	ArrayList<LinkedList<Integer>> numbers = new ArrayList<LinkedList<Integer>>();
	LinkedList<Integer> strumNums = new LinkedList<>();
	int stringCount = 0;
	int fretCount = 0;
	int chordCount = 0;
	boolean isFound = false;
	Integer currentNote;
	int strums;
	int bpm = 120;

public SimpleSongBuilder() {
        for (int i = 0; i < 6; i++) {
            numbers[i] = new LinkedList<>();
        }
    }

public void prettyPrint()
    {
        // Print the contents of a tidal file to stdout. The Micro.sh script can route it to a file
        //System.out.println("prettyPrint(): Not Implemented");
        System.out.print("hush\n\n");
        System.out.print("setcps(" + bpm + "/60/4)\n\n");
        for (int i = 0; i < 5; i++)
        {
            System.out.print("d" + i+1 + " slow " + numbers.get(i).size() + " $ note \"");
            for (int noteValue : numbers.get(i))
            {
                System.out.print("[");
                for (int j = 0; j < strumNums.get(i); j++)
                {
                    System.out.print(noteValue + " ");
                }
                System.out.print("] ");
            }
            System.out.print("\" # sound \"superpiano\"\n\n");
        }

    }

	@Override
	public void enterString(guitartabParser.StringContext ctx){


	isFound = false;
	fretCount = 0;


	}

	@Override
	public void exitString(guitartabParser.StringContext ctx){

	if(isFound == false){
		numbers.get(stringCount).add(currentNote);
	}

	stringCount++;
	}

	@Override
	public void enterBpm(guitartabParser.BpmContext ctx){

		bpm = Integer.parseInt(ctx.getText());

	}

	@Override
	public void enterNote(guitartabParser.NoteContext ctx){
		currentNote = noteMap(ctx.getText());
	}


	@Override
	public void enterFinger(guitartabParser.FingerContext ctx){
	String finger = ctx.getText();
	if(finger.equals("x")){
		numbers.get(stringCount).add(currentNote + fretCount);
	}
	else{
		numbers.get(stringCount).add(null);
	}

	isFound = true;
	}


	@Override
	public void enterTab(guitartabParser.TabContext ctx)
{

		chordCount++;
		stringCount = 0;
		String num = ctx.num_strums().getText();
		if(!num.equals("")){
			strumNums.add(Integer.parseInt(num));
		}
		else{
			strumNums.add(1);
		}
	}

	@Override
	public void enterPosition(guitartabParser.PositionContext ctx){

	fretCount++;

	}

	private Integer noteMap(String note){



		switch(note){

			case "e":
				return 4;
			case "B":
				return -1;
			case "G":
				return -5;
			case "D":
				return -10;
			case "A":
				return -15;
			case "E":
				return -20;
		}
		return null;
	}
	
}
