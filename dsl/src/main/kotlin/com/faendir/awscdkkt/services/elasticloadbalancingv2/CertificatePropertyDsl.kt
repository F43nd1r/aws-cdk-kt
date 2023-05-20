@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate

public
    fun certificateProperty(initializer: CfnListenerCertificate.CertificateProperty.Builder.() -> Unit):
    CfnListenerCertificate.CertificateProperty =
    CfnListenerCertificate.CertificateProperty.builder().apply(initializer).build()
