@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

public
    fun dataSourceConfigurationProperty(initializer: CfnDataSource.DataSourceConfigurationProperty.Builder.() -> Unit):
    CfnDataSource.DataSourceConfigurationProperty =
    CfnDataSource.DataSourceConfigurationProperty.builder().apply(initializer).build()
