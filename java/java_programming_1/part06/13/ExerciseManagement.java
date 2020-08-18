import java.util.ArrayList;

public class ExerciseManagement
{
    private ArrayList<Exercise> exercises;

    public ExerciseManagement()
    {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList()
    {
        ArrayList<String> exerciseList = new ArrayList<>();

        for (Exercise exercise : exercises)
        {
            exerciseList.add(exercise.getName());
        }

        return exerciseList;
    }

    public void add(String exercise)
    {
        this.exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exercise)
    {
        for (Exercise exerciseLoopVariable : exercises)
        {
            if (exerciseLoopVariable.getName().equals(exercise))
            {
                exerciseLoopVariable.setCompleted(true);
                break;
            }
        }
    }

    public boolean isCompleted(String exercise)
    {
        for (Exercise exerciseLoopVariable : exercises)
        {
            if (exerciseLoopVariable.getName().equals(exercise))
            {
                return exerciseLoopVariable.isCompleted();
            }
        }

        return false;
    }
}
