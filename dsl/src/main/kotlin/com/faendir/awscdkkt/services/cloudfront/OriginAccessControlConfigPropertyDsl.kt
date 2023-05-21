package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl

@Generated
public
    fun originAccessControlConfigProperty(initializer: CfnOriginAccessControl.OriginAccessControlConfigProperty.Builder.() -> Unit
    = {}): CfnOriginAccessControl.OriginAccessControlConfigProperty =
    CfnOriginAccessControl.OriginAccessControlConfigProperty.builder().apply(initializer).build()
