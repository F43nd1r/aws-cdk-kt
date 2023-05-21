package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun hookConfigurationProperty(initializer: CfnDataSource.HookConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.HookConfigurationProperty =
    CfnDataSource.HookConfigurationProperty.builder().apply(initializer).build()
