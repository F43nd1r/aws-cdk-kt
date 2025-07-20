package com.faendir.awscdkkt.generated.cloudformation.include

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cloudformation.include.CfnInclude
import software.amazon.awscdk.cloudformation.include.CfnIncludeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInclude(
  id: String,
  props: CfnIncludeProps,
  initializer: @AwsCdkDsl CfnInclude.() -> Unit = {},
): CfnInclude = CfnInclude(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInclude(id: String, initializer: @AwsCdkDsl CfnInclude.Builder.() -> Unit = {}): CfnInclude = CfnInclude.Builder.create(this, id).apply(initializer).build()
