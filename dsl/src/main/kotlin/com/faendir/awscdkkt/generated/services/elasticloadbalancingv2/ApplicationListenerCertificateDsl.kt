package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps
import software.constructs.Construct

@Generated
public fun Construct.applicationListenerCertificate(
  id: String,
  props: ApplicationListenerCertificateProps,
  initializer: @AwsCdkDsl ApplicationListenerCertificate.() -> Unit = {},
): ApplicationListenerCertificate = ApplicationListenerCertificate(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildApplicationListenerCertificate(id: String, initializer: @AwsCdkDsl
    ApplicationListenerCertificate.Builder.() -> Unit = {}): ApplicationListenerCertificate =
    ApplicationListenerCertificate.Builder.create(this, id).apply(initializer).build()
