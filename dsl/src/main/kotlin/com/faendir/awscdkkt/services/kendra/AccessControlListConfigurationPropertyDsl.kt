package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun accessControlListConfigurationProperty(initializer: CfnDataSource.AccessControlListConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.AccessControlListConfigurationProperty =
    CfnDataSource.AccessControlListConfigurationProperty.builder().apply(initializer).build()
