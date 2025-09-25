package com.faendir.awscdkkt.generated.services.odb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.odb.CfnOdbPeeringConnection
import software.amazon.awscdk.services.odb.CfnOdbPeeringConnectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOdbPeeringConnection(id: String, initializer: @AwsCdkDsl CfnOdbPeeringConnection.() -> Unit = {}): CfnOdbPeeringConnection = CfnOdbPeeringConnection(this, id).apply(initializer)

@Generated
public fun Construct.cfnOdbPeeringConnection(
  id: String,
  props: CfnOdbPeeringConnectionProps,
  initializer: @AwsCdkDsl CfnOdbPeeringConnection.() -> Unit = {},
): CfnOdbPeeringConnection = CfnOdbPeeringConnection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOdbPeeringConnection(id: String, initializer: @AwsCdkDsl CfnOdbPeeringConnection.Builder.() -> Unit = {}): CfnOdbPeeringConnection = CfnOdbPeeringConnection.Builder.create(this, id).apply(initializer).build()
