package com.faendir.awscdkkt.generated.services.medialive

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnNetwork
import software.amazon.awscdk.services.medialive.CfnNetworkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetwork(
  id: String,
  props: CfnNetworkProps,
  initializer: @AwsCdkDsl CfnNetwork.() -> Unit = {},
): CfnNetwork = CfnNetwork(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNetwork(id: String, initializer: @AwsCdkDsl
    CfnNetwork.Builder.() -> Unit = {}): CfnNetwork = CfnNetwork.Builder.create(this,
    id).apply(initializer).build()
