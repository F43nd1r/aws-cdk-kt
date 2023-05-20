@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnServer

public
    fun endpointDetailsProperty(initializer: CfnServer.EndpointDetailsProperty.Builder.() -> Unit):
    CfnServer.EndpointDetailsProperty =
    CfnServer.EndpointDetailsProperty.builder().apply(initializer).build()
