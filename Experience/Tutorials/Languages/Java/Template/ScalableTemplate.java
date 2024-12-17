package Java.Template;

import java.util.Scanner;

interface Task {
    void execute();
}

class IntroTask implements Task {
    @Override
    public void execute() {
        System.out.println("Insert intro here");
    }
}

class HousekeepingTask implements Task {
    @Override
    public void execute() {
        System.out.println("Insert housekeeping here");
    }
}

class DetailedFunctionTask implements Task {
    private String userInput;

    public DetailedFunctionTask(String userInput) {
        this.userInput = userInput;
    }

    @Override
    public void execute() {
        // Perform detailed operations based on userInput
    }
}

public class ScalableTemplate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Task[] tasks = {new IntroTask(), new HousekeepingTask()};

        while (true) {
            try {
                for (Task task : tasks) {
                    task.execute();
                }

                String userInput = getInputs(scanner);
                Task detailedFunctionTask = new DetailedFunctionTask(userInput);
                detailedFunctionTask.execute();

                endOfTask();
            } 
            catch (Exception e) {
                System.out.println("Invalid input");
            }
            finally {
                scanner.close();
            }
        }
    }

    public static String getInputs(Scanner scanner) {
        System.out.println("Enter input here: ");
        return scanner.nextLine();
    }

    public static void endOfTask() {
       
    }
}