package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnThingType

@Generated
public
    fun thingTypePropertiesProperty(initializer: CfnThingType.ThingTypePropertiesProperty.Builder.() -> Unit
    = {}): CfnThingType.ThingTypePropertiesProperty =
    CfnThingType.ThingTypePropertiesProperty.builder().apply(initializer).build()
