package com.faendir.awscdkkt.services.appintegrations

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration

@Generated
public
    fun fileConfigurationProperty(initializer: CfnDataIntegration.FileConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataIntegration.FileConfigurationProperty =
    CfnDataIntegration.FileConfigurationProperty.builder().apply(initializer).build()
