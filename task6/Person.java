package task6;


	
		public class Person {


			private String name;
			private int age;
			
			
			public Person(String name, int age) {
				this.name=name;
				this.age=age;
				
			}
			
			
			public String getName() {
				return name;
				
			}

			public int getAge() {
				return age;
				}
			
			public static void main(String[] args) {
				
				Person p= new Person("Neeraj Kumar",27);
				System.out.println("The name of the person is: " + p.getName());
				System.out.println("The age of the person is: " + p.getAge());
				     	
			}
		}
