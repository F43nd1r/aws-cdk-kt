package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@Generated
public
    fun multiMeasureMappingsProperty(initializer: CfnScheduledQuery.MultiMeasureMappingsProperty.Builder.() -> Unit
    = {}): CfnScheduledQuery.MultiMeasureMappingsProperty =
    CfnScheduledQuery.MultiMeasureMappingsProperty.builder().apply(initializer).build()
