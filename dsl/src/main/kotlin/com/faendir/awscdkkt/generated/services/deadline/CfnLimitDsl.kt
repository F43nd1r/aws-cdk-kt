package com.faendir.awscdkkt.generated.services.deadline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.deadline.CfnLimit
import software.amazon.awscdk.services.deadline.CfnLimitProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLimit(
  id: String,
  props: CfnLimitProps,
  initializer: @AwsCdkDsl CfnLimit.() -> Unit = {},
): CfnLimit = CfnLimit(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLimit(id: String, initializer: @AwsCdkDsl CfnLimit.Builder.() -> Unit = {}): CfnLimit = CfnLimit.Builder.create(this, id).apply(initializer).build()
