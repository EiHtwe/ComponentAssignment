package com.et.padc_x_customassignment_eh.data.dummy_data

import com.et.padc_x_customassignment_eh.data.vo.ProfileVO

fun getDummyPeopleList() : List<ProfileVO> {
    var one = ProfileVO()
    one.imageurl="https://images.assetsdelivery.com/compings_v2/gmast3r/gmast3r1511/gmast3r151100776.jpg"
    one.status  = "In progress"

    var two = ProfileVO()
    two.imageurl="https://thumbs.dreamstime.com/b/man-hipster-avatar-cartoon-guy-black-hair-red-glasses-flat-icon-blue-background-user-person-character-vector-151711777.jpg"
    two.status  = "Done"

    var three = ProfileVO()
    three.imageurl="https://us.123rf.com/450wm/gmast3r/gmast3r1603/gmast3r160300768/54398279-business-man-profile-icon-male-avatar-hipster-style-fashion-cartoon-guy-beard-portrait-casual-busine.jpg?ver=6"
    three.status  = "Done"

    var four = ProfileVO()
    four.imageurl="https://previews.123rf.com/images/photoplotnikov/photoplotnikov1604/photoplotnikov160400049/57872290-hipster-man-character-with-beard-hairstyle-and-glasses-in-flat-style-stylish-young-guy-on-background.jpg"
    four.status  = "Done"

    return arrayListOf(one,two,three,four)

}

