package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun s3DataSourceConfigurationProperty(initializer: CfnDataSource.S3DataSourceConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.S3DataSourceConfigurationProperty =
    CfnDataSource.S3DataSourceConfigurationProperty.builder().apply(initializer).build()
