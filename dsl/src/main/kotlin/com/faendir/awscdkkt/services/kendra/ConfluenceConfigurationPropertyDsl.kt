package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun confluenceConfigurationProperty(initializer: CfnDataSource.ConfluenceConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.ConfluenceConfigurationProperty =
    CfnDataSource.ConfluenceConfigurationProperty.builder().apply(initializer).build()
