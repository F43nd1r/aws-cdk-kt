@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions

public
    fun virtualServiceBackendOptions(initializer: VirtualServiceBackendOptions.Builder.() -> Unit):
    VirtualServiceBackendOptions = VirtualServiceBackendOptions.builder().apply(initializer).build()
