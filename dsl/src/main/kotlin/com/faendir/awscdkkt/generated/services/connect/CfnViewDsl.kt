package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnView
import software.amazon.awscdk.services.connect.CfnViewProps
import software.constructs.Construct

@Generated
public fun Construct.cfnView(
  id: String,
  props: CfnViewProps,
  initializer: @AwsCdkDsl CfnView.() -> Unit = {},
): CfnView = CfnView(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnView(id: String, initializer: @AwsCdkDsl CfnView.Builder.() -> Unit =
    {}): CfnView = CfnView.Builder.create(this, id).apply(initializer).build()
