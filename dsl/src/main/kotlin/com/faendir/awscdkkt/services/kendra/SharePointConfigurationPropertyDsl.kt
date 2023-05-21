package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun sharePointConfigurationProperty(initializer: CfnDataSource.SharePointConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.SharePointConfigurationProperty =
    CfnDataSource.SharePointConfigurationProperty.builder().apply(initializer).build()
