package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public fun vpcConfigProperty(initializer: CfnMonitoringSchedule.VpcConfigProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.VpcConfigProperty =
    CfnMonitoringSchedule.VpcConfigProperty.builder().apply(initializer).build()
