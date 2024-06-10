package com.example.taskrecyclerview.data

import com.example.taskrecyclerview.classes.Person


object PeopleList {
    val names = arrayOf(
        "María García",
        "Juan Pérez",
        "Ana Martínez",
        "Carlos López",
        "Laura Sánchez",
        "Pedro Rodríguez",
        "Sofía Díaz",
        "José Gómez",
        "Elena Pérez",
        "Luis Fernández",
        "Lucía Ruiz",
        "Miguel González",
        "Isabel Jiménez",
        "Diego Hernández",
        "Carmen Torres",
        "Andrés Pérez",
        "Paula Domínguez",
        "Fernando Navarro",
        "Marta Castro",
        "Roberto Ramos",

    )
    fun generatePeopleList() : List<Person>{
        val peopleList = mutableListOf<Person>()
        for (i in 1..20){
            val person = Person(
                id = i,
                name= names[i - 1],
                age=(10..70).random(),
                gender= if(i % 2 == 0) "Male" else "Female",
                occupation = if (i % 3 == 0) "Programmer" else "Teacher"
            )
            peopleList.add(person)
        }

        return  peopleList
    }
}