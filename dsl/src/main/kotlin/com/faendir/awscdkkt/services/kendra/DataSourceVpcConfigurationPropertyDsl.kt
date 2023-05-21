package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun dataSourceVpcConfigurationProperty(initializer: CfnDataSource.DataSourceVpcConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.DataSourceVpcConfigurationProperty =
    CfnDataSource.DataSourceVpcConfigurationProperty.builder().apply(initializer).build()
