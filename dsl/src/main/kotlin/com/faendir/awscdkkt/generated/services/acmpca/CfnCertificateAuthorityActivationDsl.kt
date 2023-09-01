package com.faendir.awscdkkt.generated.services.acmpca

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnCertificateAuthorityActivation.() -> Unit = {},
): CfnCertificateAuthorityActivation = CfnCertificateAuthorityActivation(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnCertificateAuthorityActivation(id: String, initializer: @AwsCdkDsl
    CfnCertificateAuthorityActivation.Builder.() -> Unit = {}): CfnCertificateAuthorityActivation =
    CfnCertificateAuthorityActivation.Builder.create(this, id).apply(initializer).build()
