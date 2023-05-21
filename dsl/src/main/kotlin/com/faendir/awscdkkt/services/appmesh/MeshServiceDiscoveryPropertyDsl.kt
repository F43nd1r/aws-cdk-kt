package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnMesh

@Generated
public
    fun meshServiceDiscoveryProperty(initializer: CfnMesh.MeshServiceDiscoveryProperty.Builder.() -> Unit
    = {}): CfnMesh.MeshServiceDiscoveryProperty =
    CfnMesh.MeshServiceDiscoveryProperty.builder().apply(initializer).build()
