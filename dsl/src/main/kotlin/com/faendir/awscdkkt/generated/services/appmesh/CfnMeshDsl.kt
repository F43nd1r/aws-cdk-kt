package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnMesh
import software.amazon.awscdk.services.appmesh.CfnMeshProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMesh(id: String): CfnMesh = CfnMesh(this, id)

@Generated
public fun Construct.cfnMesh(id: String, initializer: @AwsCdkDsl CfnMesh.() -> Unit): CfnMesh =
    CfnMesh(this, id).apply(initializer)

@Generated
public fun Construct.cfnMesh(id: String, props: CfnMeshProps): CfnMesh = CfnMesh(this, id, props)

@Generated
public fun Construct.cfnMesh(
  id: String,
  props: CfnMeshProps,
  initializer: @AwsCdkDsl CfnMesh.() -> Unit,
): CfnMesh = CfnMesh(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMesh(id: String, initializer: @AwsCdkDsl CfnMesh.Builder.() -> Unit):
    CfnMesh = CfnMesh.Builder.create(this, id).apply(initializer).build()
