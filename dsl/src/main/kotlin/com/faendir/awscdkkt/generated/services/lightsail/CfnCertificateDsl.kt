package com.faendir.awscdkkt.generated.services.lightsail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnCertificate
import software.amazon.awscdk.services.lightsail.CfnCertificateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCertificate(
  id: String,
  props: CfnCertificateProps,
  initializer: @AwsCdkDsl CfnCertificate.() -> Unit = {},
): CfnCertificate = CfnCertificate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCertificate(id: String, initializer: @AwsCdkDsl
    CfnCertificate.Builder.() -> Unit = {}): CfnCertificate = CfnCertificate.Builder.create(this,
    id).apply(initializer).build()
