package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnDetectorProps

@Generated
public fun cfnDetectorProps(initializer: CfnDetectorProps.Builder.() -> Unit = {}): CfnDetectorProps
    = CfnDetectorProps.builder().apply(initializer).build()
