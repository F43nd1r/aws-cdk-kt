package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@Generated
public fun retainRuleProperty(initializer: CfnLifecyclePolicy.RetainRuleProperty.Builder.() -> Unit
    = {}): CfnLifecyclePolicy.RetainRuleProperty =
    CfnLifecyclePolicy.RetainRuleProperty.builder().apply(initializer).build()
