package com.example.pojo;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "person-group")
public class PersonGroup {
	private String groupName;
	private List<Person> personGroupDetail;
	private Map<String, Person> personMap;
	
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public List<Person> getPersonGoup() {
		return personGroupDetail;
	}
	public void f(List<Person> personGroupDetail) {
		this.personGroupDetail = personGroupDetail;
	}
	public Map<String, Person> getPersonMap() {
		return personMap;
	}
	public void setPersonMap(Map<String, Person> personMap) {
		this.personMap = personMap;
	}

	private class Person {
		private String name;
		private int age;
		private String sex;
		
		@Override
		public String toString() {
			return getClass().getSimpleName() + "[" + "name:" + name +
					"age:" + age + "sex:" + sex + "]";
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

	}
}
