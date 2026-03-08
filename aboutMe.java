// public class aboutMe {
//     public static void main(String[] args) {
//         var name = "Alexandre Lorena";
//         var age = 49;
//         var course = "Software Engineering";
//         var languages = "Java, Python, JavaScript, TypeScript";
//         var hobbies = "programming, music, movies, series";

//         System.out.println("Name: " + name + " | Age: " + age);
//         System.out.println("Course: " + course);
//         System.out.println("Languages: " + languages);
//         System.out.println("Hobbies: " + hobbies);
        
//     }
// }


public class aboutMe {
    public static void main(String[] args) {
        var frameworks = new String[]{"Spring Boot", "Django", "Vue", "Hibernate", "Angular", "React"};
        var libraries = new String[]{"PrimeNG", "AngularMaterial", "BootStrap"};
        var markup = new String[]{"Markdown", "HTML", "CSS"};
        var language = new String[]{"Java", "Python", "JavaScript", "TypeScript"};
        var tools = new String[]{"Intellij", "VSCode", "PyCharm", "Eclipse"};
        var databases = new String[]{"MySQL", "PostgreSQL", "MongoDB", "SQLite"};
        var others = new String[]{"MySQLWorkbench", "Docker", "NodeJS", "AWS", "Azure"};
        var hobbies = new String[]{"Programming", "Music", "Movies", "Series"};

        System.out.println("Frameworks and Front End Technologies:");
        printArray(frameworks);

        System.out.println("\nLibraries:");
        printArray(libraries);
        
        System.out.println("\nLanguages of Markup and Style:");
        printArray(markup);

        System.out.println("\nProgramming Language:");
        printArray(language);

        System.out.println("\nDevelopment tools:");
        printArray(tools);

        System.out.println("\nDatabases and Related Technologies:");
        printArray(databases);

        System.out.println("\nOther tolls and Related Technologies:");
        printArray(others);

        System.out.println("\nOther tolls and Related Technologies:");
        printArray(others);
    }

    public static void printArray(String[] array) {
        for (String item : array) {
            System.out.println("✔ " + item);
        }
    }
}