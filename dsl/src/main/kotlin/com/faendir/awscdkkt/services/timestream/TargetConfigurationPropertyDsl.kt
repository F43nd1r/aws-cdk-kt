package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@Generated
public
    fun targetConfigurationProperty(initializer: CfnScheduledQuery.TargetConfigurationProperty.Builder.() -> Unit
    = {}): CfnScheduledQuery.TargetConfigurationProperty =
    CfnScheduledQuery.TargetConfigurationProperty.builder().apply(initializer).build()
