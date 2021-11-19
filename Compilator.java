package Main;

//абстрактный класс "компилятор"
public abstract class Compilator {

    /**
     * Пуск компиляции
     * @param file - файл для компиляции
     */
    public abstract void start(String file);

    /**
     * Абстрактный метод лексического анализа
     */
    public abstract void lexicalAnalysis();

    /**
     * Абстрактный метод синтаксического анализа
     */
    public abstract void syntacticAnalysis();

    /**
     * Абстрактный метод оптимизации
     */
    public abstract void optimization();

    /**
     * Абстрактный метод Генерации кода
     */
    public abstract void codeGeneration();



}
