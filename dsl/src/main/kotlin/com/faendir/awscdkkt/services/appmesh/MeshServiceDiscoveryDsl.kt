package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.MeshServiceDiscovery

@Generated
public fun meshServiceDiscovery(initializer: MeshServiceDiscovery.Builder.() -> Unit = {}):
    MeshServiceDiscovery = MeshServiceDiscovery.builder().apply(initializer).build()
