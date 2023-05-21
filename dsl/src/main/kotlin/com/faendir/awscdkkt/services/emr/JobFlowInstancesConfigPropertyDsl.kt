package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

@Generated
public
    fun jobFlowInstancesConfigProperty(initializer: CfnCluster.JobFlowInstancesConfigProperty.Builder.() -> Unit
    = {}): CfnCluster.JobFlowInstancesConfigProperty =
    CfnCluster.JobFlowInstancesConfigProperty.builder().apply(initializer).build()
