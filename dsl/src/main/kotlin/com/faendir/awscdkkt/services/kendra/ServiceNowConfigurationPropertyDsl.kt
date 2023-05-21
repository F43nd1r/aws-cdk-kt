package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun serviceNowConfigurationProperty(initializer: CfnDataSource.ServiceNowConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.ServiceNowConfigurationProperty =
    CfnDataSource.ServiceNowConfigurationProperty.builder().apply(initializer).build()
