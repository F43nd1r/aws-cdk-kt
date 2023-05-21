package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@Generated
public
    fun crossRegionCopyRetainRuleProperty(initializer: CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty.Builder.() -> Unit
    = {}): CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty =
    CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty.builder().apply(initializer).build()
