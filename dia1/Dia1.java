/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia1;

/**
 *
 * @author jairb
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dia1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Camper> campers = new ArrayList<>();
        List<Trainers> trainer = new ArrayList<>();
        List<Rutas> rutas = new ArrayList<>();
        List<AreaEntreno> areasEntrenamiento = new ArrayList<>();
        Coordinadores coordinador = new Coordinadores();

        Rutas rutaNodeJS = new Rutas("Ruta NodeJS");
        rutaNodeJS.agregarModulo(new Modulo("Fundamentos de programacion", "MySQL", "MongoDB"));
        rutaNodeJS.agregarModulo(new Modulo("Programacion Web", "MySQL", "MongoDB"));
        rutaNodeJS.agregarModulo(new Modulo("Programacion formal", "MySQL", "MongoDB"));
        rutaNodeJS.agregarModulo(new Modulo("Bases de datos", "MySQL", "MongoDB"));
        rutaNodeJS.agregarModulo(new Modulo("Backend", "NodeJS", "Express"));
        rutas.add(rutaNodeJS);

        Rutas rutaJava = new Rutas("Ruta Java");
        rutaJava.agregarModulo(new Modulo("Fundamentos de programación", "MySQL", "MongoDB"));
        rutaJava.agregarModulo(new Modulo("Programación Web", "MySQL", "MongoDB"));
        rutaJava.agregarModulo(new Modulo("Programación formal", "Java", "JavaScript"));
        rutaJava.agregarModulo(new Modulo("Bases de datos", "MySQL", "MongoDB"));
        rutaJava.agregarModulo(new Modulo("Backend", "Spring Boot", "NodeJS"));
        rutas.add(rutaJava);

        Rutas rutaNetCore = new Rutas("Ruta NetCore");
        rutaNetCore.agregarModulo(new Modulo("Fundamentos de programacion", "MySQL", "MongoDB"));
        rutaNetCore.agregarModulo(new Modulo("Programación Web", "MySQL", "MongoDB"));
        rutaNetCore.agregarModulo(new Modulo("Programacion formal", "C#", "JavaScript"));
        rutaNetCore.agregarModulo(new Modulo("Bases de datos", "MySQL", "MongoDB"));
        rutaNetCore.agregarModulo(new Modulo("Backend", ".NetCore", "Express"));
        rutas.add(rutaNetCore);

        areasEntrenamiento.add(new AreaEntreno("area 1", 33));
        areasEntrenamiento.add(new AreaEntreno("area 2", 33));
        areasEntrenamiento.add(new AreaEntreno("area 3", 33));

        while (true) {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Registrar camper");
            System.out.println("2. Registrar Trainers");
            System.out.println("3. Asignar camper a un area");
            System.out.println("4. Registrar nota de camper");
            System.out.println("5. Mostrar campers");
            System.out.println("6. Mostrar Rutas");
            System.out.println("7. Mostrar Trainer");
            System.out.println("8. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese ID del camper:");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Ingrese nombre del camper:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese apellido del camper:");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingrese direccion del camper:");
                    String direccion = scanner.nextLine();
                    System.out.println("Ingrese nombre del acudiente:");
                    String acudiente = scanner.nextLine();
                    System.out.println("Ingrese telefono del camper:");
                    int telefono = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.println("¿El camper se encuentra (true/false):");
                    boolean riesgo = scanner.nextBoolean();
                    scanner.nextLine(); 
                    System.out.println("Ingrese estado del camper:");
                    String estado = scanner.nextLine();
                    campers.add(new Camper(id, nombre, apellido, direccion, acudiente, telefono, riesgo, estado));
                    System.out.println("Camper registrado con exito");
                    break;
            case 2:
                System.out.println("Ingrese ID del trainer:");
                int idTrainer = scanner.nextInt();
                scanner.nextLine(); 
                System.out.println("Ingrese nombre del trainer:");
                String nombreTrainer = scanner.nextLine();
                System.out.println("Ingrese apellido del trainer:");
                String apellidoTrainer = scanner.nextLine();
                trainer.add(new Trainers(idTrainer, nombreTrainer, apellidoTrainer));
                break;

                case 3:
                    System.out.println("Ingrese ID del camper a asignar:");
                    id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Seleccione el area de entrenamiento:");
                    for (int i = 0; i < areasEntrenamiento.size(); i++) {
                        System.out.println((i + 1) + ". " + areasEntrenamiento.get(i).nombre);
                    }
                    int areaSeleccionada = scanner.nextInt();
                    scanner.nextLine(); 
                    AreaEntreno area = areasEntrenamiento.get(areaSeleccionada - 1);
                    Camper camper = null;
                    for (Camper c : campers) {
                        if (c.id == id) {
                            camper = c;
                            break;
                        }
                    }
                    if (camper != null) {
                        if (area.agregarCamper(camper)) {
                            System.out.println("Camper asignado al area de entrenamiento");
                        } else {
                            System.out.println("El area de entrenamiento esta llena");
                        }
                    } else {
                        System.out.println("Camper no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese ID del camper para registrar nota:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese nota teorica:");
                    double notaTeorica = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Ingrese nota practica:");
                    double notaPractica = scanner.nextDouble();
                    scanner.nextLine(); 
                    camper = null;
                    for (Camper c : campers) {
                        if (c.id == id) {
                            camper = c;
                            break;
                        }
                    }
                    if (camper != null) {
                        coordinador.registrarNota(camper, notaTeorica, notaPractica);
                        System.out.println("Nota registrada con exito");
                    } else {
                        System.out.println("Camper no encontrado");
                    }
                    break;
                case 5:
                if (campers.isEmpty()) {
                    System.out.println("No hay campers registrados.");
                } else {
                    System.out.println("Listado de campers:");
                    for (Camper c : campers) {
                        System.out.println("ID: " + c.id);
                        System.out.println("Nombre: " + c.nombre);
                        System.out.println("Apellido: " + c.apellido);
                        System.out.println("Dirección: " + c.direccion);
                        System.out.println("Acudiente: " + c.acudiente);
                        System.out.println("Teléfono: " + c.telefono);
                        System.out.println("¿En riesgo?: " + c.riesgo);
                        System.out.println("Estado: " + c.estado);
                        System.out.println("---------------------");
                    }
                }
                break;
                
                case 6:
                if (rutas.isEmpty()) {
                    System.out.println("No hay rutas disponibles.");
                } else {
                    System.out.println("Listado de Rutas:");
                    for (Rutas ruta : rutas) {
                        System.out.println("Nombre de la ruta: " + ruta.nombre);
                        for (Modulo modulo : ruta.modulos) {
                            System.out.println(" - " + modulo.nombre);
                        }

                        System.out.println("---------------------");
                    }
                }
                break;




                case 7:
                    if (trainer.isEmpty()) {
                    System.out.println("No hay Trainers registrados.");
                } else {
                    System.out.println("Listado de trainers:");
                    for (Trainers c : trainer) {
                        System.out.println("ID: " + c.idtrainer);
                        System.out.println("Nombre: " + c.nombretrainer);
                        System.out.println("Apellido: " + c.apellidotrainer);
                        System.out.println("---------------------");
                    }
                }
                break;
                case 8:
                    System.out.println("Chau");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}

