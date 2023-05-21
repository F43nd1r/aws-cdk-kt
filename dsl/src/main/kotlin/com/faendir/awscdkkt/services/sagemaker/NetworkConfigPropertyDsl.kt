package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun networkConfigProperty(initializer: CfnMonitoringSchedule.NetworkConfigProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.NetworkConfigProperty =
    CfnMonitoringSchedule.NetworkConfigProperty.builder().apply(initializer).build()
