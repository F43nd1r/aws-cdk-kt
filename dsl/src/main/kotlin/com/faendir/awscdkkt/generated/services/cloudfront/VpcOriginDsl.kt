package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.VpcOrigin
import software.amazon.awscdk.services.cloudfront.VpcOriginProps
import software.constructs.Construct

@Generated
public fun Construct.vpcOrigin(
  id: String,
  props: VpcOriginProps,
  initializer: @AwsCdkDsl VpcOrigin.() -> Unit = {},
): VpcOrigin = VpcOrigin(this, id, props).apply(initializer)

@Generated
public fun Construct.buildVpcOrigin(id: String, initializer: @AwsCdkDsl VpcOrigin.Builder.() -> Unit
    = {}): VpcOrigin = VpcOrigin.Builder.create(this, id).apply(initializer).build()
