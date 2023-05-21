package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun datasetFormatProperty(initializer: CfnMonitoringSchedule.DatasetFormatProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.DatasetFormatProperty =
    CfnMonitoringSchedule.DatasetFormatProperty.builder().apply(initializer).build()
