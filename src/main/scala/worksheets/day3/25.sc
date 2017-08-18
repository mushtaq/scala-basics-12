import data.Book
import play.api.libs.json.Json
import data.Data._

1 → "a"

val json = Json.obj(
  "a" → 1,
  "b" → true
)

json


val jsValue = Json.toJson(books)

jsValue.as[List[Book]].foreach(println)
