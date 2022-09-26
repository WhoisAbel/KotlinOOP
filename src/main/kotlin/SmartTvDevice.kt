class SmartTvDevice( val name: String,  val deviceCategory: String) :
    SmartDevice(name = name, category = deviceCategory) {

    override val deviceType: String = "Smart TV"

    private var speakerVolume by RangeRegulator(initialValue = 2, maxvalue = 100, minValue = 0)
    private var channelNumber by RangeRegulator(initialValue = 1, maxvalue = 200, minValue = 0)

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume set to $speakerVolume and channel number is " +
                "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }
}