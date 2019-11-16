package netology.profile

import netology.profile.model.Profile

fun main(){
  val active = Profile(23, "chibi", "Anastasia", "Shtrezer", "online", "photo.jpg")

    print("user name: ${active.fullname}")
}
