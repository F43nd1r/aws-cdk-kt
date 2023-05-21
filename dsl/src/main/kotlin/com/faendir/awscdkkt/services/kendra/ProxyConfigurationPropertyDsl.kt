package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun proxyConfigurationProperty(initializer: CfnDataSource.ProxyConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.ProxyConfigurationProperty =
    CfnDataSource.ProxyConfigurationProperty.builder().apply(initializer).build()
