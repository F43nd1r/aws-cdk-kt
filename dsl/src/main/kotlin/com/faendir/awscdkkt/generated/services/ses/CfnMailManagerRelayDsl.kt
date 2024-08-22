package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnMailManagerRelay
import software.amazon.awscdk.services.ses.CfnMailManagerRelayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMailManagerRelay(
  id: String,
  props: CfnMailManagerRelayProps,
  initializer: @AwsCdkDsl CfnMailManagerRelay.() -> Unit = {},
): CfnMailManagerRelay = CfnMailManagerRelay(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMailManagerRelay(id: String, initializer: @AwsCdkDsl
    CfnMailManagerRelay.Builder.() -> Unit = {}): CfnMailManagerRelay =
    CfnMailManagerRelay.Builder.create(this, id).apply(initializer).build()
