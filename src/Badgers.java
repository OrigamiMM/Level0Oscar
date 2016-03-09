public class Badgers {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			for (int d = 1; d < 13; d++) {
				System.out.println("Badgers");
				speak("Badgers");

				if (d == 12) {
					System.out.println("Mushroom" + "\n" + "Mushroom");
					speak("Mushroom Mushroom");
				}

			}
		}
		System.out.println("snake, oh a snake");
		speak("snake, oh a snake");
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
