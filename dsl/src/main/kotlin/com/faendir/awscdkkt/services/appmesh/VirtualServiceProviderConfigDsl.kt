@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig

public
    fun virtualServiceProviderConfig(initializer: VirtualServiceProviderConfig.Builder.() -> Unit):
    VirtualServiceProviderConfig = VirtualServiceProviderConfig.builder().apply(initializer).build()
