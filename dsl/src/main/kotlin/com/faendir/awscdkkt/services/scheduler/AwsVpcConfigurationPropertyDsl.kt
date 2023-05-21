package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public
    fun awsVpcConfigurationProperty(initializer: CfnSchedule.AwsVpcConfigurationProperty.Builder.() -> Unit
    = {}): CfnSchedule.AwsVpcConfigurationProperty =
    CfnSchedule.AwsVpcConfigurationProperty.builder().apply(initializer).build()
