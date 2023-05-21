package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun databaseConfigurationProperty(initializer: CfnDataSource.DatabaseConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.DatabaseConfigurationProperty =
    CfnDataSource.DatabaseConfigurationProperty.builder().apply(initializer).build()
