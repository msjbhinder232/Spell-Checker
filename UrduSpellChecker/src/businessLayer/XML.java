package DataBase_Layer;

/**
* Generate Mutants of Each Word Automatically:
* -> Mutants to cross varify the actual words
* -> Cat Mutates into Kat
* -> Site Mutates into Sit
*
* @author  Muhammad Saad Javed (20F-0349)
* @version 1.0
* @since   2022-11-22 
*/

public class XML 
{
	private String title;
	private String name;

	@Override
	public String toString() {
		return "Book [ Title=" + title
				+ ", Author Name=" + name + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return name;
	}

	public void setAuthorName(String name) {
		this.name = name;
	}

}
