@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnRemediationConfiguration

public
    fun ssmControlsProperty(initializer: CfnRemediationConfiguration.SsmControlsProperty.Builder.() -> Unit):
    CfnRemediationConfiguration.SsmControlsProperty =
    CfnRemediationConfiguration.SsmControlsProperty.builder().apply(initializer).build()
