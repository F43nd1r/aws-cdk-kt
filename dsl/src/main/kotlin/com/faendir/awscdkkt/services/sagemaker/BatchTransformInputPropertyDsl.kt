package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun batchTransformInputProperty(initializer: CfnMonitoringSchedule.BatchTransformInputProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.BatchTransformInputProperty =
    CfnMonitoringSchedule.BatchTransformInputProperty.builder().apply(initializer).build()
