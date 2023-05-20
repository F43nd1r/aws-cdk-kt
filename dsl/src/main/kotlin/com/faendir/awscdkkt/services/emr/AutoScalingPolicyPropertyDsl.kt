@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

public
    fun autoScalingPolicyProperty(initializer: CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder.() -> Unit):
    CfnInstanceGroupConfig.AutoScalingPolicyProperty =
    CfnInstanceGroupConfig.AutoScalingPolicyProperty.builder().apply(initializer).build()
