package com.faendir.awscdkkt.services.frauddetector

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnDetector

@Generated
public fun eventTypeProperty(initializer: CfnDetector.EventTypeProperty.Builder.() -> Unit = {}):
    CfnDetector.EventTypeProperty =
    CfnDetector.EventTypeProperty.builder().apply(initializer).build()
