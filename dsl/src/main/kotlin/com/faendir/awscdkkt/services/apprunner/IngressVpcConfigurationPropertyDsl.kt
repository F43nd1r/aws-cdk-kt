@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection

public
    fun ingressVpcConfigurationProperty(initializer: CfnVpcIngressConnection.IngressVpcConfigurationProperty.Builder.() -> Unit):
    CfnVpcIngressConnection.IngressVpcConfigurationProperty =
    CfnVpcIngressConnection.IngressVpcConfigurationProperty.builder().apply(initializer).build()
