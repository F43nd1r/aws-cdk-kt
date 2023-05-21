package com.faendir.awscdkkt.services.certificatemanager

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
  initializer: Certificate.() -> Unit = {},
): Certificate = Certificate(this, id, props).apply(initializer)
