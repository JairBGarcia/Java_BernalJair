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
            System.out.println("Seleccione una opción:");
            System.out.println("1. Menu Camper");
            System.out.println("2. Menu Trainer");
            System.out.println("3. Rutas");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    menuCamper(campers, scanner);
                    break;
                case 2:
                    menuTrainer(trainer, scanner);
                    break;
                case 3:
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
                case 4:
                    System.out.println("Chau");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    public static void menuCamper(List<Camper> campers, Scanner scanner) {
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar Camper");
            System.out.println("2. Actualizar Camper");
            System.out.println("3. Eliminar Camper");
            System.out.println("4. Mostrar Campers");
            System.out.println("5. Regresar al menú principal");

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
                    System.out.println("Ingrese ID del camper a actualizar:");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine();
                    Camper camper = null;
                    for (Camper c : campers) {
                        if (c.id == idActualizar) {
                            camper = c;
                            break;
                        }
                    }
                    if (camper != null) {
                        System.out.println("Ingrese nuevo nombre del camper:");
                        camper.nombre = scanner.nextLine();
                        System.out.println("Ingrese nuevo apellido del camper:");
                        camper.apellido = scanner.nextLine();
                        System.out.println("Ingrese nueva dirección del camper:");
                        camper.direccion = scanner.nextLine();
                        System.out.println("Ingrese nuevo nombre del acudiente del camper:");
                        camper.acudiente = scanner.nextLine();
                        System.out.println("Ingrese nuevo telefono del camper:");
                        camper.telefono = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("¿El camper se encuentra en riesgo (true/false):");
                        camper.riesgo = scanner.nextBoolean();
                        scanner.nextLine();
                        System.out.println("Ingrese nuevo estado del camper:");
                        camper.estado = scanner.nextLine();
                        System.out.println("Camper actualizado con éxito");
                    } else {
                        System.out.println("Camper no encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese ID del camper a eliminar:");
                    int idEliminar = scanner.nextInt();
                    scanner.nextLine();
                    Camper camperEliminar = null;
                    for (Camper c : campers) {
                        if (c.id == idEliminar) {
                            camperEliminar = c;
                            break;
                        }
                    }
                    if (camperEliminar != null) {
                        campers.remove(camperEliminar);
                        System.out.println("Camper eliminado con exito");
                    } else {
                        System.out.println("Camper no encontrado");
                    }
                    break;
                case 4:
                    if (campers.isEmpty()) {
                    System.out.println("No hay campers registrados.");
                } else {
                    System.out.println("Listado de campers:");
                    for (Camper c : campers) {
                        System.out.println("ID: " + c.id);
                        System.out.println("Nombre: " + c.nombre);
                        System.out.println("Apellido: " + c.apellido);
                        System.out.println("Direccion: " + c.direccion);
                        System.out.println("Acudiente: " + c.acudiente);
                        System.out.println("Telefono: " + c.telefono);
                        System.out.println("¿En riesgo?: " + c.riesgo);
                        System.out.println("Estado: " + c.estado);
                        System.out.println("---------------------");
                    }
                }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }

    public static void menuTrainer(List<Trainers> trainers, Scanner scanner) {
        while (true) {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Agregar Trainer");
            System.out.println("2. Actualizar Trainer");
            System.out.println("3. Eliminar Trainer");
            System.out.println("4. Mostrar Trainers");
            System.out.println("5. Regresar al menu principal");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese ID del trainer:");
                    int idTrainer = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Ingrese nombre del trainer:");
                    String nombreTrainer = scanner.nextLine();
                    System.out.println("Ingrese apellido del trainer:");
                    String apellidoTrainer = scanner.nextLine();
                    trainers.add(new Trainers(idTrainer, nombreTrainer, apellidoTrainer));
                    System.out.println("Trainer agregado con exito");
                    break;
                case 2:
                    System.out.println("Ingrese ID del trainer a actualizar:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Trainers trainer = null;
                    for (Trainers t : trainers) {
                        if (t.idtrainer == id) {
                            trainer = t;
                            break;
                        }
                    }
                    if (trainer != null) {
                        System.out.println("Ingrese nuevo nombre del trainer:");
                        trainer.nombretrainer = scanner.nextLine();
                        System.out.println("Ingrese nuevo apellido del trainer:");
                        trainer.apellidotrainer = scanner.nextLine();
                        System.out.println("Trainer actualizado con exito");
                    } else {
                        System.out.println("Trainer no encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese ID del trainer a eliminar:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    trainer = null;
                    for (Trainers t : trainers) {
                        if (t.idtrainer == id) {
                            trainer = t;
                            break;
                        }
                    }
                    if (trainer != null) {
                        trainers.remove(trainer);
                        System.out.println("Trainer eliminado con exito");
                    } else {
                        System.out.println("Trainer no encontrado");
                    }
                    break;
                case 4:
                    if (trainers.isEmpty()) {
                        System.out.println("No hay trainers registrados.");
                    } else {
                        System.out.println("Listado de trainers:");
                        for (Trainers t : trainers) {
                            System.out.println("ID: " + t.idtrainer);
                            System.out.println("Nombre: " + t.nombretrainer);
                            System.out.println("Apellido: " + t.apellidotrainer);
                            System.out.println("---------------------");
                        }
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opcion no válida");
                    break;
            }
        }
    }
}


