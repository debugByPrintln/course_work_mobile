package com.example.course_work_mobile.data

import com.example.course_work_mobile.R
import java.util.*

object QuestionStorage {
    fun getQuestions(test: String): List<Question> {
        val questionsList = LinkedList<Question>()
        if (test == "test1") {
            // 1
            val que1 = Question(
                1, "Какое альтернативное название есть у Хинидина?",
                R.drawable.kitty,
                "Дурулес", "Кордарон",
                "Амиодарон", "Лидокаин", 1
            )
            questionsList.add(que1)
            // 2
            val que2 = Question(
                2,
                "Какое альтернативное название у Амиодарона?",
                R.drawable.kitty,
                "Верапамил",
                "Изоптин",
                "Кордарон",
                "Нет правильного ответа",
                3
            )
            questionsList.add(que2)

            // 3
            val que3 = Question(
                3, "К какому классу антиаритмических средств относится амиодарон?",
                R.drawable.kitty,
                "IA", "IB",
                "II", "III", 4
            )
            questionsList.add(que3)

            // 4
            val que4 = Question(
                4,
                "Какие основные показания к применению у хинидина?",
                R.drawable.kitty,
                "Аппендицит",
                "Желудочковые и нежелудочковые аритмии",
                "Стенокардия",
                "Астма",
                2
            )
            questionsList.add(que4)

            // 5
            val que5 = Question(
                5,
                "Какой % раствора должен быть у пропафенона?",
                R.drawable.kitty,
                "1 %",
                "0,5 %",
                "0,35 %",
                "5 %",
                3
            )
            questionsList.add(que5)
        }

        else if(test == "test2"){
            // 1
            val que1 = Question(
                1, "Какое альтернативное название у аденозина?",
                R.drawable.kitty,
                "Аденокор", "Ивабрадин",
                "Пропафенон", "Изоптин", 1
            )
            questionsList.add(que1)

            val que2 = Question(
                2, "Какая форма выпуска у ледокаина?",
                R.drawable.kitty,
                "Таблетки 0,5 мг", "Раствор 0,1 %",
                "Таблетки 10 мг", "Раствор 2%", 4
            )
            questionsList.add(que2)

            val que3 = Question(
                3, "Какая фармокологическая группа у ивабрадина?",
                R.drawable.kitty,
                "Антиаритмические средства", "Блокаторы кальциевых каналов",
                "Антиангиальные средсва", "Нестероидные противовоспалительные препараты", 3
            )
            questionsList.add(que3)

            val que4 = Question(
                4, "Что нельзя есть/пить пациенту, который принимает ивабрадин?",
                R.drawable.kitty,
                "Грейпфруктовый сок", "Твикс с хлебом",
                "Пельмени", "Алкоголь", 1
            )
            questionsList.add(que4)

            val que5 = Question(
                5, "Какие основные показания к применению у верапамила?",
                R.drawable.kitty,
                "Гипотензия", "Наджелудочная аритмия",
                "Головная боль", "Воспаление легких", 2
            )
            questionsList.add(que5)
        }

        else if(test == "test3"){

        }

        else if(test == "test4"){

        }

        return questionsList
    }
}