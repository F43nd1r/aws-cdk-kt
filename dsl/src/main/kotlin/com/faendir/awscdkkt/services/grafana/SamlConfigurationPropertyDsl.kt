@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.grafana

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.grafana.CfnWorkspace

public
    fun samlConfigurationProperty(initializer: CfnWorkspace.SamlConfigurationProperty.Builder.() -> Unit):
    CfnWorkspace.SamlConfigurationProperty =
    CfnWorkspace.SamlConfigurationProperty.builder().apply(initializer).build()
