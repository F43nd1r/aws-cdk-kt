package com.faendir.awscdkkt.generated.services.ssm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnSession
import software.amazon.awscdk.services.ssm.CfnSessionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSession(id: String, initializer: @AwsCdkDsl CfnSession.() -> Unit = {}): CfnSession = CfnSession(this, id).apply(initializer)

@Generated
public fun Construct.cfnSession(
  id: String,
  props: CfnSessionProps,
  initializer: @AwsCdkDsl CfnSession.() -> Unit = {},
): CfnSession = CfnSession(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSession(id: String, initializer: @AwsCdkDsl CfnSession.Builder.() -> Unit = {}): CfnSession = CfnSession.Builder.create(this, id).apply(initializer).build()
