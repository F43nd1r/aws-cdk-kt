@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

public
    fun awsVpcConfigurationProperty(initializer: CfnSchedule.AwsVpcConfigurationProperty.Builder.() -> Unit):
    CfnSchedule.AwsVpcConfigurationProperty =
    CfnSchedule.AwsVpcConfigurationProperty.builder().apply(initializer).build()
