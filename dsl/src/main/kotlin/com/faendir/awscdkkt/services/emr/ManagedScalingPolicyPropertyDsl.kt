package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

@Generated
public
    fun managedScalingPolicyProperty(initializer: CfnCluster.ManagedScalingPolicyProperty.Builder.() -> Unit
    = {}): CfnCluster.ManagedScalingPolicyProperty =
    CfnCluster.ManagedScalingPolicyProperty.builder().apply(initializer).build()
