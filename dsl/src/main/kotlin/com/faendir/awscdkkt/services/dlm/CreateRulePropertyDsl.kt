package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@Generated
public fun createRuleProperty(initializer: CfnLifecyclePolicy.CreateRuleProperty.Builder.() -> Unit
    = {}): CfnLifecyclePolicy.CreateRuleProperty =
    CfnLifecyclePolicy.CreateRuleProperty.builder().apply(initializer).build()
