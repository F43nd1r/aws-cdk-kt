package com.faendir.awscdkkt.generated.services.odb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.odb.CfnOdbNetwork
import software.amazon.awscdk.services.odb.CfnOdbNetworkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOdbNetwork(id: String, initializer: @AwsCdkDsl CfnOdbNetwork.() -> Unit =
    {}): CfnOdbNetwork = CfnOdbNetwork(this, id).apply(initializer)

@Generated
public fun Construct.cfnOdbNetwork(
  id: String,
  props: CfnOdbNetworkProps,
  initializer: @AwsCdkDsl CfnOdbNetwork.() -> Unit = {},
): CfnOdbNetwork = CfnOdbNetwork(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOdbNetwork(id: String, initializer: @AwsCdkDsl
    CfnOdbNetwork.Builder.() -> Unit = {}): CfnOdbNetwork = CfnOdbNetwork.Builder.create(this,
    id).apply(initializer).build()
