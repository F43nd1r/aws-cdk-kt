package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnMesh
import software.amazon.awscdk.services.appmesh.CfnMeshProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMesh(id: String, initializer: CfnMesh.() -> Unit = {}): CfnMesh =
    CfnMesh(this, id).apply(initializer)

@Generated
public fun Construct.cfnMesh(
  id: String,
  props: CfnMeshProps,
  initializer: CfnMesh.() -> Unit = {},
): CfnMesh = CfnMesh(this, id, props).apply(initializer)
