package com.faendir.awscdkkt.generated.services.networkmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnGlobalNetwork
import software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGlobalNetwork(id: String, props: CfnGlobalNetworkProps): CfnGlobalNetwork =
    CfnGlobalNetwork(this, id, props)

@Generated
public fun Construct.cfnGlobalNetwork(
  id: String,
  props: CfnGlobalNetworkProps,
  initializer: @AwsCdkDsl CfnGlobalNetwork.() -> Unit,
): CfnGlobalNetwork = CfnGlobalNetwork(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnGlobalNetwork(id: String): CfnGlobalNetwork = CfnGlobalNetwork(this, id)

@Generated
public fun Construct.cfnGlobalNetwork(id: String, initializer: @AwsCdkDsl
    CfnGlobalNetwork.() -> Unit): CfnGlobalNetwork = CfnGlobalNetwork(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnGlobalNetwork(id: String, initializer: @AwsCdkDsl
    CfnGlobalNetwork.Builder.() -> Unit): CfnGlobalNetwork = CfnGlobalNetwork.Builder.create(this,
    id).apply(initializer).build()
