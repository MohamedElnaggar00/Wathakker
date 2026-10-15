package com.example.data

import android.content.Context
import org.json.JSONObject

/** Seeds the Hisn al-Muslim tables from the bundled hisn_elmoslem.json on first run. */
object HisnImporter {
    suspend fun ensureImported(context: Context, dao: HisnDao) {
        if (dao.chapterCount() > 0) return

        val text = context.assets.open("hisn_elmoslem.json").bufferedReader().use { it.readText() }
        val root = JSONObject(text)
        val chapterArr = root.getJSONArray("chapters")
        val itemArr = root.getJSONArray("items")

        val chapters = (0 until chapterArr.length()).map { i ->
            val o = chapterArr.getJSONObject(i)
            HisnChapter(o.getInt("id"), o.getInt("order"), o.getString("name"))
        }
        dao.insertChapters(chapters)

        val items = (0 until itemArr.length()).map { i ->
            val o = itemArr.getJSONObject(i)
            HisnItem(
                o.getInt("id"),
                o.getInt("chapterId"),
                o.getInt("order"),
                o.getString("text"),
                o.optInt("count", 1).coerceAtLeast(1),
                o.optString("fadl", ""),
                o.optString("source", ""),
                o.optString("hokm", "")
            )
        }
        dao.insertItems(items)
    }
}
