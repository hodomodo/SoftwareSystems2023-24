package lab_2;

public class WordProcessor implements Counter
{
	public WordProcessor(String sentence)
	{
		
	}

	@Override
	public int countWords(String sentence)
	{
		String sentenceWords = sentence.trim();
		int countWords = sentenceWords.split("\\s+").length;
		System.out.println(countWords);
		return countWords;
	}

	@Override
	public int countLetters(String sentence)
	{
		int countLetters = sentence.length();
		System.out.println(countLetters);
		return countLetters;
	}

	@Override
	public int getLength(String sentence)
	{
		int sentenceLength = sentence.split("\\s+").length;
		System.out.println(sentenceLength);
		return sentenceLength;
	}
	
}
