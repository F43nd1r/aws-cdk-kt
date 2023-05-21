package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@Generated
public
    fun targetTrackingScalingPolicyConfigurationProperty(initializer: CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit
    = {}): CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty =
    CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty.builder().apply(initializer).build()
