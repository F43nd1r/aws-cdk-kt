package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate

@Generated
public
    fun certificateProperty(initializer: CfnListenerCertificate.CertificateProperty.Builder.() -> Unit
    = {}): CfnListenerCertificate.CertificateProperty =
    CfnListenerCertificate.CertificateProperty.builder().apply(initializer).build()
