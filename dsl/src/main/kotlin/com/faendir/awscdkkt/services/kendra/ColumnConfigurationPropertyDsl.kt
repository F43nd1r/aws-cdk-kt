package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun columnConfigurationProperty(initializer: CfnDataSource.ColumnConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.ColumnConfigurationProperty =
    CfnDataSource.ColumnConfigurationProperty.builder().apply(initializer).build()
