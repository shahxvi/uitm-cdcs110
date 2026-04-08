public class PreSchool {
        private String name;
        private String race; // Malay, Chinese, Indian
        private int age;

        public PreSchool(String name, String race, int age) {
                this.name = name;
                this.race = race;
                this.age = age;
        }

        public PreSchool() {
                this.name = null;
                this.race = null;
                this.age = 0;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setRace(String race) {
                this.race = race;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public String getName() {
                return name;
        }

        public String getRace() {
                return race;
        }

        public int getAge() {
                return age;
        }

        public String toString() {
                return "Name: " + name +
                       " Race: " + race +
                       " Age: " + age;
        }
}
