class AboutMe:
    @staticmethod
    def main():
        ask_me_about = ["BackEnd Dev"]
        code = ["Java", "Python", "JavaScript", "TypeScript", "BootStrap", "PrimeNG", "AngularMaterial", "HTML", "CSS"]
        tools = ["Spring Boot", "Django", "Angular", "React", "Node.js"]
        hobbies = ["Listen to music", "Watch movies and series"]
        challenge = ["Migrate to the development area after the age of 40"]

        print("Ask Me About:")
        AboutMe.print_array(ask_me_about)

        print("\nCode:")
        AboutMe.print_array(code)

        print("\nTools:")
        AboutMe.print_array(tools)

        print("\nHobbies:")
        AboutMe.print_array(hobbies)

        print("\nChallenge:")
        AboutMe.print_array(challenge)

    @staticmethod
    def print_array(array):
        for item in array:
            print("✔", item)


if __name__ == "__main__":
    AboutMe.main()
