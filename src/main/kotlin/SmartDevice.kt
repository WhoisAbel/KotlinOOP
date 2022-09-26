open class SmartDevice(private val name: String, private val category: String) {

    var deviceStatus: String = "online"
        protected set

    open val deviceType: String = "unknown"

    open fun turnOn() {
        deviceStatus = "On"
    }

    open fun turnOff() {
        deviceStatus = "Off"
    }

}