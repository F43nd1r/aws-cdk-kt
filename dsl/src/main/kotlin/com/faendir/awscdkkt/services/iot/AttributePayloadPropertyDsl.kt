package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnThingGroup

@Generated
public
    fun attributePayloadProperty(initializer: CfnThingGroup.AttributePayloadProperty.Builder.() -> Unit
    = {}): CfnThingGroup.AttributePayloadProperty =
    CfnThingGroup.AttributePayloadProperty.builder().apply(initializer).build()
