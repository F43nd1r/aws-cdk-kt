package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection

@Generated
public
    fun ingressVpcConfigurationProperty(initializer: CfnVpcIngressConnection.IngressVpcConfigurationProperty.Builder.() -> Unit
    = {}): CfnVpcIngressConnection.IngressVpcConfigurationProperty =
    CfnVpcIngressConnection.IngressVpcConfigurationProperty.builder().apply(initializer).build()
