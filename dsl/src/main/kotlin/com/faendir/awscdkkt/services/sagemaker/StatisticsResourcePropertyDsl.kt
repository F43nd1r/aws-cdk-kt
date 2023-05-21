package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun statisticsResourceProperty(initializer: CfnMonitoringSchedule.StatisticsResourceProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.StatisticsResourceProperty =
    CfnMonitoringSchedule.StatisticsResourceProperty.builder().apply(initializer).build()
