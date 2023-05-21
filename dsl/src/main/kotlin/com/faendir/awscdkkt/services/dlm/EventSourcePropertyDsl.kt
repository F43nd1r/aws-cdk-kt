package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@Generated
public
    fun eventSourceProperty(initializer: CfnLifecyclePolicy.EventSourceProperty.Builder.() -> Unit =
    {}): CfnLifecyclePolicy.EventSourceProperty =
    CfnLifecyclePolicy.EventSourceProperty.builder().apply(initializer).build()
