package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnLogGroup
import software.amazon.awscdk.services.logs.CfnLogGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLogGroup(id: String, initializer: @AwsCdkDsl CfnLogGroup.() -> Unit = {}): CfnLogGroup = CfnLogGroup(this, id).apply(initializer)

@Generated
public fun Construct.cfnLogGroup(
  id: String,
  props: CfnLogGroupProps,
  initializer: @AwsCdkDsl CfnLogGroup.() -> Unit = {},
): CfnLogGroup = CfnLogGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLogGroup(id: String, initializer: @AwsCdkDsl CfnLogGroup.Builder.() -> Unit = {}): CfnLogGroup = CfnLogGroup.Builder.create(this, id).apply(initializer).build()
