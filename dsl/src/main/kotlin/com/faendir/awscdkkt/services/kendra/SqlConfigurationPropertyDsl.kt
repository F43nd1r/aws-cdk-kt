package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun sqlConfigurationProperty(initializer: CfnDataSource.SqlConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.SqlConfigurationProperty =
    CfnDataSource.SqlConfigurationProperty.builder().apply(initializer).build()
