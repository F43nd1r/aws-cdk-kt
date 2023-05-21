package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginAccessIdentity
import software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps
import software.constructs.Construct

@Generated
public fun Construct.originAccessIdentity(id: String, initializer: OriginAccessIdentity.() -> Unit =
    {}): OriginAccessIdentity = OriginAccessIdentity(this, id).apply(initializer)

@Generated
public fun Construct.originAccessIdentity(
  id: String,
  props: OriginAccessIdentityProps,
  initializer: OriginAccessIdentity.() -> Unit = {},
): OriginAccessIdentity = OriginAccessIdentity(this, id, props).apply(initializer)
