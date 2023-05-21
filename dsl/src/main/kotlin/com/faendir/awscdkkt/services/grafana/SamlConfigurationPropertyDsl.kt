package com.faendir.awscdkkt.services.grafana

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.grafana.CfnWorkspace

@Generated
public
    fun samlConfigurationProperty(initializer: CfnWorkspace.SamlConfigurationProperty.Builder.() -> Unit
    = {}): CfnWorkspace.SamlConfigurationProperty =
    CfnWorkspace.SamlConfigurationProperty.builder().apply(initializer).build()
