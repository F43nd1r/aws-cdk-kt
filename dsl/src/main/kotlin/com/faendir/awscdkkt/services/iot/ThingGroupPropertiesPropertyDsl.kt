package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnThingGroup

@Generated
public
    fun thingGroupPropertiesProperty(initializer: CfnThingGroup.ThingGroupPropertiesProperty.Builder.() -> Unit
    = {}): CfnThingGroup.ThingGroupPropertiesProperty =
    CfnThingGroup.ThingGroupPropertiesProperty.builder().apply(initializer).build()
