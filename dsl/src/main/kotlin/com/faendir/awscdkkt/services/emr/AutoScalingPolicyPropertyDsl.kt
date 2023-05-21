package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

@Generated
public
    fun autoScalingPolicyProperty(initializer: CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder.() -> Unit
    = {}): CfnInstanceGroupConfig.AutoScalingPolicyProperty =
    CfnInstanceGroupConfig.AutoScalingPolicyProperty.builder().apply(initializer).build()
