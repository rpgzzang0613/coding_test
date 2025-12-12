package programmers;


import java.lang.reflect.InvocationTargetException;

public class ProgrammersQuizFactory {

    public static ProgrammersQuiz create(String className)
            throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> quizClass = Class.forName("programmers.lv_1." + className);
        return (ProgrammersQuiz) quizClass.getDeclaredConstructor().newInstance();
    }

}
