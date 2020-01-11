package tang;

public class Card implements Comparable<Card> {
	private String suitName;
	private int sequence;
	
	public Card(String suitName, int sequence) 
	{
		
		this.suitName = suitName;
		this.sequence = sequence;
	}

	public String getSuitName() {
		return suitName;
	}

	public void setSuitName(String suitName) {
		this.suitName = suitName;
	}

	public String getNumber()
	{
		if(this.sequence==13)
			return "K";
		else if(this.sequence==12)
			return "Q";
		else if(this.sequence==11)
			return "J";
		else if(this.sequence == 1)
			return "A";
		else
			return ""+sequence;
		
	}
	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	@Override
	public int compareTo(Card o) {
		if(this.getSequence()==2)
		{
			if(o.getSequence()!=2)
				return 1;
			else
				return 0;
		}
		else if(this.getSequence()==1)
		{
			if(o.getSequence()==2)
				return -1;
			else if(o.getSequence()==1)
				return 0;
			else
				return 1;
		}
		else
		{
			if(o.getSequence()==2||o.getSequence()==1)
				return -1;
			else if(this.getSequence()>o.getSequence())
				return 1;
			else if(this.getSequence()<o.getSequence())
				return -1;
			else
				return 0;
		}
	}
	
	

}
