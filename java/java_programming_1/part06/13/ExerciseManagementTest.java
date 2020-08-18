import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseManagementTest
{
    private ExerciseManagement exerciseManagement;

    @Before
    public void initialize()
    {
        exerciseManagement = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning()
    {
        assertEquals(0, exerciseManagement.exerciseList().size());
    }

    @Test
    public void addExerciseGrowingListByOne()
    {
        exerciseManagement.add("Write a test");
        assertEquals(1, exerciseManagement.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList()
    {
        exerciseManagement.add("Write a test");
        assertTrue(exerciseManagement.exerciseList().contains("Write a test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted()
    {
        exerciseManagement.add("New exercise");
        exerciseManagement.markAsCompleted("New exercise");
        assertTrue(exerciseManagement.isCompleted("New exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted()
    {
        exerciseManagement.add("New exercise");
        exerciseManagement.markAsCompleted("New exercise");
        assertFalse(exerciseManagement.isCompleted("Some exercise"));
    }
}
