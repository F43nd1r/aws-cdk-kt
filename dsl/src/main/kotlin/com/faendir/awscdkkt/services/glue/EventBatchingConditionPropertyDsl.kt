@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnTrigger

public
    fun eventBatchingConditionProperty(initializer: CfnTrigger.EventBatchingConditionProperty.Builder.() -> Unit):
    CfnTrigger.EventBatchingConditionProperty =
    CfnTrigger.EventBatchingConditionProperty.builder().apply(initializer).build()
