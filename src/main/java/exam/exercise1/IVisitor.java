package exam.exercise1;

public interface IVisitor {
    void realizarGasto(LaPaz laPaz);
    void realizarGasto(Cochabamba cochabamba);
    void realizarGasto(SantaCruz santaCruz);
}
