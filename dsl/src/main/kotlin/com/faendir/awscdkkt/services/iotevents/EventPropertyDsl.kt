package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@Generated
public fun eventProperty(initializer: CfnDetectorModel.EventProperty.Builder.() -> Unit = {}):
    CfnDetectorModel.EventProperty =
    CfnDetectorModel.EventProperty.builder().apply(initializer).build()
