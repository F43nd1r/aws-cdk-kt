package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnServerCertificate
import software.amazon.awscdk.services.iam.CfnServerCertificateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServerCertificate(id: String, initializer: CfnServerCertificate.() -> Unit =
    {}): CfnServerCertificate = CfnServerCertificate(this, id).apply(initializer)

@Generated
public fun Construct.cfnServerCertificate(
  id: String,
  props: CfnServerCertificateProps,
  initializer: CfnServerCertificate.() -> Unit = {},
): CfnServerCertificate = CfnServerCertificate(this, id, props).apply(initializer)
