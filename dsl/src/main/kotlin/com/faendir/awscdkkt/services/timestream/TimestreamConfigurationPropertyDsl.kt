package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@Generated
public
    fun timestreamConfigurationProperty(initializer: CfnScheduledQuery.TimestreamConfigurationProperty.Builder.() -> Unit
    = {}): CfnScheduledQuery.TimestreamConfigurationProperty =
    CfnScheduledQuery.TimestreamConfigurationProperty.builder().apply(initializer).build()
