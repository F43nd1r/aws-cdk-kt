package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun connectionConfigurationProperty(initializer: CfnDataSource.ConnectionConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.ConnectionConfigurationProperty =
    CfnDataSource.ConnectionConfigurationProperty.builder().apply(initializer).build()
