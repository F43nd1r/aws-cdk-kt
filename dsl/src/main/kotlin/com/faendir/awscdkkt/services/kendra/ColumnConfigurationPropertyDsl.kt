@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

public
    fun columnConfigurationProperty(initializer: CfnDataSource.ColumnConfigurationProperty.Builder.() -> Unit):
    CfnDataSource.ColumnConfigurationProperty =
    CfnDataSource.ColumnConfigurationProperty.builder().apply(initializer).build()
