package com.example.taskrecyclerview.data

import com.example.taskrecyclerview.classes.Person

object PeopleList {
    fun generatePeopleList() : List<Person>{
        val peopleList = mutableListOf<Person>()
        for (i in 1..20){
            val person = Person(
                id = 1,
                name= "Person $i",
                age=(10..70).random(),
                gender= if(i % 2 == 0) "Male" else "Female",
                occupation = if (i % 3 == 0) "Programmer" else "Teacher"
            )
            peopleList.add(person)
        }

        return  peopleList
    }
}