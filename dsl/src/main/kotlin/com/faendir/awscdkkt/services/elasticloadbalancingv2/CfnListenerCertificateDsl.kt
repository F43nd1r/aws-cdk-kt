package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnListenerCertificate(
  id: String,
  props: CfnListenerCertificateProps,
  initializer: CfnListenerCertificate.() -> Unit = {},
): CfnListenerCertificate = CfnListenerCertificate(this, id, props).apply(initializer)
