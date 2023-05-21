package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@Generated
public
    fun fastRestoreRuleProperty(initializer: CfnLifecyclePolicy.FastRestoreRuleProperty.Builder.() -> Unit
    = {}): CfnLifecyclePolicy.FastRestoreRuleProperty =
    CfnLifecyclePolicy.FastRestoreRuleProperty.builder().apply(initializer).build()
