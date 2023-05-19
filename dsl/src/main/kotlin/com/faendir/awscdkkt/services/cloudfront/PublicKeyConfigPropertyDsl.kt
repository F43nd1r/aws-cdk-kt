@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnPublicKey

public
    fun publicKeyConfigProperty(initializer: CfnPublicKey.PublicKeyConfigProperty.Builder.() -> Unit):
    CfnPublicKey.PublicKeyConfigProperty =
    CfnPublicKey.PublicKeyConfigProperty.builder().apply(initializer).build()
