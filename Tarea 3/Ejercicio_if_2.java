import java.util.Scanner;

public class Ejercicio_if_2 {
    public static void main(String[] args) {
        int numero1, numero2, numero3, numero4;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        numero1 = lector.nextInt();

        System.out.println("Introduce un número: ");
        numero2 = lector.nextInt();

        System.out.println("Introduce un número: ");
        numero3 = lector.nextInt();

        System.out.println("Introduce un número: ");
        numero4 = lector.nextInt();

        // numero1 es mayor
        if (numero1 >= numero2) {
            if (numero1 >= numero3) {
                if (numero1 >= numero4) {
                    if (numero2 >= numero3) {
                        if (numero2 >= numero4) {
                            if (numero3 >= numero4) {
                                System.out.printf("orden: %d %d %d %d", numero4, numero3, numero2, numero1);
                            } else {
                                System.out.printf("orden: %d %d %d %d", numero3, numero4, numero2, numero1);
                            }
                        } else {
                            System.out.printf("orden: %d %d %d %d", numero3, numero2, numero4, numero1);
                        }
                    } else {
                        if (numero4 >= numero2) {
                            System.out.printf("orden: %d %d %d %d", numero4, numero2, numero3, numero1);
                        } else {
                            if (numero3 >= numero4) {
                                System.out.printf("orden: %d %d %d %d", numero2, numero4, numero3, numero1);
                            } else {
                                System.out.printf("orden: %d %d %d %d", numero2, numero3, numero4, numero1);
                            }
                        }
                    }
                } else {
                    if (numero2 >= numero3) {
                        System.out.printf("orden: %d %d %d %d", numero3, numero2, numero1, numero4);
                    } else {
                        System.out.printf("orden: %d %d %d %d", numero2, numero3, numero1, numero4);
                    }
                }
            } else {
                if (numero4 >= numero3) {
                    System.out.printf("orden: %d %d %d %d", numero2, numero1, numero3, numero4);
                } else {
                    if (numero4 >= numero1) {
                        System.out.printf("orden: %d %d %d %d", numero2, numero1, numero3, numero4);
                    } else {
                        if (numero2 >= numero4) {
                            System.out.printf("orden: %d %d %d %d", numero4, numero2, numero1, numero3);
                        } else {
                            System.out.printf("orden: %d %d %d %d", numero2, numero4, numero1, numero3);
                        }
                    }
                }
            }
        }
        // numero 2 es mayor
        else {
            if (numero2 >= numero3) {
                if (numero2 >= numero4) {
                    if (numero1 >= numero3) {
                        if (numero1 >= numero4) {
                            if (numero3 >= numero4) {
                                System.out.printf("orden: %d %d %d %d", numero4, numero3, numero1, numero2);
                            } else {
                                System.out.printf("orden: %d %d %d %d", numero3, numero4, numero1, numero2);
                            }
                        } else {
                            System.out.printf("orden: %d %d %d %d", numero3, numero1, numero4, numero2);
                        }
                    } else {
                        if (numero4 >= numero3) {
                            System.out.printf("orden: %d %d %d %d", numero1, numero3, numero4, numero2);
                        } else {
                            if (numero4 >= numero1) {
                                System.out.printf("orden: %d %d %d %d", numero1, numero4, numero3, numero2);
                            } else {
                                System.out.printf("orden: %d %d %d %d", numero4, numero1, numero3, numero2);
                            }
                        }
                    }
                } else {
                    if (numero1 >= numero3) {
                        System.out.printf("orden: %d %d %d %d", numero3, numero1, numero2, numero4);
                    } else {
                        System.out.printf("orden: %d %d %d %d", numero1, numero3, numero2, numero4);
                    }
                }
            } else {
                if (numero3 >= numero4) {
                    if (numero4 >= numero2) {
                        System.out.printf("orden: %d %d %d %d", numero1, numero2, numero4, numero3);
                    } else {
                        if (numero4 >= numero1) {
                            System.out.printf("orden: %d %d %d %d", numero1, numero4, numero2, numero3);
                        } else {
                            System.out.printf("orden: %d %d %d %d", numero4, numero1, numero2, numero3);
                        }
                    }
                } else {
                    System.out.printf("orden: %d %d %d %d", numero1, numero2, numero3, numero4);
                }
            }
        }
    }
}
