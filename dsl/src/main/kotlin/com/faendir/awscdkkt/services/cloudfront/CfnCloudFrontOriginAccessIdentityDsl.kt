package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCloudFrontOriginAccessIdentity(
  id: String,
  props: CfnCloudFrontOriginAccessIdentityProps,
  initializer: CfnCloudFrontOriginAccessIdentity.() -> Unit = {},
): CfnCloudFrontOriginAccessIdentity = CfnCloudFrontOriginAccessIdentity(this, id,
    props).apply(initializer)
