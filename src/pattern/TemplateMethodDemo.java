package pattern;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        Generalization algorithm = new Realization();
        algorithm.findSolution();
    }}