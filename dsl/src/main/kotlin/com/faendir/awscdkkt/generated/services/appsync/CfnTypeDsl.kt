package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnType
import software.amazon.awscdk.services.appsync.CfnTypeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnType(
  id: String,
  props: CfnTypeProps,
  initializer: @AwsCdkDsl CfnType.() -> Unit = {},
): CfnType = CfnType(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnType(id: String, initializer: @AwsCdkDsl CfnType.Builder.() -> Unit = {}): CfnType = CfnType.Builder.create(this, id).apply(initializer).build()
