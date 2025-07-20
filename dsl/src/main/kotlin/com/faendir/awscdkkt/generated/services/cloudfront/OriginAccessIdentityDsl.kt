package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginAccessIdentity
import software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps
import software.constructs.Construct

@Generated
public fun Construct.originAccessIdentity(id: String, initializer: @AwsCdkDsl OriginAccessIdentity.() -> Unit = {}): OriginAccessIdentity = OriginAccessIdentity(this, id).apply(initializer)

@Generated
public fun Construct.originAccessIdentity(
  id: String,
  props: OriginAccessIdentityProps,
  initializer: @AwsCdkDsl OriginAccessIdentity.() -> Unit = {},
): OriginAccessIdentity = OriginAccessIdentity(this, id, props).apply(initializer)

@Generated
public fun Construct.buildOriginAccessIdentity(id: String, initializer: @AwsCdkDsl OriginAccessIdentity.Builder.() -> Unit = {}): OriginAccessIdentity = OriginAccessIdentity.Builder.create(this, id).apply(initializer).build()
