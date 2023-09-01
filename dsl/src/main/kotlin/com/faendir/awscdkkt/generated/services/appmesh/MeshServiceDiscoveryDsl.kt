package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.MeshServiceDiscovery

@Generated
public fun buildMeshServiceDiscovery(initializer: @AwsCdkDsl MeshServiceDiscovery.Builder.() -> Unit
    = {}): MeshServiceDiscovery = MeshServiceDiscovery.Builder().apply(initializer).build()
