@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnPublicKey

public
    fun publicKeyConfigProperty(initializer: CfnPublicKey.PublicKeyConfigProperty.Builder.() -> Unit):
    CfnPublicKey.PublicKeyConfigProperty =
    CfnPublicKey.PublicKeyConfigProperty.builder().apply(initializer).build()
