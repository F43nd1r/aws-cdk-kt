package com.faendir.awscdkkt.services.frauddetector

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnDetectorProps

@Generated
public fun cfnDetectorProps(initializer: CfnDetectorProps.Builder.() -> Unit = {}): CfnDetectorProps
    = CfnDetectorProps.builder().apply(initializer).build()
