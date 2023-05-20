@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

public
    fun scalingConstraintsProperty(initializer: CfnInstanceGroupConfig.ScalingConstraintsProperty.Builder.() -> Unit):
    CfnInstanceGroupConfig.ScalingConstraintsProperty =
    CfnInstanceGroupConfig.ScalingConstraintsProperty.builder().apply(initializer).build()
