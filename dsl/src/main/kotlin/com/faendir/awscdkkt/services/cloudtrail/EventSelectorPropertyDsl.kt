package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnTrail

@Generated
public fun eventSelectorProperty(initializer: CfnTrail.EventSelectorProperty.Builder.() -> Unit =
    {}): CfnTrail.EventSelectorProperty =
    CfnTrail.EventSelectorProperty.builder().apply(initializer).build()
