class Person{

        private String firstName;
        private String lastName;
        private int age;
        //compile person
        public Person(String fn, String ln, int ag){
            setFirstName (fn);
            setLastName (ln);
            setAge (ag);
        }
        //Getters and setters
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        //get full name
        public String getName() {
            return firstName +" "+ lastName;
        }
        //get full name and age
        public String getInfo() {
            return firstName +" "+ lastName +" "+ age;
        }    
        //change info
        public void changeInformation(String fn, String ln, int ag){
            setFirstName (fn);
            setLastName (ln);
            setAge (ag);
        }
    }

