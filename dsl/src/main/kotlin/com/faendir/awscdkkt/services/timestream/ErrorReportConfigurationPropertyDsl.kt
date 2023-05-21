package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@Generated
public
    fun errorReportConfigurationProperty(initializer: CfnScheduledQuery.ErrorReportConfigurationProperty.Builder.() -> Unit
    = {}): CfnScheduledQuery.ErrorReportConfigurationProperty =
    CfnScheduledQuery.ErrorReportConfigurationProperty.builder().apply(initializer).build()
