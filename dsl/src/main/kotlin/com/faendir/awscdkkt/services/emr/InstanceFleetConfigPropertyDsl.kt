package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

@Generated
public
    fun instanceFleetConfigProperty(initializer: CfnCluster.InstanceFleetConfigProperty.Builder.() -> Unit
    = {}): CfnCluster.InstanceFleetConfigProperty =
    CfnCluster.InstanceFleetConfigProperty.builder().apply(initializer).build()
