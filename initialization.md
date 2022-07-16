A Tamagotchi has hungriness, happiness and cleanliness and tiredness. These are integers start from 0 to 10.

You could interact with your tamagotchi by:
    1.feed the Tamagotchi
        it gets less hungry(its hungriness goes down by 5)
    2.Take teh tamagotchi for a walk
        it gets happier (by 3) and less tired (by 2)
    3.Clean the tamagotchi
        it gets cleaner (goes up to 10)
    4.pet the tamagotchi
        it gets happier (by 5)
    5.get the tamagotchi's current mood
        <!-- sad -->
        <!-- irritated -->
        1) tiredness
            if the tamagotchi's tiredness is 10, then tamagotchi is "asleep".
            if the tamagotchi's tiredness is above 8 (included), then the tamagotchi is "tired"
            otherwise, the tamagotchi is "energetic"
        2) hungriness
            if the tamagotchi's hungriness is at least 7, the tamagotchi is "hungry"
            otherwise, the tamagotchi is "well fed";
        3)cleanliness
            if the tamagotchi's cleanliness is less than 4, the tamagotchi is "dirty", otherwise, it is "clean"
        4)happiness
            if the tamagotchi's happiness is more than 6, the tamagotchi is "happy"
            if the tamagotchi's happiness is at lest 4, the tamagotchi is "okay"
            otherwise, the tamagotchi is" sad"
    6.pass time
        hungriness goes up by 1
        cleanliness goes down by 1
        tiredness goes up by 1, unless the tiredness is 10 in which case the tamachochi wakes up with the tiredness of 0.
        happiness
            1)if tamagochi's hungriness is at least 7, decrease happiness by 1
            2)if tamagotchi's cleanliness is less than 3, decrease happiness by 1.

None of the above needs parameter. If any of these methods reduce one of the integers to below 0, then that integer is set to 0.
if any of these methods raise one of the integers to above 10, then that integer is set to 10.

initialize your Tamagotchi
    1. name
    2. gender
    <!-- 3. temper -->
    3.maybe choose your Tamagotchi's image

