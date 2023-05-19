@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection

public
    fun ingressVpcConfigurationProperty(initializer: CfnVpcIngressConnection.IngressVpcConfigurationProperty.Builder.() -> Unit):
    CfnVpcIngressConnection.IngressVpcConfigurationProperty =
    CfnVpcIngressConnection.IngressVpcConfigurationProperty.builder().apply(initializer).build()
