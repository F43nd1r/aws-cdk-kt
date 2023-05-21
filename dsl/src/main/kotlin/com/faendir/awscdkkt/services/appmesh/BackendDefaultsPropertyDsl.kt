package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun backendDefaultsProperty(initializer: CfnVirtualNode.BackendDefaultsProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.BackendDefaultsProperty =
    CfnVirtualNode.BackendDefaultsProperty.builder().apply(initializer).build()
