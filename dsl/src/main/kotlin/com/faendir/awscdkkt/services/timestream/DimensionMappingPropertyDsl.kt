package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@Generated
public
    fun dimensionMappingProperty(initializer: CfnScheduledQuery.DimensionMappingProperty.Builder.() -> Unit
    = {}): CfnScheduledQuery.DimensionMappingProperty =
    CfnScheduledQuery.DimensionMappingProperty.builder().apply(initializer).build()
