@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps
import software.constructs.Construct

public fun Construct.applicationListenerCertificate(
  id: String,
  props: ApplicationListenerCertificateProps,
  initializer: ApplicationListenerCertificate.() -> Unit = {},
): ApplicationListenerCertificate = ApplicationListenerCertificate(this, id,
    props).apply(initializer)
