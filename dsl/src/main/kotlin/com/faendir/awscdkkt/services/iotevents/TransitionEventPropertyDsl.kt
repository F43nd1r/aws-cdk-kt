package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@Generated
public
    fun transitionEventProperty(initializer: CfnDetectorModel.TransitionEventProperty.Builder.() -> Unit
    = {}): CfnDetectorModel.TransitionEventProperty =
    CfnDetectorModel.TransitionEventProperty.builder().apply(initializer).build()
