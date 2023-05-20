@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnClientCertificate
import software.amazon.awscdk.services.apigateway.CfnClientCertificateProps
import software.constructs.Construct

public fun Construct.cfnClientCertificate(id: String, initializer: CfnClientCertificate.() -> Unit =
    {}): CfnClientCertificate = CfnClientCertificate(this, id).apply(initializer)

public fun Construct.cfnClientCertificate(
  id: String,
  props: CfnClientCertificateProps,
  initializer: CfnClientCertificate.() -> Unit = {},
): CfnClientCertificate = CfnClientCertificate(this, id, props).apply(initializer)
