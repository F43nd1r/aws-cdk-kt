@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

public
    fun snsConfigurationProperty(initializer: CfnScheduledQuery.SnsConfigurationProperty.Builder.() -> Unit):
    CfnScheduledQuery.SnsConfigurationProperty =
    CfnScheduledQuery.SnsConfigurationProperty.builder().apply(initializer).build()
