package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun endpointInputProperty(initializer: CfnMonitoringSchedule.EndpointInputProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.EndpointInputProperty =
    CfnMonitoringSchedule.EndpointInputProperty.builder().apply(initializer).build()
