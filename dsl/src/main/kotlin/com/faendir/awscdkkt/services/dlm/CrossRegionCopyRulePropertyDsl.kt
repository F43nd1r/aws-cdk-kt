package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@Generated
public
    fun crossRegionCopyRuleProperty(initializer: CfnLifecyclePolicy.CrossRegionCopyRuleProperty.Builder.() -> Unit
    = {}): CfnLifecyclePolicy.CrossRegionCopyRuleProperty =
    CfnLifecyclePolicy.CrossRegionCopyRuleProperty.builder().apply(initializer).build()
