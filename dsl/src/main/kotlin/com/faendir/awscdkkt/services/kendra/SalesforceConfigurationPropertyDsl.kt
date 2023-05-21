package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun salesforceConfigurationProperty(initializer: CfnDataSource.SalesforceConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.SalesforceConfigurationProperty =
    CfnDataSource.SalesforceConfigurationProperty.builder().apply(initializer).build()
