@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

public
    fun targetConfigurationProperty(initializer: CfnScheduledQuery.TargetConfigurationProperty.Builder.() -> Unit):
    CfnScheduledQuery.TargetConfigurationProperty =
    CfnScheduledQuery.TargetConfigurationProperty.builder().apply(initializer).build()
