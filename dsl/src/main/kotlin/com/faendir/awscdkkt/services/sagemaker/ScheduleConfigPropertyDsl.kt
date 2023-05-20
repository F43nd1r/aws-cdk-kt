@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

public
    fun scheduleConfigProperty(initializer: CfnMonitoringSchedule.ScheduleConfigProperty.Builder.() -> Unit):
    CfnMonitoringSchedule.ScheduleConfigProperty =
    CfnMonitoringSchedule.ScheduleConfigProperty.builder().apply(initializer).build()
