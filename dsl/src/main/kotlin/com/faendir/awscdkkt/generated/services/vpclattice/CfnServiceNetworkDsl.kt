package com.faendir.awscdkkt.generated.services.vpclattice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnServiceNetwork
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServiceNetwork(id: String): CfnServiceNetwork = CfnServiceNetwork(this, id)

@Generated
public fun Construct.cfnServiceNetwork(id: String, initializer: @AwsCdkDsl
    CfnServiceNetwork.() -> Unit): CfnServiceNetwork = CfnServiceNetwork(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnServiceNetwork(id: String, props: CfnServiceNetworkProps): CfnServiceNetwork
    = CfnServiceNetwork(this, id, props)

@Generated
public fun Construct.cfnServiceNetwork(
  id: String,
  props: CfnServiceNetworkProps,
  initializer: @AwsCdkDsl CfnServiceNetwork.() -> Unit,
): CfnServiceNetwork = CfnServiceNetwork(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServiceNetwork(id: String, initializer: @AwsCdkDsl
    CfnServiceNetwork.Builder.() -> Unit): CfnServiceNetwork =
    CfnServiceNetwork.Builder.create(this, id).apply(initializer).build()
