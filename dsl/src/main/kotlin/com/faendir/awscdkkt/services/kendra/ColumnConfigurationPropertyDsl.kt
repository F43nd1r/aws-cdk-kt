@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

public
    fun columnConfigurationProperty(initializer: CfnDataSource.ColumnConfigurationProperty.Builder.() -> Unit):
    CfnDataSource.ColumnConfigurationProperty =
    CfnDataSource.ColumnConfigurationProperty.builder().apply(initializer).build()
