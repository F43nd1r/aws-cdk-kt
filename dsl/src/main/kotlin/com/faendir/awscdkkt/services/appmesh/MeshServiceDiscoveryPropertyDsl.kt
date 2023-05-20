@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnMesh

public
    fun meshServiceDiscoveryProperty(initializer: CfnMesh.MeshServiceDiscoveryProperty.Builder.() -> Unit):
    CfnMesh.MeshServiceDiscoveryProperty =
    CfnMesh.MeshServiceDiscoveryProperty.builder().apply(initializer).build()
