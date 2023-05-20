@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps
import software.constructs.Construct

public fun Construct.cfnListenerCertificate(
  id: String,
  props: CfnListenerCertificateProps,
  initializer: CfnListenerCertificate.() -> Unit = {},
): CfnListenerCertificate = CfnListenerCertificate(this, id, props).apply(initializer)
