package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@Generated
public
    fun deprecateRuleProperty(initializer: CfnLifecyclePolicy.DeprecateRuleProperty.Builder.() -> Unit
    = {}): CfnLifecyclePolicy.DeprecateRuleProperty =
    CfnLifecyclePolicy.DeprecateRuleProperty.builder().apply(initializer).build()
