package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnRemediationConfiguration

@Generated
public
    fun resourceValueProperty(initializer: CfnRemediationConfiguration.ResourceValueProperty.Builder.() -> Unit
    = {}): CfnRemediationConfiguration.ResourceValueProperty =
    CfnRemediationConfiguration.ResourceValueProperty.builder().apply(initializer).build()
