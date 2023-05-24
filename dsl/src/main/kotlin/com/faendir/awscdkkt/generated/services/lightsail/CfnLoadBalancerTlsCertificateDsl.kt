package com.faendir.awscdkkt.generated.services.lightsail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate
import software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLoadBalancerTlsCertificate(id: String,
    props: CfnLoadBalancerTlsCertificateProps): CfnLoadBalancerTlsCertificate =
    CfnLoadBalancerTlsCertificate(this, id, props)

@Generated
public fun Construct.cfnLoadBalancerTlsCertificate(
  id: String,
  props: CfnLoadBalancerTlsCertificateProps,
  initializer: @AwsCdkDsl CfnLoadBalancerTlsCertificate.() -> Unit,
): CfnLoadBalancerTlsCertificate = CfnLoadBalancerTlsCertificate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLoadBalancerTlsCertificate(id: String, initializer: @AwsCdkDsl
    CfnLoadBalancerTlsCertificate.Builder.() -> Unit): CfnLoadBalancerTlsCertificate =
    CfnLoadBalancerTlsCertificate.Builder.create(this, id).apply(initializer).build()
