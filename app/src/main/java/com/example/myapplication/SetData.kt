package com.example.myapplication

object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            "what is capital of India ?",
            1,

            "Uttar Pradesh",
            "Madhya Pradesh",
            "Kanpur",
            "New Delhi",
            4
        )
        var question2 = QuestionData(
            "Who was the first Indian woman in Space ?",
            2,

            "Kalpana Chawla",
            "Sunita Williams",
            "Koneru Humpy",
            "None of the above",
            1
        )
        var question3 = QuestionData(
            "Who wrote the Indian National Anthem ?",
            3,

            "Bakim Chandra Chatterji",
            "Rabindranath Tagore",
            "Swami Vivekanand",
            "None of the above",
            2
        )
        var question4 = QuestionData(
            "Who was the first President of India ?",
            4,

            "Abdul Kalam",
            "Lal Bahadur Shastri",
            "Dr. Rajendra Prasad",
            "Zakir Hussain",
            3
        )

        var question5 = QuestionData(
            "Who built the Jama Masjid ?",
            5,

            "Jahangir",
            "Akbar",
            "Imam Bukhari",
            "Shah Jahan",
            4
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que
    }
}