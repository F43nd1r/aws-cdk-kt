@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

public
    fun timestreamConfigurationProperty(initializer: CfnScheduledQuery.TimestreamConfigurationProperty.Builder.() -> Unit):
    CfnScheduledQuery.TimestreamConfigurationProperty =
    CfnScheduledQuery.TimestreamConfigurationProperty.builder().apply(initializer).build()
