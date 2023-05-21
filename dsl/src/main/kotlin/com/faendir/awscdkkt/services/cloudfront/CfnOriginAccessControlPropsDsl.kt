package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControlProps

@Generated
public fun cfnOriginAccessControlProps(initializer: CfnOriginAccessControlProps.Builder.() -> Unit =
    {}): CfnOriginAccessControlProps =
    CfnOriginAccessControlProps.builder().apply(initializer).build()
