package com.faendir.awscdkkt.generated.services.athena

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnSession
import software.amazon.awscdk.services.athena.CfnSessionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSession(
  id: String,
  props: CfnSessionProps,
  initializer: @AwsCdkDsl CfnSession.() -> Unit = {},
): CfnSession = CfnSession(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSession(id: String, initializer: @AwsCdkDsl CfnSession.Builder.() -> Unit = {}): CfnSession = CfnSession.Builder.create(this, id).apply(initializer).build()
