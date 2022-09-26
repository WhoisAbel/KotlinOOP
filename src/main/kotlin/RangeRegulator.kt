import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class RangeRegulator(
    initialValue: Int,
    private val maxvalue: Int,
    private val minValue: Int
) : ReadWriteProperty<Any?, Int> {

    private var fieldData = initialValue

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxvalue)
            fieldData = value
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

}