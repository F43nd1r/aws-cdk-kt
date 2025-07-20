package com.faendir.awscdkkt.generated.services.msk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnVpcConnection
import software.amazon.awscdk.services.msk.CfnVpcConnectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVpcConnection(
  id: String,
  props: CfnVpcConnectionProps,
  initializer: @AwsCdkDsl CfnVpcConnection.() -> Unit = {},
): CfnVpcConnection = CfnVpcConnection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVpcConnection(id: String, initializer: @AwsCdkDsl CfnVpcConnection.Builder.() -> Unit = {}): CfnVpcConnection = CfnVpcConnection.Builder.create(this, id).apply(initializer).build()
