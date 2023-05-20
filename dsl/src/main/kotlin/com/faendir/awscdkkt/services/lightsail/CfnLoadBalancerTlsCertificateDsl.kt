@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate
import software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps
import software.constructs.Construct

public fun Construct.cfnLoadBalancerTlsCertificate(
  id: String,
  props: CfnLoadBalancerTlsCertificateProps,
  initializer: CfnLoadBalancerTlsCertificate.() -> Unit = {},
): CfnLoadBalancerTlsCertificate = CfnLoadBalancerTlsCertificate(this, id, props).apply(initializer)
