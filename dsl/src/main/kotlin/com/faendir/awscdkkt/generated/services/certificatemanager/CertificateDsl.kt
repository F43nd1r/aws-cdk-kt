package com.faendir.awscdkkt.generated.services.certificatemanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.Certificate
import software.amazon.awscdk.services.certificatemanager.CertificateProps
import software.constructs.Construct

@Generated
public fun Construct.certificate(
  id: String,
  props: CertificateProps,
  initializer: @AwsCdkDsl Certificate.() -> Unit = {},
): Certificate = Certificate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCertificate(id: String, initializer: @AwsCdkDsl
    Certificate.Builder.() -> Unit = {}): Certificate = Certificate.Builder.create(this,
    id).apply(initializer).build()
