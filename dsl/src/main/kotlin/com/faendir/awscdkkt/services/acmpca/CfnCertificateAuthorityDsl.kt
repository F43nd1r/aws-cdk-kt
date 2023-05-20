@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps
import software.constructs.Construct

public fun Construct.cfnCertificateAuthority(
  id: String,
  props: CfnCertificateAuthorityProps,
  initializer: CfnCertificateAuthority.() -> Unit = {},
): CfnCertificateAuthority = CfnCertificateAuthority(this, id, props).apply(initializer)
