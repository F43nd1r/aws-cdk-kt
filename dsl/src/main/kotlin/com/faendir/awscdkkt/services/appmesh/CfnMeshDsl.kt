@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnMesh
import software.amazon.awscdk.services.appmesh.CfnMeshProps
import software.constructs.Construct

public fun Construct.cfnMesh(
  id: String,
  props: CfnMeshProps,
  initializer: CfnMesh.() -> Unit = {},
): CfnMesh = CfnMesh(this, id, props).apply(initializer)

public fun Construct.cfnMesh(id: String, initializer: CfnMesh.() -> Unit = {}): CfnMesh =
    CfnMesh(this, id).apply(initializer)
