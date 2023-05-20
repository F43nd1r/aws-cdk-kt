@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

public
    fun fargatePlatformConfigurationProperty(initializer: CfnJobDefinition.FargatePlatformConfigurationProperty.Builder.() -> Unit):
    CfnJobDefinition.FargatePlatformConfigurationProperty =
    CfnJobDefinition.FargatePlatformConfigurationProperty.builder().apply(initializer).build()
