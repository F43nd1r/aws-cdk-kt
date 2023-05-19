@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions

public
    fun virtualServiceBackendOptions(initializer: VirtualServiceBackendOptions.Builder.() -> Unit):
    VirtualServiceBackendOptions = VirtualServiceBackendOptions.builder().apply(initializer).build()
