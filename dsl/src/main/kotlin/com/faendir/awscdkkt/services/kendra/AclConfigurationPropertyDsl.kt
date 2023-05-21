package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun aclConfigurationProperty(initializer: CfnDataSource.AclConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.AclConfigurationProperty =
    CfnDataSource.AclConfigurationProperty.builder().apply(initializer).build()
