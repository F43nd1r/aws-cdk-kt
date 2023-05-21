package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCertificateAuthorityActivation(
  id: String,
  props: CfnCertificateAuthorityActivationProps,
  initializer: CfnCertificateAuthorityActivation.() -> Unit = {},
): CfnCertificateAuthorityActivation = CfnCertificateAuthorityActivation(this, id,
    props).apply(initializer)
