@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualService

public
    fun virtualNodeServiceProviderProperty(initializer: CfnVirtualService.VirtualNodeServiceProviderProperty.Builder.() -> Unit):
    CfnVirtualService.VirtualNodeServiceProviderProperty =
    CfnVirtualService.VirtualNodeServiceProviderProperty.builder().apply(initializer).build()
