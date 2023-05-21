package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun baselineConfigProperty(initializer: CfnMonitoringSchedule.BaselineConfigProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.BaselineConfigProperty =
    CfnMonitoringSchedule.BaselineConfigProperty.builder().apply(initializer).build()
