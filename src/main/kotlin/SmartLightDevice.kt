class SmartLightDevice( val name: String,  val deviceCategory: String) :
    SmartDevice(name = name, category = deviceCategory) {

    override val deviceType: String = "Smart Light"

    private var brightnessLevel by RangeRegulator(initialValue = 2, maxvalue = 100, minValue = 0)


    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name is turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("$name turned off")
    }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }
}