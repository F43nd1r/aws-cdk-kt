package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnRemediationConfiguration

@Generated
public
    fun ssmControlsProperty(initializer: CfnRemediationConfiguration.SsmControlsProperty.Builder.() -> Unit
    = {}): CfnRemediationConfiguration.SsmControlsProperty =
    CfnRemediationConfiguration.SsmControlsProperty.builder().apply(initializer).build()
