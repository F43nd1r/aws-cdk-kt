@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

public
    fun vpcConfigProperty(initializer: CfnMonitoringSchedule.VpcConfigProperty.Builder.() -> Unit):
    CfnMonitoringSchedule.VpcConfigProperty =
    CfnMonitoringSchedule.VpcConfigProperty.builder().apply(initializer).build()
