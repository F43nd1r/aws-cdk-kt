package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@Generated
public
    fun snsConfigurationProperty(initializer: CfnScheduledQuery.SnsConfigurationProperty.Builder.() -> Unit
    = {}): CfnScheduledQuery.SnsConfigurationProperty =
    CfnScheduledQuery.SnsConfigurationProperty.builder().apply(initializer).build()
