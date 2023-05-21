package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEventBusPolicy

@Generated
public fun conditionProperty(initializer: CfnEventBusPolicy.ConditionProperty.Builder.() -> Unit =
    {}): CfnEventBusPolicy.ConditionProperty =
    CfnEventBusPolicy.ConditionProperty.builder().apply(initializer).build()
