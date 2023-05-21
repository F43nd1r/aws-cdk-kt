package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

@Generated
public
    fun simpleScalingPolicyConfigurationProperty(initializer: CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit
    = {}): CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty =
    CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.builder().apply(initializer).build()
