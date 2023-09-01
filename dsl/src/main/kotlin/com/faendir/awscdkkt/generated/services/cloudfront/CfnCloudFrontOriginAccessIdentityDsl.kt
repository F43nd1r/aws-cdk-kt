package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnCloudFrontOriginAccessIdentity.() -> Unit = {},
): CfnCloudFrontOriginAccessIdentity = CfnCloudFrontOriginAccessIdentity(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnCloudFrontOriginAccessIdentity(id: String, initializer: @AwsCdkDsl
    CfnCloudFrontOriginAccessIdentity.Builder.() -> Unit = {}): CfnCloudFrontOriginAccessIdentity =
    CfnCloudFrontOriginAccessIdentity.Builder.create(this, id).apply(initializer).build()
