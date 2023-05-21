package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun clusterConfigProperty(initializer: CfnMonitoringSchedule.ClusterConfigProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.ClusterConfigProperty =
    CfnMonitoringSchedule.ClusterConfigProperty.builder().apply(initializer).build()
