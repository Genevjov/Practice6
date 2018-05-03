package ua.nure.dlubovskyi.Practice6.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// you can extend this class from one of the core container
// or aggregate it inside of class 
public class WordContainer {
	private List<Word> words = new ArrayList<>();

	public WordContainer() {
	}

	public void add(String input) {
		String[] words = input.split(" ");
		for (String word : words) {
			Word wordObj = new Word(word);
			if (this.words.contains(wordObj)) {
				this.words.get(this.words.indexOf(wordObj)).upFrequency();
			} else {
				this.words.add(wordObj);
			}
		}
	}

	public List<Word> getWords() {
		return words;
	}

	public void sort() {
		Collections.sort(words);
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Word word : words) {
			result.append(word.toString() + "\n");
		}
		return result.toString();
	}
}
