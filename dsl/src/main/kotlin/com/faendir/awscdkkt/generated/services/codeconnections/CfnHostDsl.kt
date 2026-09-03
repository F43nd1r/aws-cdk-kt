package com.faendir.awscdkkt.generated.services.codeconnections

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codeconnections.CfnHost
import software.amazon.awscdk.services.codeconnections.CfnHostProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHost(
  id: String,
  props: CfnHostProps,
  initializer: @AwsCdkDsl CfnHost.() -> Unit = {},
): CfnHost = CfnHost(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHost(id: String, initializer: @AwsCdkDsl CfnHost.Builder.() -> Unit = {}): CfnHost = CfnHost.Builder.create(this, id).apply(initializer).build()
