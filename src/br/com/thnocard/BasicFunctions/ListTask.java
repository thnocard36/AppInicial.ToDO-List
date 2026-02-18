package br.com.thnocard.BasicFunctions;

import java.util.ArrayList;
import java.util.List;

public class ListTask {

    private List<Tasks> taskList;

    public ListTask() {
        this.taskList = new ArrayList<>(); // Se eu criar uma lista.. Por que não retornar essa lista?
    }

    // Metodo de adicionar uma nova tarefa
    public void addTask(String description) {
        taskList.add(new Tasks(description));
    }

    // Metodo de apagar uma nova tarefa
    public void deleteTask(String description) {
        List<Tasks> tasksToRemove = new ArrayList<>();
        for(Tasks task : taskList) {

            // Caso tenha tarefas repitidas, será deletado
            if(task.getDescription().equalsIgnoreCase(description)) {
                tasksToRemove.add(task);
            }
        }
        taskList.removeAll(tasksToRemove);
    }

    // Metodo que retorna o número de tarefas
    public int numberOfTasks() {
        return taskList.size();
    }

    // Metodo que retorna a descrição de Tarefas
    public void descriptionOfNumberOfTasks() {
        System.out.println(taskList);
    }

    public static void main(String[] args) {
        ListTask listTask = new ListTask();

        System.out.println("O Número total de tarefas: " + listTask.numberOfTasks());

        listTask.addTask("Lavar a roupa");
        listTask.addTask("Lavar a louça do café da manhã");
        System.out.println("O Número total de tarefas: " + listTask.numberOfTasks());

        listTask.addTask("Descongelar a carne");
        System.out.println("O Número total de tarefas: " + listTask.numberOfTasks());

        System.out.println();
        listTask.descriptionOfNumberOfTasks();

        
    }

}