public class Chord{

	private int[6] notes;
	int strums;

}



public class Conductor extends guitartabListener {

	public int getNote(note){
		switch(note){
			case'E':
				return -20;
			case'A'
				return -15;
			case'D':
				return -10;
			case'G':
				return -5;
			case'b':
				return -1;
			case'e':
				return 4;

		}
	return 404;
	}


	int BPM;
	int fretCount = 1;
	boolean found = false;
	@Override
	void enterString(guitartabParser.StringContext ctx){
		found = false;
		fretCount = 1;
		int note = getNote(ctx








