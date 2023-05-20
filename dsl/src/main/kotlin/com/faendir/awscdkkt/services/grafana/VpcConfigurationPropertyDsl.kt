@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.grafana

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.grafana.CfnWorkspace

public
    fun vpcConfigurationProperty(initializer: CfnWorkspace.VpcConfigurationProperty.Builder.() -> Unit):
    CfnWorkspace.VpcConfigurationProperty =
    CfnWorkspace.VpcConfigurationProperty.builder().apply(initializer).build()
