package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnListenerCertificate(id: String, props: CfnListenerCertificateProps):
    CfnListenerCertificate = CfnListenerCertificate(this, id, props)

@Generated
public fun Construct.cfnListenerCertificate(
  id: String,
  props: CfnListenerCertificateProps,
  initializer: @AwsCdkDsl CfnListenerCertificate.() -> Unit,
): CfnListenerCertificate = CfnListenerCertificate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnListenerCertificate(id: String, initializer: @AwsCdkDsl
    CfnListenerCertificate.Builder.() -> Unit): CfnListenerCertificate =
    CfnListenerCertificate.Builder.create(this, id).apply(initializer).build()
