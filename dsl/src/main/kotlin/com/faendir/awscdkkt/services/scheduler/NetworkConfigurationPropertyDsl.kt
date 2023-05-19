@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

public
    fun networkConfigurationProperty(initializer: CfnSchedule.NetworkConfigurationProperty.Builder.() -> Unit):
    CfnSchedule.NetworkConfigurationProperty =
    CfnSchedule.NetworkConfigurationProperty.builder().apply(initializer).build()
