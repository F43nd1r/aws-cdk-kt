@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget

public
    fun scalableTargetActionProperty(initializer: CfnScalableTarget.ScalableTargetActionProperty.Builder.() -> Unit):
    CfnScalableTarget.ScalableTargetActionProperty =
    CfnScalableTarget.ScalableTargetActionProperty.builder().apply(initializer).build()
