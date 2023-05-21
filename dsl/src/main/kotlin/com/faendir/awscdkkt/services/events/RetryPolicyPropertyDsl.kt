package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public fun retryPolicyProperty(initializer: CfnRule.RetryPolicyProperty.Builder.() -> Unit = {}):
    CfnRule.RetryPolicyProperty = CfnRule.RetryPolicyProperty.builder().apply(initializer).build()
