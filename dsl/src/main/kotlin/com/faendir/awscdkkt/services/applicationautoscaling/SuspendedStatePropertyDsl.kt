package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget

@Generated
public
    fun suspendedStateProperty(initializer: CfnScalableTarget.SuspendedStateProperty.Builder.() -> Unit
    = {}): CfnScalableTarget.SuspendedStateProperty =
    CfnScalableTarget.SuspendedStateProperty.builder().apply(initializer).build()
