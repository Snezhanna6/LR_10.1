package Main;

//Компилятор Руби, наследник класса компилятор
public class RubyCompilator extends Compilator{

    @Override
    public void start(String file) {

        System.out.println("Начата компиляция " + file + " ......");
        lexicalAnalysis();
        syntacticAnalysis();
        optimization();
        codeGeneration();

    }

    //Реализация абстрактных методов

    @Override
    public void lexicalAnalysis(){
        System.out.println("$ Проведен лексический анализ $");
    }


    @Override
    public void syntacticAnalysis(){
        System.out.println("$ Проведен синтаксический анализ $");
    }


    @Override
    public void optimization(){
        System.out.println("$ Код оптимизирован $");
    }

    @Override
    public void codeGeneration(){
        System.out.println("$ Генерация кода выполнена $");
    }

}
