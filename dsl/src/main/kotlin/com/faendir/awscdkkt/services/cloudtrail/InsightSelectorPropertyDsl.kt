package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnTrail

@Generated
public fun insightSelectorProperty(initializer: CfnTrail.InsightSelectorProperty.Builder.() -> Unit
    = {}): CfnTrail.InsightSelectorProperty =
    CfnTrail.InsightSelectorProperty.builder().apply(initializer).build()
