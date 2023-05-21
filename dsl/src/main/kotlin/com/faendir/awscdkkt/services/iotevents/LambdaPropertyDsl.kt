package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@Generated
public fun lambdaProperty(initializer: CfnDetectorModel.LambdaProperty.Builder.() -> Unit = {}):
    CfnDetectorModel.LambdaProperty =
    CfnDetectorModel.LambdaProperty.builder().apply(initializer).build()
