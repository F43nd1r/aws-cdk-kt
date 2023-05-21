package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob

@Generated
public
    fun columnStatisticsConfigurationProperty(initializer: CfnJob.ColumnStatisticsConfigurationProperty.Builder.() -> Unit
    = {}): CfnJob.ColumnStatisticsConfigurationProperty =
    CfnJob.ColumnStatisticsConfigurationProperty.builder().apply(initializer).build()
