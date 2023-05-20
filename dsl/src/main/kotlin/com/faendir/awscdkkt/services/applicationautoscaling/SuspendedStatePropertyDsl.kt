@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget

public
    fun suspendedStateProperty(initializer: CfnScalableTarget.SuspendedStateProperty.Builder.() -> Unit):
    CfnScalableTarget.SuspendedStateProperty =
    CfnScalableTarget.SuspendedStateProperty.builder().apply(initializer).build()
