package com.faendir.awscdkkt.services.grafana

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.grafana.CfnWorkspace

@Generated
public
    fun vpcConfigurationProperty(initializer: CfnWorkspace.VpcConfigurationProperty.Builder.() -> Unit
    = {}): CfnWorkspace.VpcConfigurationProperty =
    CfnWorkspace.VpcConfigurationProperty.builder().apply(initializer).build()
