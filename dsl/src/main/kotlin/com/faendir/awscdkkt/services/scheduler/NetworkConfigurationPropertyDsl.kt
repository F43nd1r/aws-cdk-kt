package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public
    fun networkConfigurationProperty(initializer: CfnSchedule.NetworkConfigurationProperty.Builder.() -> Unit
    = {}): CfnSchedule.NetworkConfigurationProperty =
    CfnSchedule.NetworkConfigurationProperty.builder().apply(initializer).build()
