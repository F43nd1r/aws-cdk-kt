package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnServiceEnvironment
import software.amazon.awscdk.services.batch.CfnServiceEnvironmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServiceEnvironment(
  id: String,
  props: CfnServiceEnvironmentProps,
  initializer: @AwsCdkDsl CfnServiceEnvironment.() -> Unit = {},
): CfnServiceEnvironment = CfnServiceEnvironment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServiceEnvironment(id: String, initializer: @AwsCdkDsl CfnServiceEnvironment.Builder.() -> Unit = {}): CfnServiceEnvironment = CfnServiceEnvironment.Builder.create(this, id).apply(initializer).build()
