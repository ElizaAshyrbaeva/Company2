import java.util.Arrays;
import java.util.Comparator;

public abstract class Person {
    private Long id;
    private String fullName;
    private int age;
    private char gender;

    public Person(Long id, String fullName, int age, char gender) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }




    public abstract double period(Group[] group);

      public void sortAge(Person[] people) {
          Arrays.sort(people, new Comparator<Person>() {
              @Override
              public int compare(Person person1, Person person2) {
                  if (person1.getAge() != person2.getAge())
                      return person1.getAge() - person2.getAge();
                  return person1.getFullName().compareTo(person2.getFullName());
              }
          });
          System.out.println(Arrays.toString(people));
      }

      @Override
        public String toString() {
        return "Person{" +
                ", age=" + age +
                '}';
    }
}
