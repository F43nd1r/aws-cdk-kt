@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.BackendConfig

public fun backendConfig(initializer: BackendConfig.Builder.() -> Unit): BackendConfig =
    BackendConfig.builder().apply(initializer).build()
