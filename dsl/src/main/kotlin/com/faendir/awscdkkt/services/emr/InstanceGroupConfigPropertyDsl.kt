package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

@Generated
public
    fun instanceGroupConfigProperty(initializer: CfnCluster.InstanceGroupConfigProperty.Builder.() -> Unit
    = {}): CfnCluster.InstanceGroupConfigProperty =
    CfnCluster.InstanceGroupConfigProperty.builder().apply(initializer).build()
