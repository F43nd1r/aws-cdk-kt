package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun fargatePlatformConfigurationProperty(initializer: CfnJobDefinition.FargatePlatformConfigurationProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.FargatePlatformConfigurationProperty =
    CfnJobDefinition.FargatePlatformConfigurationProperty.builder().apply(initializer).build()
