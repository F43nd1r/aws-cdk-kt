package com.faendir.awscdkkt.generated.services.networkmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnCoreNetwork
import software.amazon.awscdk.services.networkmanager.CfnCoreNetworkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCoreNetwork(id: String, props: CfnCoreNetworkProps): CfnCoreNetwork =
    CfnCoreNetwork(this, id, props)

@Generated
public fun Construct.cfnCoreNetwork(
  id: String,
  props: CfnCoreNetworkProps,
  initializer: @AwsCdkDsl CfnCoreNetwork.() -> Unit,
): CfnCoreNetwork = CfnCoreNetwork(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCoreNetwork(id: String, initializer: @AwsCdkDsl
    CfnCoreNetwork.Builder.() -> Unit): CfnCoreNetwork = CfnCoreNetwork.Builder.create(this,
    id).apply(initializer).build()
