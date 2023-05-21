package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity

@Generated
public
    fun cloudFrontOriginAccessIdentityConfigProperty(initializer: CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.Builder.() -> Unit
    = {}): CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty =
    CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.builder().apply(initializer).build()
