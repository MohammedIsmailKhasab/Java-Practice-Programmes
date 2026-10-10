package Constructor;

public class Subject {
    private String subjId;
    private String subjName;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subjId, String subjName, int maxMarks, int marksObtain) {
        this.subjId = subjId;
        this.subjName = subjName;
        this.maxMarks = maxMarks;
        this.marksObtain = marksObtain;
    }

    public String getSubjId()
    {
        return subjId;
    }

    public String getSubjName() {
        return subjName;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMaxMarks(int mm) {
        maxMarks = mm;
    }

    public void setMarksObtain(int m) {
        marksObtain = m;
    }

    boolean isQualified() {
        return marksObtain >= maxMarks / 10 * 4;
    }

    public String toString() {
        return "\nSubject ID:"+subjId + "\nName :"+subjName+"\nMarks Obtained :"+marksObtain;
    }
}
    class Scoop3 {
        public static void main(String[] args) {
            Subject subs[] = new Subject[3];
            subs[0] = new Subject("s101", "DS", 100,98);
            subs[1] = new Subject("s102", "Algorithm", 100,99);
            subs[2] = new Subject("s103", "OperatingSystems", 100,76);


            for (Subject s : subs) {
                System.out.println(s);
            }
        }
    }