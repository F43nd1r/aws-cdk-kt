package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun stoppingConditionProperty(initializer: CfnMonitoringSchedule.StoppingConditionProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.StoppingConditionProperty =
    CfnMonitoringSchedule.StoppingConditionProperty.builder().apply(initializer).build()
