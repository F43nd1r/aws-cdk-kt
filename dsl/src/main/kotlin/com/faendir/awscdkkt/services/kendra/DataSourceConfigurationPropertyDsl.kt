package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun dataSourceConfigurationProperty(initializer: CfnDataSource.DataSourceConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.DataSourceConfigurationProperty =
    CfnDataSource.DataSourceConfigurationProperty.builder().apply(initializer).build()
