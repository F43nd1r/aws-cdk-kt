@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnServerCertificate
import software.amazon.awscdk.services.iam.CfnServerCertificateProps
import software.constructs.Construct

public fun Construct.cfnServerCertificate(id: String, initializer: CfnServerCertificate.() -> Unit =
    {}): CfnServerCertificate = CfnServerCertificate(this, id).apply(initializer)

public fun Construct.cfnServerCertificate(
  id: String,
  props: CfnServerCertificateProps,
  initializer: CfnServerCertificate.() -> Unit = {},
): CfnServerCertificate = CfnServerCertificate(this, id, props).apply(initializer)
