@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps
import software.constructs.Construct

public fun Construct.cfnCertificateAuthorityActivation(
  id: String,
  props: CfnCertificateAuthorityActivationProps,
  initializer: CfnCertificateAuthorityActivation.() -> Unit = {},
): CfnCertificateAuthorityActivation = CfnCertificateAuthorityActivation(this, id,
    props).apply(initializer)
