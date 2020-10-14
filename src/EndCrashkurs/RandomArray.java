package EndCrashkurs;

/**
 * Frage 6:
 *
 * Schreiben Sie eine Methode die zwei Integer übernimmt und dann ein Array erzeugt und mit Zufallszahlen füllt. Die erste übergebene Ganzzahl gibt die Größe des Arrays an. Die zweite Ganzzahl z gibt an, in welchem Intervall sich die Zufallszahlen befinden: [0; z[. Das Array soll von Methode an den Aufrufer zurückgegeben werden.
 *
 * Zum Beispiel:
 * jshell> randomArray(2, 10)
 * $41 ==> double[2] { 2.393392496512059, 5.932904395539226 }
 * jshell> randomArray(3, 42)
 * $42 ==> double[3] { 7.405750946966645, 36.64869964917949,
 * 23.282033438183536 }
 */
public class RandomArray {
    public static void main(String[] args) {
        randomArray(2, 10);
        randomArray(3, 42);
    }

    /**
     * Meine Lösung.
     */
    static double[] randomArray(int aSize, int aUpperBound) {
        double[] ret = new double[aSize];
        for ( int i=0; i<aSize; i++ ) {
            ret[i] = Math.random() * aUpperBound;
        }
        return ret;
    }

    /**
     * Lösung des Tutors.
     */
    double[] randomArrayTutor(int aSize, int aUpperBound) {
        double[] array = new double[aSize];
        int i = 0;
        while ( i < array.length ) {
            array[i] = Math.random() * aUpperBound;
            i++;
        }
        return array;
    }
}
