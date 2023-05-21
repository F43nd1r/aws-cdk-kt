package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@Generated
public
    fun eventParametersProperty(initializer: CfnLifecyclePolicy.EventParametersProperty.Builder.() -> Unit
    = {}): CfnLifecyclePolicy.EventParametersProperty =
    CfnLifecyclePolicy.EventParametersProperty.builder().apply(initializer).build()
