package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun dataSourceToIndexFieldMappingProperty(initializer: CfnDataSource.DataSourceToIndexFieldMappingProperty.Builder.() -> Unit
    = {}): CfnDataSource.DataSourceToIndexFieldMappingProperty =
    CfnDataSource.DataSourceToIndexFieldMappingProperty.builder().apply(initializer).build()
