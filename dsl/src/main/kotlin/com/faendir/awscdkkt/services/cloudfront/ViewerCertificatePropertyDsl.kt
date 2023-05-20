@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

public
    fun viewerCertificateProperty(initializer: CfnDistribution.ViewerCertificateProperty.Builder.() -> Unit):
    CfnDistribution.ViewerCertificateProperty =
    CfnDistribution.ViewerCertificateProperty.builder().apply(initializer).build()
