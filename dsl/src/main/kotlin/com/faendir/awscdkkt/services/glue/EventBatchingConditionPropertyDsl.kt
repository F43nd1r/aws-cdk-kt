package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnTrigger

@Generated
public
    fun eventBatchingConditionProperty(initializer: CfnTrigger.EventBatchingConditionProperty.Builder.() -> Unit
    = {}): CfnTrigger.EventBatchingConditionProperty =
    CfnTrigger.EventBatchingConditionProperty.builder().apply(initializer).build()
