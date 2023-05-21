package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnRemediationConfiguration

@Generated
public
    fun staticValueProperty(initializer: CfnRemediationConfiguration.StaticValueProperty.Builder.() -> Unit
    = {}): CfnRemediationConfiguration.StaticValueProperty =
    CfnRemediationConfiguration.StaticValueProperty.builder().apply(initializer).build()
