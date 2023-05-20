@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.grafana

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.grafana.CfnWorkspace

public
    fun vpcConfigurationProperty(initializer: CfnWorkspace.VpcConfigurationProperty.Builder.() -> Unit):
    CfnWorkspace.VpcConfigurationProperty =
    CfnWorkspace.VpcConfigurationProperty.builder().apply(initializer).build()
