@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl

public
    fun originAccessControlConfigProperty(initializer: CfnOriginAccessControl.OriginAccessControlConfigProperty.Builder.() -> Unit):
    CfnOriginAccessControl.OriginAccessControlConfigProperty =
    CfnOriginAccessControl.OriginAccessControlConfigProperty.builder().apply(initializer).build()
