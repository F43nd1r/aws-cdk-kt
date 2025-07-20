package com.faendir.awscdkkt.generated.services.acmpca

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCertificateAuthority(
  id: String,
  props: CfnCertificateAuthorityProps,
  initializer: @AwsCdkDsl CfnCertificateAuthority.() -> Unit = {},
): CfnCertificateAuthority = CfnCertificateAuthority(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCertificateAuthority(id: String, initializer: @AwsCdkDsl CfnCertificateAuthority.Builder.() -> Unit = {}): CfnCertificateAuthority = CfnCertificateAuthority.Builder.create(this, id).apply(initializer).build()
