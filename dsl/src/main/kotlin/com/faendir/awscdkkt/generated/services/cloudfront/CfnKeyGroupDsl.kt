package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnKeyGroup
import software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnKeyGroup(
  id: String,
  props: CfnKeyGroupProps,
  initializer: @AwsCdkDsl CfnKeyGroup.() -> Unit = {},
): CfnKeyGroup = CfnKeyGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnKeyGroup(id: String, initializer: @AwsCdkDsl CfnKeyGroup.Builder.() -> Unit = {}): CfnKeyGroup = CfnKeyGroup.Builder.create(this, id).apply(initializer).build()
