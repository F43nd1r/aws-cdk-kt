package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnSegment

@Generated
public fun demographicProperty(initializer: CfnSegment.DemographicProperty.Builder.() -> Unit = {}):
    CfnSegment.DemographicProperty =
    CfnSegment.DemographicProperty.builder().apply(initializer).build()
