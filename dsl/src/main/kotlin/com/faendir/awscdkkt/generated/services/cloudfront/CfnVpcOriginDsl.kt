package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnVpcOrigin
import software.amazon.awscdk.services.cloudfront.CfnVpcOriginProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVpcOrigin(
  id: String,
  props: CfnVpcOriginProps,
  initializer: @AwsCdkDsl CfnVpcOrigin.() -> Unit = {},
): CfnVpcOrigin = CfnVpcOrigin(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVpcOrigin(id: String, initializer: @AwsCdkDsl CfnVpcOrigin.Builder.() -> Unit = {}): CfnVpcOrigin = CfnVpcOrigin.Builder.create(this, id).apply(initializer).build()
