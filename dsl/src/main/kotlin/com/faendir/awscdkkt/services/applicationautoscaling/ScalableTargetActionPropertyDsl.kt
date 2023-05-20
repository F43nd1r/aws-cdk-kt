@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget

public
    fun scalableTargetActionProperty(initializer: CfnScalableTarget.ScalableTargetActionProperty.Builder.() -> Unit):
    CfnScalableTarget.ScalableTargetActionProperty =
    CfnScalableTarget.ScalableTargetActionProperty.builder().apply(initializer).build()
