import javax.swing.JOptionPane;

public class ProgramaManejoDeNombres {
    
public static void main(String[] args){

    JOptionPane.showMessageDialog(  null, "Bien venidos , a continuacion necesitaremos 3 nombres de los integrantes de su familia.Por favor clicke ok para continuar");

    String primerNombre = JOptionPane.showInputDialog( "coloque el primer nombre");

    String segundoNombre = JOptionPane.showInputDialog("coloque el segundo nombre ");

    String tercerNombre = JOptionPane.showInputDialog("coloque el tercer nombre ");

    ///////////////////////// PRIMER NOMBRE

    char NameCharPrim= primerNombre.charAt(1); // extraer segundo caracter del nombre 
    char NamePrimMay = Character.toUpperCase(NameCharPrim); // pasarlo a mayuscula 

    StringBuilder NameParaConcat = new StringBuilder(NamePrimMay); 
    String NameDosUl = primerNombre.substring(primerNombre.length()-2); // los ultimos 2 caracteres 

    NameParaConcat.append(NamePrimMay); 
    NameParaConcat.append(".");
    NameParaConcat.append(NameDosUl);

    String NombreFinalUno = NameParaConcat.toString(); // 1 resultado 

    /////////////////// SEGUNDO NOMBRE
   
    char NameCharPrimDos= segundoNombre.charAt(1); // extraer segundo caracter del nombre 
    char NamePrimMayDos = Character.toUpperCase(NameCharPrimDos); // pasarlo a mayuscula 

    StringBuilder NameParaConcatDos = new StringBuilder(NamePrimMayDos); 
    String NameDosUlDos = segundoNombre.substring(segundoNombre.length()-2); // los ultimos 2 caracteres 

    NameParaConcatDos.append(NamePrimMayDos); 
    NameParaConcatDos.append(".");
    NameParaConcatDos.append(NameDosUlDos);

    String NombreFinalDos = NameParaConcatDos.toString(); // 2 resultado 
    

    System.out.println("segundo nombre"+NombreFinalDos);

    //////////////////////////// TERCER NOMBRE

    char NameCharPrimTres = tercerNombre.charAt(1); // extraer segundo caracter del nombre 
    char NamePrimMayTres = Character.toUpperCase(NameCharPrimTres); // pasarlo a mayuscula 

    StringBuilder NameParaConcatTres = new StringBuilder(NamePrimMayTres); 
    String NameDosUlTres = tercerNombre.substring(segundoNombre.length()-2); // los ultimos 2 caracteres 

    NameParaConcatTres.append(NamePrimMayTres); 
    NameParaConcatTres.append(  ".");
    NameParaConcatTres.append(NameDosUlTres);

    String NombreFinalTres = NameParaConcatTres.toString(); // 3 resultado
    System.out.println("nombre final 3"+ NombreFinalTres);
///////////// RESULTADO FINAL 

StringBuilder tresNombres = new StringBuilder(NombreFinalUno); 
tresNombres.append("_");
tresNombres.append(NombreFinalDos);
tresNombres.append("_");
tresNombres.append(NombreFinalTres);

String stringFinal = tresNombres.toString();

JOptionPane.showMessageDialog(null, stringFinal);

}
}


/* 
La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es

Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

N.es_A.ia_E.pe

Preguntas de esta tarea
Publique acá su código fuente de la tarea, solo la clase main, recuerde probarlo antes en su IDE.

 */