package com.faendir.awscdkkt.generated.services.drs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.drs.CfnSourceNetwork
import software.amazon.awscdk.services.drs.CfnSourceNetworkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSourceNetwork(
  id: String,
  props: CfnSourceNetworkProps,
  initializer: @AwsCdkDsl CfnSourceNetwork.() -> Unit = {},
): CfnSourceNetwork = CfnSourceNetwork(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSourceNetwork(id: String, initializer: @AwsCdkDsl CfnSourceNetwork.Builder.() -> Unit = {}): CfnSourceNetwork = CfnSourceNetwork.Builder.create(this, id).apply(initializer).build()
