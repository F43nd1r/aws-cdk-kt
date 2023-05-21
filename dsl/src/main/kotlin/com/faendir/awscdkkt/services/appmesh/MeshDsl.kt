package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.Mesh
import software.amazon.awscdk.services.appmesh.MeshProps
import software.constructs.Construct

@Generated
public fun Construct.mesh(id: String, initializer: Mesh.() -> Unit = {}): Mesh = Mesh(this,
    id).apply(initializer)

@Generated
public fun Construct.mesh(
  id: String,
  props: MeshProps,
  initializer: Mesh.() -> Unit = {},
): Mesh = Mesh(this, id, props).apply(initializer)
