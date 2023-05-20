@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

public
    fun stoppingConditionProperty(initializer: CfnMonitoringSchedule.StoppingConditionProperty.Builder.() -> Unit):
    CfnMonitoringSchedule.StoppingConditionProperty =
    CfnMonitoringSchedule.StoppingConditionProperty.builder().apply(initializer).build()
