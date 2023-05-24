package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.Mesh
import software.amazon.awscdk.services.appmesh.MeshProps
import software.constructs.Construct

@Generated
public fun Construct.mesh(id: String, props: MeshProps): Mesh = Mesh(this, id, props)

@Generated
public fun Construct.mesh(
  id: String,
  props: MeshProps,
  initializer: @AwsCdkDsl Mesh.() -> Unit,
): Mesh = Mesh(this, id, props).apply(initializer)

@Generated
public fun Construct.mesh(id: String): Mesh = Mesh(this, id)

@Generated
public fun Construct.mesh(id: String, initializer: @AwsCdkDsl Mesh.() -> Unit): Mesh = Mesh(this,
    id).apply(initializer)

@Generated
public fun Construct.buildMesh(id: String, initializer: @AwsCdkDsl Mesh.Builder.() -> Unit): Mesh =
    Mesh.Builder.create(this, id).apply(initializer).build()
