@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

public
    fun jobFlowInstancesConfigProperty(initializer: CfnCluster.JobFlowInstancesConfigProperty.Builder.() -> Unit):
    CfnCluster.JobFlowInstancesConfigProperty =
    CfnCluster.JobFlowInstancesConfigProperty.builder().apply(initializer).build()
