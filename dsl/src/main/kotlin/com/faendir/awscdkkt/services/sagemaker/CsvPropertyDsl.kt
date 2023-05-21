package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public fun csvProperty(initializer: CfnMonitoringSchedule.CsvProperty.Builder.() -> Unit = {}):
    CfnMonitoringSchedule.CsvProperty =
    CfnMonitoringSchedule.CsvProperty.builder().apply(initializer).build()
